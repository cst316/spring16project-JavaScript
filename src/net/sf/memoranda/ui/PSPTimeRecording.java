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
	JLabel title = new JLabel("PSP0 Time Recording Log");
	JLabel date = new JLabel("Date");
	JLabel start = new JLabel("Start");
	JLabel stop = new JLabel("Stop");
	JLabel interruption = new JLabel("PSP Time Recording");		//Not sure if we need this
	JLabel delta = new JLabel("Delta Time");					//Same as this
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
	JTextField start1 = new JTextField(10);
	JTextField start2 = new JTextField(10);
	JTextField start3 = new JTextField(10);
	JTextField start4 = new JTextField(10);
	JTextField start5 = new JTextField(10);
	JTextField start6 = new JTextField(10);
	JTextField start7 = new JTextField(10);
	JTextField start8 = new JTextField(10);
	JTextField start9 = new JTextField(10);
	JTextField start10 = new JTextField(10);
	
	//Initialzing the stop text fields
	JTextField stop1 = new JTextField(10);
	JTextField stop2 = new JTextField(10);
	JTextField stop3 = new JTextField(10);
	JTextField stop4 = new JTextField(10);
	JTextField stop5 = new JTextField(10);
	JTextField stop6 = new JTextField(10);
	JTextField stop7 = new JTextField(10);
	JTextField stop8 = new JTextField(10);
	JTextField stop9 = new JTextField(10);
	JTextField stop10 = new JTextField(10);
	
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
        
        //Title label
        Font titleFont = new Font("Courier", Font.BOLD, 35);
        title.setFont(titleFont);
        Dimension titleSize = title.getPreferredSize();
        title.setBounds(25 + insets.left, 15 + insets.top, titleSize.width, titleSize.height);
        
        //Date label
        Font dateFont = new Font("Courier", Font.BOLD, 20);
        date.setFont(dateFont);
        Dimension dateSize = date.getPreferredSize();
        date.setBounds(60 + insets.left, 80 + insets.top, dateSize.width, dateSize.height);
        
        //Start label
        start.setFont(dateFont);
        Dimension startSize = start.getPreferredSize();
        start.setBounds(100 + insets.left + dateSize.width, 80 + insets.top, startSize.width, startSize.height);
        
        //Date text fields
        date1.setSize(12, 45);
        Font date1Font = new Font("Courier", Font.PLAIN, 12);
        date1.setFont(date1Font);
        Dimension date1Size = date1.getPreferredSize();
        date1.setBounds(60 + insets.left, 40 + dateSize.height + titleSize.height + insets.top, date1Size.width, date1Size.height);
        
        date2.setSize(12, 45);
        date2.setFont(date1Font);
        Dimension date2Size = date2.getPreferredSize();
        date2.setBounds(60 + insets.left, 40 + date1Size.height + dateSize.height + titleSize.height + insets.top, date1Size.width, date1Size.height);
        
        date3.setSize(12, 45);
        date3.setFont(date1Font);
        Dimension date3Size = date3.getPreferredSize();
        date3.setBounds(60 + insets.left, 40 + date1Size.height + date2Size.height + dateSize.height + titleSize.height + insets.top, date1Size.width, date1Size.height);
        
        date4.setSize(12, 45);
        date4.setFont(date1Font);
        Dimension date4Size = date4.getPreferredSize();
        date4.setBounds(60 + insets.left, 40 + date3Size.height + date1Size.height + date2Size.height + dateSize.height + titleSize.height + insets.top, date1Size.width, date1Size.height);
        
        date5.setSize(12, 45);
        date5.setFont(date1Font);
        Dimension date5Size = date5.getPreferredSize();
        date5.setBounds(60 + insets.left, 40 + date4Size.height + date3Size.height + date1Size.height + date2Size.height + dateSize.height + titleSize.height + insets.top, date1Size.width, date1Size.height);
     
        date6.setSize(12, 45);
        date6.setFont(date1Font);
        Dimension date6Size = date6.getPreferredSize();
        date6.setBounds(60 + insets.left, 40 + date5Size.height + date4Size.height + date3Size.height + date1Size.height + date2Size.height + dateSize.height + titleSize.height + insets.top, date1Size.width, date1Size.height);
        
        date7.setSize(12, 45);
        date7.setFont(date1Font);
        Dimension date7Size = date7.getPreferredSize();
        date7.setBounds(60 + insets.left, 40 + date6Size.height + date5Size.height + date4Size.height + date3Size.height + date1Size.height + date2Size.height + dateSize.height + titleSize.height + insets.top, date1Size.width, date1Size.height);
        
        date8.setSize(12, 45);
        date8.setFont(date1Font);
        Dimension date8Size = date8.getPreferredSize();
        date8.setBounds(60 + insets.left, 40 + date7Size.height + date6Size.height + date5Size.height + date4Size.height + date3Size.height + date1Size.height + date2Size.height + dateSize.height + titleSize.height + insets.top, date1Size.width, date1Size.height);
        
        date9.setSize(12, 45);
        date9.setFont(date1Font);
        Dimension date9Size = date9.getPreferredSize();
        date9.setBounds(60 + insets.left, 40 + date8Size.height + date7Size.height + date6Size.height + date5Size.height + date4Size.height + date3Size.height + date1Size.height + date2Size.height + dateSize.height + titleSize.height + insets.top, date1Size.width, date1Size.height);
        
        date10.setSize(12, 45);
        date10.setFont(date1Font);
        Dimension date10Size = date10.getPreferredSize();
        date10.setBounds(60 + insets.left, 40 + date9Size.height + date8Size.height + date7Size.height + date6Size.height + date5Size.height + date4Size.height + date3Size.height + date1Size.height + date2Size.height + dateSize.height + titleSize.height + insets.top, date1Size.width, date1Size.height);
        
        //Start text fields
        start1.setSize(12, 45);
        start1.setFont(date1Font);
        Dimension start1Size = start1.getPreferredSize();
        start1.setBounds(70 + insets.left + date1Size.width, 40 + startSize.height + titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        start2.setSize(12, 45);
        start2.setFont(date1Font);
        Dimension start2Size = start2.getPreferredSize();
        start2.setBounds(70 + insets.left + date1Size.width, 40 + start1Size.height + startSize.height + titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        start3.setSize(12, 45);
        start3.setFont(date1Font);
        Dimension start3Size = start3.getPreferredSize();
        start3.setBounds(70 + insets.left + date1Size.width, 40 + start2Size.height + start1Size.height + startSize.height + titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        start4.setSize(12, 45);
        start4.setFont(date1Font);
        Dimension start4Size = start4.getPreferredSize();
        start4.setBounds(70 + insets.left + date1Size.width, 40 + start3Size.height + start2Size.height + start1Size.height + startSize.height + titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        start5.setSize(12, 45);
        start5.setFont(date1Font);
        Dimension start5Size = start5.getPreferredSize();
        start5.setBounds(70 + insets.left + date1Size.width, 40 + start4Size.height + start3Size.height + start2Size.height + start1Size.height + startSize.height + titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        start6.setSize(12, 45);
        start6.setFont(date1Font);
        Dimension start6Size = start6.getPreferredSize();
        start6.setBounds(70 + insets.left + date1Size.width, 40 + start5Size.height + start4Size.height + start3Size.height + start2Size.height + start1Size.height + startSize.height + titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        start7.setSize(12, 45);
        start7.setFont(date1Font);
        Dimension start7Size = start7.getPreferredSize();
        start7.setBounds(70 + insets.left + date1Size.width, 40 + start6Size.height + start5Size.height + start4Size.height + start3Size.height + start2Size.height + start1Size.height + startSize.height + titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        start8.setSize(12, 45);
        start8.setFont(date1Font);
        Dimension start8Size = start8.getPreferredSize();
        start8.setBounds(70 + insets.left + date1Size.width, 40 + start7Size.height + start6Size.height + start5Size.height + start4Size.height + start3Size.height + start2Size.height + start1Size.height + startSize.height + titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        start9.setSize(12, 45);
        start9.setFont(date1Font);
        Dimension start9Size = start9.getPreferredSize();
        start9.setBounds(70 + insets.left + date1Size.width, 40 + start8Size.height + start7Size.height + start6Size.height + start5Size.height + start4Size.height + start3Size.height + start2Size.height + start1Size.height + startSize.height + titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        start10.setSize(12, 45);
        start10.setFont(date1Font);
        Dimension start10Size = start10.getPreferredSize();
        start10.setBounds(70 + insets.left + date1Size.width, 40 + start9Size.height + start8Size.height + start7Size.height + start6Size.height + start5Size.height + start4Size.height + start3Size.height + start2Size.height + start1Size.height + startSize.height + titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        this.add(title);
        this.add(date);
        this.add(start);
        
        
        
        this.add(date1);
        this.add(date2);
        this.add(date3);
        this.add(date4);
        this.add(date5);
        this.add(date6);
        this.add(date7);
        this.add(date8);
        this.add(date9);
        this.add(date10);
        
        this.add(start1);
        this.add(start2);
        this.add(start3);
        this.add(start4);
        this.add(start5);
        this.add(start6);
        this.add(start7);
        this.add(start8);
        this.add(start9);
        this.add(start10);
        
    }
}