// Spanish replaced with english
package net.sf.memoranda.util;

import nu.xom.Element;

public class PriorityQueue {
        
	
		/* Priority Queue implementation with a Heap Data Structure
		 * to order the annotations by priority.
		 * 
		 * Method names have been changed to english.
		 * PriorityQueue was only called in AgendaGenerator so
		 * it was easy to change the method calls.
		 */
	
	
        
        private Pair[] a;
        private int n;
        
        
        /**
         * PrioityQueue Constructor
         *
         * @param size The number of elements in the pq.
         */
        public PriorityQueue(int size){
                a = new Pair[size+2];
                n = 0;
        }
        
        /**
         * Inserts a new element into the pq.
         * 
         * @param x Is the object being inserted.
         */
        public void insert(Pair x){
                ++n;
                a[n]=x;
                for(int j=n; j>1 && a[j].getPriority() < a[j/2].getPriority(); j/=2)
                {
                        Pair t = a[j];
                        a[j] = a[j/2];
                        a[j/2] = t;
                }
        }
        
        /**
         * Returns the element with the highest priority.
         * 
         * @return The element with the highest priority.
         */
        public Element extract(){
                if(!this.Empty()){
                        Element m = a[1].getElement();  
                        a[1] = a[n];
                        --n;
                        int j = 1;
                        while(2*j<=n)
                        {
                                int k=2*j;
                                if(k+1<=n && a[k+1].getPriority() < a[k].getPriority())
                                        k=k+1;  
                                if(a[j].getPriority() < a[k].getPriority())
                                        break;
                                Pair t = a[j]; 
                                a[j] = a[k];
                                a[k] = t;  
                                j = k;
                        }
                        return m;
                }
                else 
                        return null;
        }
        
        /**
         * Returns true if the pq is empty
         * 
         * @return true if empty.
         */
        public boolean Empty(){
                return n==0;
        }

}