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
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.SwingConstants;

/*$Id: ResourcesPanel.java,v 1.13 2007/03/20 08:22:41 alexeya Exp $*/
public class PSP0 extends JPanel {
    
    public PSP0() {
    	
        try {
            jbInit();
                        
        }
        catch (FileNotFoundException e){
        	System.out.println("File not found!");
        }
        catch (Exception ex) {
           new ExceptionDialog(ex);
        }
    }
    void jbInit() throws Exception {
        setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1242, 1172);
        add(panel);
        panel.setLayout(null);
        
        JTextPane PSP0Learn = new JTextPane();
        PSP0Learn.setBounds(0, 0, 675, 400);
        PSP0Learn.setFont(new Font("Arial", Font.PLAIN, 17));
        PSP0Learn.setText("Software Engineers will go through three phases during the Personal Software "
        		+ "\nProcess 0 (PSP0), that is planning, development, and postmortem. During the "
        		+ "\nplanning phase you will produce a requirements statement. This is basically a "
        		+ "\nstatement on what you need to make your project presentable. Then you will estimate "
        		+ "\nthe required development time. You will want to make the best guess you can. Don’t "
        		+ "\ncount time that you are not developing code. Next, enter the plan data in the Project "
        		+ "\nPlan Summary form (Look at the example image). Lastly, complete the Time Recording "
        		+ "\nlog (also a sample image).\r\rDuring the development phase you will first design "
        		+ "\nyour program. This is all about coding.  While you code, fill out the time recording "
        		+ "\nlog and fix the bugs in your code. (This is the easy part)\r\rDuring the postmortem "
        		+ "\nphase you will compare the plan from the planning phase to what the actual outcome was. "
        		+ "\nThis will help you improve further on in the project. All this phase is finishing the "
        		+ "\nProject Plan Summary form.");
        PSP0Learn.setEditable(false);
        panel.add(PSP0Learn);
        
        JLabel PSPTimeRec = new JLabel("");
        PSPTimeRec.setBounds(0, 405, 724, 776);
        panel.add(PSPTimeRec);
        PSPTimeRec.setHorizontalAlignment(SwingConstants.CENTER);
        PSPTimeRec.setIcon(new ImageIcon(PSP0.class.getResource("/net/sf/memoranda/ui/resources/PSPTimeRecording.png")));
        
        JLabel PSPProjSum = new JLabel("");
        PSPProjSum.setBounds(450, 0, 800, 793);
        panel.add(PSPProjSum);
        PSPProjSum.setVerticalAlignment(SwingConstants.TOP);
        PSPProjSum.setIcon(new ImageIcon(PSP0.class.getResource("/net/sf/memoranda/ui/resources/PSP0 PSform.png")));
        PSPProjSum.setHorizontalAlignment(SwingConstants.RIGHT);
    }
}