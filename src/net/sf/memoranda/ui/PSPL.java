package net.sf.memoranda.ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import net.sf.memoranda.util.Context;
import net.sf.memoranda.util.Local;

public class PSPL extends JPanel {
    BorderLayout borderLayout1 = new BorderLayout();
	
    JTabbedPane tabbedPane = new JTabbedPane();

    public PSPL() {
        try { 
            jbInit();
        }
        catch (Exception ex) {
           new ExceptionDialog(ex);
        }
    }
    
    void jbInit() throws Exception {
    	
        this.setLayout(borderLayout1);
        
    }
       	
 }
