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
	
	/*
	 * Class constructor that initializes the UI
	 * if no exceptions are caught.
	 * 
	 */
	
    public PSPTimeRecording() {
    	
        try {
            jbInit();
                        
        }
        catch (Exception ex) {
           new ExceptionDialog(ex);
        }
    }
    
    /*
     * Method that creates the UI
     */
    
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
        
        //Stop label
        stop.setFont(dateFont);
        Dimension stopSize = stop.getPreferredSize();
        stop.setBounds(125 + insets.left + dateSize.width + startSize.width, 80 + insets.top, stopSize.width, stopSize.height);
        
        //Phase label
        phase.setFont(dateFont);
        Dimension phaseSize = phase.getPreferredSize();
        phase.setBounds(165 + insets.left + dateSize.width + startSize.width + stopSize.width, 
        									80 + insets.top, phaseSize.width, phaseSize.height);
        
        //Comments label
        comments.setFont(dateFont);
        Dimension commentsSize = comments.getPreferredSize();
        comments.setBounds(190 + insets.left + dateSize.width + startSize.width + stopSize.width + phaseSize.width, 
        									80 + insets.top, commentsSize.width, commentsSize.height);
        
        //Date text fields
        date1.setSize(12, 45);
        Font date1Font = new Font("Courier", Font.PLAIN, 12);
        date1.setFont(date1Font);
        Dimension date1Size = date1.getPreferredSize();
        date1.setBounds(60 + insets.left, 40 + dateSize.height + titleSize.height + insets.top, date1Size.width, date1Size.height);
        
        
        
        
        date2.setSize(12, 45);
        date2.setFont(date1Font);
        Dimension date2Size = date2.getPreferredSize();
        date2.setBounds(60 + insets.left, 40 + date1Size.height + dateSize.height + 
        									titleSize.height + insets.top, date1Size.width, date1Size.height);
        
        date3.setSize(12, 45);
        date3.setFont(date1Font);
        Dimension date3Size = date3.getPreferredSize();
        date3.setBounds(60 + insets.left, 40 + date1Size.height + date2Size.height + dateSize.height + 
        									titleSize.height + insets.top, date1Size.width, date1Size.height);
        
        date4.setSize(12, 45);
        date4.setFont(date1Font);
        Dimension date4Size = date4.getPreferredSize();
        date4.setBounds(60 + insets.left, 40 + date3Size.height + date1Size.height + date2Size.height + dateSize.height + 
        									titleSize.height + insets.top, date1Size.width, date1Size.height);
        
        date5.setSize(12, 45);
        date5.setFont(date1Font);
        Dimension date5Size = date5.getPreferredSize();
        date5.setBounds(60 + insets.left, 40 + date4Size.height + date3Size.height + date1Size.height + date2Size.height + dateSize.height + 
        									titleSize.height + insets.top, date1Size.width, date1Size.height);
     
        date6.setSize(12, 45);
        date6.setFont(date1Font);
        Dimension date6Size = date6.getPreferredSize();
        date6.setBounds(60 + insets.left, 40 + date5Size.height + date4Size.height + date3Size.height + date1Size.height + date2Size.height + dateSize.height + 
        									titleSize.height + insets.top, date1Size.width, date1Size.height);
        
        date7.setSize(12, 45);
        date7.setFont(date1Font);
        Dimension date7Size = date7.getPreferredSize();
        date7.setBounds(60 + insets.left, 40 + date6Size.height + date5Size.height + date4Size.height + date3Size.height + date1Size.height + date2Size.height + dateSize.height + 
        									titleSize.height + insets.top, date1Size.width, date1Size.height);
        
        date8.setSize(12, 45);
        date8.setFont(date1Font);
        Dimension date8Size = date8.getPreferredSize();
        date8.setBounds(60 + insets.left, 40 + date7Size.height + date6Size.height + date5Size.height + date4Size.height + date3Size.height + date1Size.height + date2Size.height + dateSize.height + 
        									titleSize.height + insets.top, date1Size.width, date1Size.height);
        
        date9.setSize(12, 45);
        date9.setFont(date1Font);
        Dimension date9Size = date9.getPreferredSize();
        date9.setBounds(60 + insets.left, 40 + date8Size.height + date7Size.height + date6Size.height + date5Size.height + date4Size.height + date3Size.height + date1Size.height + date2Size.height + dateSize.height + 
        									titleSize.height + insets.top, date1Size.width, date1Size.height);
        
        date10.setSize(12, 45);
        date10.setFont(date1Font);
        Dimension date10Size = date10.getPreferredSize();
        date10.setBounds(60 + insets.left, 40 + date9Size.height + date8Size.height + date7Size.height + date6Size.height + date5Size.height + date4Size.height + date3Size.height + date1Size.height + date2Size.height + dateSize.height + 
        									titleSize.height + insets.top, date1Size.width, date1Size.height);
        
        //Start text fields
        start1.setSize(12, 45);
        start1.setFont(date1Font);
        Dimension start1Size = start1.getPreferredSize();
        start1.setBounds(70 + insets.left + date1Size.width, 40 + startSize.height + titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        start2.setSize(12, 45);
        start2.setFont(date1Font);
        Dimension start2Size = start2.getPreferredSize();
        start2.setBounds(70 + insets.left + date1Size.width, 40 + start1Size.height + startSize.height + 
        									titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        start3.setSize(12, 45);
        start3.setFont(date1Font);
        Dimension start3Size = start3.getPreferredSize();
        start3.setBounds(70 + insets.left + date1Size.width, 40 + start2Size.height + start1Size.height + startSize.height + 
        									titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        start4.setSize(12, 45);
        start4.setFont(date1Font);
        Dimension start4Size = start4.getPreferredSize();
        start4.setBounds(70 + insets.left + date1Size.width, 40 + start3Size.height + start2Size.height + start1Size.height + startSize.height + 
        									titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        start5.setSize(12, 45);
        start5.setFont(date1Font);
        Dimension start5Size = start5.getPreferredSize();
        start5.setBounds(70 + insets.left + date1Size.width, 40 + start4Size.height + start3Size.height + start2Size.height + start1Size.height + startSize.height + 
        									titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        start6.setSize(12, 45);
        start6.setFont(date1Font);
        Dimension start6Size = start6.getPreferredSize();
        start6.setBounds(70 + insets.left + date1Size.width, 40 + start5Size.height + start4Size.height + start3Size.height + start2Size.height + start1Size.height + startSize.height + 
        									titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        start7.setSize(12, 45);
        start7.setFont(date1Font);
        Dimension start7Size = start7.getPreferredSize();
        start7.setBounds(70 + insets.left + date1Size.width, 40 + start6Size.height + start5Size.height + start4Size.height + start3Size.height + start2Size.height + start1Size.height + startSize.height + 
        									titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        start8.setSize(12, 45);
        start8.setFont(date1Font);
        Dimension start8Size = start8.getPreferredSize();
        start8.setBounds(70 + insets.left + date1Size.width, 40 + start7Size.height + start6Size.height + start5Size.height + start4Size.height + start3Size.height + start2Size.height + start1Size.height + startSize.height + 
        									titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        start9.setSize(12, 45);
        start9.setFont(date1Font);
        Dimension start9Size = start9.getPreferredSize();
        start9.setBounds(70 + insets.left + date1Size.width, 40 + start8Size.height + start7Size.height + start6Size.height + start5Size.height + start4Size.height + start3Size.height + start2Size.height + start1Size.height + startSize.height + 
        									titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        start10.setSize(12, 45);
        start10.setFont(date1Font);
        Dimension start10Size = start10.getPreferredSize();
        start10.setBounds(70 + insets.left + date1Size.width, 40 + start9Size.height + start8Size.height + start7Size.height + start6Size.height + start5Size.height + start4Size.height + start3Size.height + start2Size.height + start1Size.height + startSize.height + 
        									titleSize.height + insets.top, start1Size.width, start1Size.height);
        
        //Stop text fields
        stop1.setSize(12, 45);
        stop1.setFont(date1Font);
        Dimension stop1Size = stop1.getPreferredSize();
        stop1.setBounds(80 + insets.left + date1Size.width + start1Size.width, 40 + titleSize.height + stopSize.height + insets.top, stop1Size.width, stop1Size.height);
        
        stop2.setSize(12, 45);
        stop2.setFont(date1Font);
        Dimension stop2Size = stop2.getPreferredSize();
        stop2.setBounds(80 + insets.left + date1Size.width + start1Size.width, 
        									40 + stop1Size.height + titleSize.height + stopSize.height + insets.top, stop1Size.width, stop1Size.height);
        
        stop3.setSize(12, 45);
        stop3.setFont(date1Font);
        Dimension stop3Size = stop3.getPreferredSize();
        stop3.setBounds(80 + insets.left + date1Size.width + start1Size.width, 
        									40 + stop2Size.height + stop1Size.height + titleSize.height + stopSize.height + insets.top, stop1Size.width, stop1Size.height);
        
        stop4.setSize(12, 45);
        stop4.setFont(date1Font);
        Dimension stop4Size = stop4.getPreferredSize();
        stop4.setBounds(80 + insets.left + date1Size.width + start1Size.width, 
        									40 + stop3Size.height + stop2Size.height + stop1Size.height + titleSize.height + stopSize.height + insets.top, stop1Size.width, stop1Size.height);
        
        stop5.setSize(12, 45);
        stop5.setFont(date1Font);
        Dimension stop5Size = stop5.getPreferredSize();
        stop5.setBounds(80 + insets.left + date1Size.width + start1Size.width, 
        									40 + stop4Size.height + stop3Size.height + stop2Size.height + stop1Size.height + titleSize.height + stopSize.height + insets.top, stop1Size.width, stop1Size.height);
        
        stop6.setSize(12, 45);
        stop6.setFont(date1Font);
        Dimension stop6Size = stop6.getPreferredSize();
        stop6.setBounds(80 + insets.left + date1Size.width + start1Size.width, 
        									40 + stop5Size.height + stop4Size.height + stop3Size.height + stop2Size.height + stop1Size.height + titleSize.height + stopSize.height + insets.top, stop1Size.width, stop1Size.height);
        
        stop7.setSize(12, 45);
        stop7.setFont(date1Font);
        Dimension stop7Size = stop7.getPreferredSize();
        stop7.setBounds(80 + insets.left + date1Size.width + start1Size.width, 
        									40 + stop6Size.height + stop5Size.height + stop4Size.height + stop3Size.height + stop2Size.height + stop1Size.height + titleSize.height + stopSize.height + insets.top, stop1Size.width, stop1Size.height);
        
        stop8.setSize(12, 45);
        stop8.setFont(date1Font);
        Dimension stop8Size = stop8.getPreferredSize();
        stop8.setBounds(80 + insets.left + date1Size.width + start1Size.width, 
        									40 + stop7Size.height + stop6Size.height + stop5Size.height + stop4Size.height + stop3Size.height + stop2Size.height + stop1Size.height + titleSize.height + stopSize.height + insets.top, stop1Size.width, stop1Size.height);
        
        stop9.setSize(12, 45);
        stop9.setFont(date1Font);
        Dimension stop9Size = stop9.getPreferredSize();
        stop9.setBounds(80 + insets.left + date1Size.width + start1Size.width, 
        									40 + stop8Size.height + stop7Size.height + stop6Size.height + stop5Size.height + stop4Size.height + stop3Size.height + stop2Size.height + stop1Size.height + titleSize.height + stopSize.height + insets.top, stop1Size.width, stop1Size.height);
        
        stop10.setSize(12, 45);
        stop10.setFont(date1Font);
        Dimension stop10Size = stop10.getPreferredSize();
        stop10.setBounds(80 + insets.left + date1Size.width + start1Size.width, 
        									40 + stop9Size.height + stop8Size.height + stop7Size.height + stop6Size.height + stop5Size.height + stop4Size.height + stop3Size.height + stop2Size.height + stop1Size.height + titleSize.height + stopSize.height + insets.top, stop1Size.width, stop1Size.height);
        
        //Phase text fields
        phase1.setSize(12, 45);
        phase1.setFont(date1Font);
        Dimension phase1Size = phase1.getPreferredSize();
        phase1.setBounds(90 + insets.left + date1Size.width + start1Size.width + stop1Size.width, 40 + titleSize.height + 
        									phaseSize.height +insets.top, phase1Size.width, phase1Size.height);
        
        phase2.setSize(12, 45);
        phase2.setFont(date1Font);
        Dimension phase2Size = phase2.getPreferredSize();
        phase2.setBounds(90 + insets.left + date1Size.width + start1Size.width + stop1Size.width, 40 + phase1Size.height + titleSize.height + 
        									phaseSize.height +insets.top, phase1Size.width, phase1Size.height);
        
        phase3.setSize(12, 45);
        phase3.setFont(date1Font);
        Dimension phase3Size = phase3.getPreferredSize();
        phase3.setBounds(90 + insets.left + date1Size.width + start1Size.width + stop1Size.width, 40 + phase2Size.height + phase1Size.height + titleSize.height + 
        									phaseSize.height +insets.top, phase1Size.width, phase1Size.height);
        
        phase4.setSize(12, 45);
        phase4.setFont(date1Font);
        Dimension phase4Size = phase4.getPreferredSize();
        phase4.setBounds(90 + insets.left + date1Size.width + start1Size.width + stop1Size.width, 40 + phase3Size.height + phase2Size.height + phase1Size.height + titleSize.height + 
        									phaseSize.height +insets.top, phase1Size.width, phase1Size.height);
        
        phase5.setSize(12, 45);
        phase5.setFont(date1Font);
        Dimension phase5Size = phase5.getPreferredSize();
        phase5.setBounds(90 + insets.left + date1Size.width + start1Size.width + stop1Size.width, 40 + phase4Size.height + phase3Size.height + phase2Size.height + phase1Size.height + titleSize.height + 
        									phaseSize.height +insets.top, phase1Size.width, phase1Size.height);
        
        phase6.setSize(12, 45);
        phase6.setFont(date1Font);
        Dimension phase6Size = phase6.getPreferredSize();
        phase6.setBounds(90 + insets.left + date1Size.width + start1Size.width + stop1Size.width, 40 + phase5Size.height + phase4Size.height + phase3Size.height + phase2Size.height + phase1Size.height + titleSize.height + 
        									phaseSize.height +insets.top, phase1Size.width, phase1Size.height);
        
        phase7.setSize(12, 45);
        phase7.setFont(date1Font);
        Dimension phase7Size = phase7.getPreferredSize();
        phase7.setBounds(90 + insets.left + date1Size.width + start1Size.width + stop1Size.width, 40 + phase6Size.height + phase5Size.height + phase4Size.height + phase3Size.height + phase2Size.height + phase1Size.height + titleSize.height + 
        									phaseSize.height +insets.top, phase1Size.width, phase1Size.height);
        
        phase8.setSize(12, 45);
        phase8.setFont(date1Font);
        Dimension phase8Size = phase8.getPreferredSize();
        phase8.setBounds(90 + insets.left + date1Size.width + start1Size.width + stop1Size.width, 40 + phase7Size.height + phase6Size.height + phase5Size.height + phase4Size.height + phase3Size.height + phase2Size.height + phase1Size.height + titleSize.height + 
        									phaseSize.height +insets.top, phase1Size.width, phase1Size.height);
        
        phase9.setSize(12, 45);
        phase9.setFont(date1Font);
        Dimension phase9Size = phase9.getPreferredSize();
        phase9.setBounds(90 + insets.left + date1Size.width + start1Size.width + stop1Size.width, 40 + phase8Size.height + phase7Size.height + phase6Size.height + phase5Size.height + phase4Size.height + phase3Size.height + phase2Size.height + phase1Size.height + titleSize.height + 
        									phaseSize.height +insets.top, phase1Size.width, phase1Size.height);
        
        phase10.setSize(12, 45);
        phase10.setFont(date1Font);
        Dimension phase10Size = phase10.getPreferredSize();
        phase10.setBounds(90 + insets.left + date1Size.width + start1Size.width + stop1Size.width, 40 + phase9Size.height + phase8Size.height + phase7Size.height + phase6Size.height + phase5Size.height + phase4Size.height + phase3Size.height + phase2Size.height + phase1Size.height + titleSize.height + 
        									phaseSize.height +insets.top, phase1Size.width, phase1Size.height);
        
        
        //Commnets text fields
        comments1.setSize(12, 45);
        comments1.setFont(date1Font);
        Dimension comments1Size = comments1.getPreferredSize();
        comments1.setBounds(100 + insets.left + date1Size.width + start1Size.width + stop1Size.width + phase1Size.width, 40 + titleSize.height + commentsSize.height + insets.top, comments1Size.width, comments1Size.height);
        
        comments2.setSize(12, 45);
        comments2.setFont(date1Font);
        Dimension comments2Size = comments2.getPreferredSize();
        comments2.setBounds(100 + insets.left + date1Size.width + start1Size.width + stop1Size.width + phase1Size.width, 40 + comments1Size.height + titleSize.height + 
        									commentsSize.height + insets.top, comments1Size.width, comments1Size.height);
        
        comments3.setSize(12, 45);
        comments3.setFont(date1Font);
        Dimension comments3Size = comments3.getPreferredSize();
        comments3.setBounds(100 + insets.left + date1Size.width + start1Size.width + stop1Size.width + phase1Size.width, 40 + comments2Size.height + comments1Size.height + titleSize.height + 
        									commentsSize.height + insets.top, comments1Size.width, comments1Size.height);
        
        comments4.setSize(12, 45);
        comments4.setFont(date1Font);
        Dimension comments4Size = comments4.getPreferredSize();
        comments4.setBounds(100 + insets.left + date1Size.width + start1Size.width + stop1Size.width + phase1Size.width, 40 + comments3Size.height + comments2Size.height + comments1Size.height + titleSize.height + 
        									commentsSize.height + insets.top, comments1Size.width, comments1Size.height);
        
        comments5.setSize(12, 45);
        comments5.setFont(date1Font);
        Dimension comments5Size = comments5.getPreferredSize();
        comments5.setBounds(100 + insets.left + date1Size.width + start1Size.width + stop1Size.width + phase1Size.width, 40 + comments4Size.height + comments3Size.height + comments2Size.height + comments1Size.height + titleSize.height + 
        									commentsSize.height + insets.top, comments1Size.width, comments1Size.height);
        
        comments6.setSize(12, 45);
        comments6.setFont(date1Font);
        Dimension comments6Size = comments6.getPreferredSize();
        comments6.setBounds(100 + insets.left + date1Size.width + start1Size.width + stop1Size.width + phase1Size.width, 40 + comments5Size.height + comments4Size.height + comments3Size.height + comments2Size.height + comments1Size.height + titleSize.height + 
        									commentsSize.height + insets.top, comments1Size.width, comments1Size.height);
        
        comments7.setSize(12, 45);
        comments7.setFont(date1Font);
        Dimension comments7Size = comments7.getPreferredSize();
        comments7.setBounds(100 + insets.left + date1Size.width + start1Size.width + stop1Size.width + phase1Size.width, 40 + comments6Size.height + comments5Size.height + comments4Size.height + comments3Size.height + comments2Size.height + comments1Size.height + titleSize.height + 
        									commentsSize.height + insets.top, comments1Size.width, comments1Size.height);
        
        comments8.setSize(12, 45);
        comments8.setFont(date1Font);
        Dimension comments8Size = comments8.getPreferredSize();
        comments8.setBounds(100 + insets.left + date1Size.width + start1Size.width + stop1Size.width + phase1Size.width, 40 + comments7Size.height + comments6Size.height + comments5Size.height + comments4Size.height + comments3Size.height + comments2Size.height + comments1Size.height + titleSize.height + 
        									commentsSize.height + insets.top, comments1Size.width, comments1Size.height);
        
        comments9.setSize(12, 45);
        comments9.setFont(date1Font);
        Dimension comments9Size = comments9.getPreferredSize();
        comments9.setBounds(100 + insets.left + date1Size.width + start1Size.width + stop1Size.width + phase1Size.width, 40 + comments8Size.height + comments7Size.height + comments6Size.height + comments5Size.height + comments4Size.height + comments3Size.height + comments2Size.height + comments1Size.height + titleSize.height + 
        									commentsSize.height + insets.top, comments1Size.width, comments1Size.height);
        
        comments10.setSize(12, 45);
        comments10.setFont(date1Font);
        Dimension comments10Size = comments10.getPreferredSize();
        comments10.setBounds(100 + insets.left + date1Size.width + start1Size.width + stop1Size.width + phase1Size.width, 40 + comments9Size.height + comments8Size.height + comments7Size.height + comments6Size.height + comments5Size.height + comments4Size.height + comments3Size.height + comments2Size.height + comments1Size.height + titleSize.height + 
        									commentsSize.height + insets.top, comments1Size.width, comments1Size.height);
        
        //Adding the labels
        this.add(title);
        this.add(date);
        this.add(start);
        this.add(stop);
        this.add(phase);
        this.add(comments);
        
        //Adding the text fields
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
        
        this.add(stop1);
        this.add(stop2);
        this.add(stop3);
        this.add(stop4);
        this.add(stop5);
        this.add(stop6);
        this.add(stop7);
        this.add(stop8);
        this.add(stop9);
        this.add(stop10);
        
        this.add(phase1);
        this.add(phase2);
        this.add(phase3);
        this.add(phase4);
        this.add(phase5);
        this.add(phase6);
        this.add(phase7);
        this.add(phase8);
        this.add(phase9);
        this.add(phase10);

        this.add(comments1);
        this.add(comments2);
        this.add(comments3);
        this.add(comments4);
        this.add(comments5);
        this.add(comments6);
        this.add(comments7);
        this.add(comments8);
        this.add(comments9);
        this.add(comments10);
    }
}