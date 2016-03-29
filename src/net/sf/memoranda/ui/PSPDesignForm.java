package net.sf.memoranda.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
//new SwingPaint().show();
//btnNew.addActionListener(new java.awt.event.ActionListener() {
	//public void actionPerformed(ActionEvent e) {
		//new SwingPaint().show();
	//}
//});

/*$Id: ResourcesPanel.java,v 1.13 2007/03/20 08:22:41 alexeya Exp $*/
public class PSPDesignForm extends JPanel{
    BorderLayout borderLayout1 = new BorderLayout();
    JToolBar toolBar = new JToolBar();
    JButton btnNew = new JButton("New");
    
   
    		
    
    JPanel panelb = new JPanel();
    
    
    
	
    public PSPDesignForm() {
    
        try {
            jbInit();
            
                        
        }
        catch (Exception ex) {
           new ExceptionDialog(ex);
        }
    }
    void jbInit() throws Exception {
        this.setLayout(borderLayout1);
        add(panelb);
        panelb.add(btnNew);
       
       
   
    }
    public void actionPreformed(ActionEvent z){
    	Object src = z.getSource();
    	if(src==btnNew){
    		System.out.println("hi");
    	}
    }
}