package net.sf.memoranda.ui;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
import net.sf.memoranda.util.AppList;
import net.sf.memoranda.util.CurrentStorage;
import net.sf.memoranda.util.Local;
import net.sf.memoranda.util.MimeType;
import net.sf.memoranda.util.MimeTypesList;
import net.sf.memoranda.util.Util;

import java.io.*;

/*$Id: ResourcesPanel.java,v 1.13 2007/03/20 08:22:41 alexeya Exp $*/
public class PSPLearnPanel extends JPanel {
	BorderLayout borderLayout1 = new BorderLayout();
	
	PSP0 projectSummaryPanel = new PSP0();
	PSP1 designFormPanel = new PSP1();
	PSP2Example timeRecordingPanel = new PSP2Example();
	
    JTabbedPane tabbedPane = new JTabbedPane();

    public PSPLearnPanel() {
        try {
            jbInit();
        }
        catch (Exception ex) {
           new ExceptionDialog(ex);
        }
    }
    
    void jbInit() throws Exception {
    	
        this.setLayout(borderLayout1);

        tabbedPane.add("PSP0", projectSummaryPanel);
        tabbedPane.add("PSP1", designFormPanel);
        tabbedPane.add("PSP2", timeRecordingPanel);
        
        add(tabbedPane);
    }
       	
 }