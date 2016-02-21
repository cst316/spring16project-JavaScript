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
import java.awt.Font;
import java.awt.Insets;
import java.io.File;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * PSPTimeRecording is a UI component that allows users to
 * record their time logs while working on a project.
 * Time Recording is a part of the Personal Software Process
 * and is a component of the PSP Docs category.
 * 
 * This component is essentially a grid that allows the user
 * to enter dates, start times, end times, phase of process,
 * and any additional comments. 
 * 
 * @author Casey Vanderham
 * @version 2/16/2016
 */

public class PSPTimeRecording extends JPanel {
	
    //Initializing the labels
	JLabel title = new JLabel("PSP Time Recording Log");
	JLabel date = new JLabel("Date");
	JLabel start = new JLabel("Start");
	JLabel stop = new JLabel("Stop");
	JLabel interruption = new JLabel("PSP Time Recording");
	JLabel delta = new JLabel("Delta Time");
	JLabel phase = new JLabel("Phase");
	JLabel comments = new JLabel("Comments");
	
	//Initializing the date text fields
	JTextField date1 = new JTextField(10);
	JTextField date2 = new JTextField(10);
	JTextField date3 = new JTextField(10);
	JTextField date4 = new JTextField(10);
	JTextField date5 = new JTextField(10);
	JTextField date6 = new JTextField(10);
	JTextField date7 = new JTextField(10);
	JTextField date8 = new JTextField(10);
	JTextField date9 = new JTextField(10);
	JTextField date10 = new JTextField(10);
	
	//Initizlizing the start text fields
	JTextField start1 = new JTextField(6);
	JTextField start2 = new JTextField(6);
	JTextField start3 = new JTextField(6);
	JTextField start4 = new JTextField(6);
	JTextField start5 = new JTextField(6);
	JTextField start6 = new JTextField(6);
	JTextField start7 = new JTextField(6);
	JTextField start8 = new JTextField(6);
	JTextField start9 = new JTextField(6);
	JTextField start10 = new JTextField(6);
	
	//Initialzing the stop text fields
	JTextField stop1 = new JTextField(6);
	JTextField stop2 = new JTextField(6);
	JTextField stop3 = new JTextField(6);
	JTextField stop4 = new JTextField(6);
	JTextField stop5 = new JTextField(6);
	JTextField stop6 = new JTextField(6);
	JTextField stop7 = new JTextField(6);
	JTextField stop8 = new JTextField(6);
	JTextField stop9 = new JTextField(6);
	JTextField stop10 = new JTextField(6);
	
	//Initialzing the intteruopt text fields
	JTextField interrupt1 = new JTextField(6);
	JTextField interrupt2 = new JTextField(6);
	JTextField interrupt3 = new JTextField(6);
	JTextField interrupt4 = new JTextField(6);
	JTextField interrupt5 = new JTextField(6);
	JTextField interrupt6 = new JTextField(6);
	JTextField interrupt7 = new JTextField(6);
	JTextField interrupt8 = new JTextField(6);
	JTextField interrupt9 = new JTextField(6);
	JTextField interrupt10 = new JTextField(6);
	
	//Initialzing the delta text fields
	JTextField delta1 = new JTextField(6);
	JTextField delta2 = new JTextField(6);
	JTextField delta3 = new JTextField(6);
	JTextField delta4 = new JTextField(6);
	JTextField delta5 = new JTextField(6);
	JTextField delta6 = new JTextField(6);
	JTextField delta7 = new JTextField(6);
	JTextField delta8 = new JTextField(6);
	JTextField delta9 = new JTextField(6);
	JTextField delta10 = new JTextField(6);
	
	//Initializing the phase text fields
	JTextField phase1 = new JTextField(10);
	JTextField phase2 = new JTextField(10);
	JTextField phase3 = new JTextField(10);
	JTextField phase4 = new JTextField(10);
	JTextField phase5 = new JTextField(10);
	JTextField phase6 = new JTextField(10);
	JTextField phase7 = new JTextField(10);
	JTextField phase8 = new JTextField(10);
	JTextField phase9 = new JTextField(10);
	JTextField phase10 = new JTextField(10);
	
	//Initialzing the comments text fields
	JTextField comments1 = new JTextField(25);
	JTextField comments2 = new JTextField(25);
	JTextField comments3 = new JTextField(25);
	JTextField comments4 = new JTextField(25);
	JTextField comments5 = new JTextField(25);
	JTextField comments6 = new JTextField(25);
	JTextField comments7 = new JTextField(25);
	JTextField comments8 = new JTextField(25);
	JTextField comments9 = new JTextField(25);
	JTextField comments10 = new JTextField(25);
	
    public PSPTimeRecording() {
    	
        try {
            jbInit();
                        
        }
        catch (Exception ex) {
           new ExceptionDialog(ex);
        }
    }
    
    
    void jbInit() throws Exception {
        this.setLayout(null);
        Insets insets = this.getInsets();
        
        Font titleFont = new Font("Courier", Font.BOLD, 35);
        title.setFont(titleFont);
        Dimension titleSize = title.getPreferredSize();
        title.setBounds(25 + insets.left, 15 + insets.top, titleSize.width, titleSize.height);
        
        this.add(title);
    }
}