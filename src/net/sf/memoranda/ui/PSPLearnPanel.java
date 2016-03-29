package net.sf.memoranda.ui;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.imageio.ImageIO;
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
import javax.swing.text.StyledDocument;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;

import net.sf.memoranda.CurrentProject;
import net.sf.memoranda.Resource;
import net.sf.memoranda.util.AppList;
import net.sf.memoranda.util.CurrentStorage;
import net.sf.memoranda.util.Local;
import net.sf.memoranda.util.MimeType;
import net.sf.memoranda.util.MimeTypesList;
import net.sf.memoranda.util.Util;

import java.io.*;
import java.awt.Font;

/*$Id: ResourcesPanel.java,v 1.13 2007/03/20 08:22:41 alexeya Exp $*/
public class PSPLearnPanel extends JPanel {
    BorderLayout borderLayout1 = new BorderLayout();
	
	PSP1Learn psp1 = new PSP1Learn();
	
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
       
       
        add(tabbedPane);
        
        JPanel panel = new JPanel();
        tabbedPane.addTab("PSP1 Learn", null, panel, null);
        
        JTextPane PSP1LearnExplanation = new JTextPane();
        PSP1LearnExplanation.setEditable(false);
        PSP1LearnExplanation.setContentType("");
        PSP1LearnExplanation.setForeground(Color.BLACK);
        PSP1LearnExplanation.setFont(new Font("Arial", Font.PLAIN, 20));
        PSP1LearnExplanation.setText("PSP1 is all about estimating and planning. You will take the data from PSP0 and use it "
        		+ "\nto estimate how long your new project will take, then you "
        		+ "\nwill prpare a test report. Look at the image below to see what an example of a blank "
        		+ "\ntest report looks like. The Accumulated data from previous projects are used to estimate "
        		+ "\nthe total time of the new project. After you code you will then write the actual time spent next "
        		+ "\nto the estimated time. This comparison is then used for creating a schedule for planning "
        		+ "\nthe rest of the project.");
        
        ImageIcon pic = new ImageIcon("PSP1.png");
        panel.add(PSP1LearnExplanation);
        JLabel label = new JLabel(new ImageIcon("/Users/vvarela15/git/spring16project-JavaScript/src/net/sf/memoranda/ui/resources/PSP1.png"));
        label.setHorizontalAlignment(SwingConstants.LEADING);
        label.setVerticalAlignment(SwingConstants.BOTTOM);
        panel.add(label);
    }
       	
 }