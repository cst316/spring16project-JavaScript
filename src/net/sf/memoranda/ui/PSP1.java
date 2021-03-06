package net.sf.memoranda.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import net.sf.memoranda.CurrentProject;
import net.sf.memoranda.Resource;
import net.sf.memoranda.ui.ResourcesPanel.PopupListener;
import net.sf.memoranda.util.AppList;
import net.sf.memoranda.util.CurrentStorage;
import net.sf.memoranda.util.Local;
import net.sf.memoranda.util.MimeType;
import net.sf.memoranda.util.MimeTypesList;
import net.sf.memoranda.util.Util;

import java.io.*;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

/*$Id: ResourcesPanel.java,v 1.13 2007/03/20 08:22:41 alexeya Exp $*/
public class PSP1 extends JPanel {
    BorderLayout borderLayout1 = new BorderLayout();
    
    public PSP1() {
    	
        try {
            jbInit();
                        
        }
        catch (FileNotFoundException e){
        	System.out.println("FileNotFound!");
        }
        catch (Exception ex) {
           new ExceptionDialog(ex);
        }
    }
    void jbInit() throws Exception {
        this.setLayout(borderLayout1);
        
        JPanel panel = new JPanel();
        add(panel, BorderLayout.NORTH);
        
        JTextPane PSP1Example = new JTextPane();
        PSP1Example.setEditable(false);
        PSP1Example.setFont(new Font("Arial", Font.PLAIN, 17));
        PSP1Example.setText("Requirements: Engineers start planning by defining the work that needs to be done "
         		+ "\nin as much detail as possible. If all they have is a one-sentence requirements statement, then that"
         		+ "\nstatement must be the basis for the plan. Of course, the accuracy of the estimate and plan is"
         		+ "\nheavily influenced by how much the engineers know about the work to be done.\n"
         		+ "\nConceptual Design: To make an estimate and a plan, engineers first define how the product"
         		+ "\nis to be designed and built. However, since the planning phase is too early to produce a complete"
         		+ "\nproduct design, engineers produce what is called a conceptual design. This is a first,"
         		+ "\nrough guess at what the product would look like if the engineers had to build it based on what"
         		+ "\nthey currently know. Later, during the design phase, the engineers examine design alternatives"
         		+ "\nand produce a complete product design.\n"
         		+ "\nEstimate Product Size and Resources. The correlation of program size with development"
         		+ "\ntime is only moderately good for engineering teams and organizations. However, for individual engineers,"
         		+ "\nthe correlation is generally quite high. Therefore, the PSP starts with engineers estimating the sizes "
         		+ "\nof the products they will personally develop. Then, based on their personal size and productivity data,"
         		+ "\nthe engineers estimate the time required to do the work. In the PSP, these size and resource estimates are"
         		+ "\n made with the PROBE method. Displayed is an example of a PSP1 worksheet.\n\n\n"
         		+ "Humphrey, Watts S. \"Personal Software Process (PSP).\" Encyclopedia of Software Engineering (2002):\n"
         		+ " n. pag. Web. 28 Mar. 2016."
);
        
        JLabel PSP1Pic = new JLabel("");
        PSP1Pic.setFont(new Font("Arial", Font.PLAIN, 10));
        PSP1Pic.setIcon(new ImageIcon(PSP1.class.getResource("/net/sf/memoranda/ui/resources/PSP1.png")));
        PSP1Pic.setHorizontalAlignment(SwingConstants.RIGHT);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel.add(PSP1Example);
        panel.add(PSP1Pic);
    }
}