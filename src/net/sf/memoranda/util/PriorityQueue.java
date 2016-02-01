// Spanish replaced with english
package net.sf.memoranda.util;

import nu.xom.Element;

public class PriorityQueue {
        
	
		/* Priority Queue implementation with a Heap Data Structure
		 * to order the annotations by priority.
		 * 
		 * Still need to change the method names here and where ever
		 * this class is instanced.
		 */
	
	
        
        private Pair[] a;
        private int n;
        
        public PriorityQueue(int size){
                a = new Pair[size+2];
                n = 0;
        }
        
        //Insert
        public void insertar(Pair x){
                ++n;
                a[n]=x;
                for(int j=n; j>1 && a[j].getPriority() < a[j/2].getPriority(); j/=2)
                {
                        Pair t = a[j];
                        a[j] = a[j/2];
                        a[j/2] = t;
                }
        }
        
        //Extract
        public Element extraer(){
                if(!this.Vacia()){
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
        
        //Empty
        public boolean Vacia(){
                return n==0;
        }

}