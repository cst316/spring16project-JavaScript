package net.sf.memoranda.ui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PSPProjectSummary extends JPanel {    
    //Create all labels for PSP Project Summary
    JLabel psp0Label = new JLabel("PSP0 Project Summary");
    JLabel timeInPhaseLabel = new JLabel("Time in Phase\n(minutes)");
    JLabel actualTimeLabel = new JLabel("Actual Time\n(minutes)");
    JLabel percentTotalLabel1 = new JLabel("% of Total");
    JLabel defectsInjectedLabel = new JLabel("Defects Injected");
    JLabel actualNumberDefectsLabel = new JLabel("Actual Number of Defects");
    JLabel percentTotalLabel2 = new JLabel("% of Total");
    JLabel planningLabel1 = new JLabel("Planning");
    JLabel planningLabel2 = new JLabel("Planning");
    JLabel designLabel1 = new JLabel("Design");
    JLabel designLabel2 = new JLabel("Design");
    JLabel codeLabel1 = new JLabel("Code");
    JLabel codeLabel2 = new JLabel("Code");
    JLabel compileLabel1 = new JLabel("Compile");
    JLabel compileLabel2 = new JLabel("Compile");
    JLabel testLabel1 = new JLabel("Test");
    JLabel testLabel2 = new JLabel("Test");
    JLabel postmortemLabel1 = new JLabel("Postmortem");
    JLabel postmortemLabel2 = new JLabel("Postmortem");
    JLabel totalLabel1 = new JLabel("TOTAL");
    JLabel totalLabel2 = new JLabel("TOTAL");
    JLabel summaryLabel = new JLabel("Summary");
    JLabel actualLabel = new JLabel("Actual");
    JLabel toDateLabel = new JLabel("To Date");
    JLabel programSizeLabel = new JLabel("Program Size (Lines of Code - LOC)");
    JLabel productivityLabel = new JLabel("Productivity (Calculated) LOC/Hour");
    JLabel defectRateLabel = new JLabel("Defect Rate (Calculated) Defects/LOC");
    
    //Create all TextFields for PSP Project Summary AKA USER INPUT FOOLS!
    JTextField time_planningTextField = new JTextField(25);
    JTextField time_designTextField = new JTextField(25);
    JTextField time_codeTextField = new JTextField(25);
    JTextField time_compileTextField = new JTextField(25);
    JTextField time_testTextField = new JTextField(25);
    JTextField time_postmortemTextField = new JTextField(25);
    JTextField time_totalTextField = new JTextField(25);
    JTextField timepercent_planningTextField = new JTextField(15);
    JTextField timepercent_designTextField = new JTextField(15);
    JTextField timepercent_codeTextField = new JTextField(15);
    JTextField timepercent_compileTextField = new JTextField(15);
    JTextField timepercent_testTextField = new JTextField(15);
    JTextField timepercent_postmortemTextField = new JTextField(15);
    JTextField timepercent_totalTextField = new JTextField(15);
    JTextField defect_planningTextField = new JTextField(25);
    JTextField defect_designTextField = new JTextField(25);
    JTextField defect_codeTextField = new JTextField(25);
    JTextField defect_compileTextField = new JTextField(25);
    JTextField defect_testTextField = new JTextField(25);
    JTextField defect_postmortemTextField = new JTextField(25);
    JTextField defect_totalTextField = new JTextField(25);
    JTextField defectpercent_planningTextField = new JTextField(15);
    JTextField defectpercent_designTextField = new JTextField(15);
    JTextField defectpercent_codeTextField = new JTextField(15);
    JTextField defectpercent_compileTextField = new JTextField(15);
    JTextField defectpercent_testTextField = new JTextField(15);
    JTextField defectpercent_postmortemTextField = new JTextField(15);
    JTextField defectpercent_totalTextField = new JTextField(15);
    JTextField sumactual_ProgramSizeTextField = new JTextField(10);
    JTextField sumactual_ProductivityTextField = new JTextField(10);
    JTextField sumactual_DefectRateTextField = new JTextField(10);
    JTextField sumtodate_ProgramSizeTextField = new JTextField(10);
    JTextField sumtodate_ProductivityTextField = new JTextField(10);
    JTextField sumtodate_DefectRateTextField = new JTextField(10);
    
    
    public PSPProjectSummary() {
    	
        try {
            jbInit();
                        
        }
        catch (Exception ex) {
           new ExceptionDialog(ex);
        }
    }
    void jbInit() throws Exception {
        setupUI();
    }
    
    private void setupUI() {
    	this.setLayout(null);
    	Insets insets = this.getInsets();
    	
    	//Setting psp0Label Settings and Location
        Font psp0LabelFont = new Font("Courier", Font.BOLD, 35);
        psp0Label.setFont(psp0LabelFont);
        Dimension psp0LabelSize = psp0Label.getPreferredSize();
        psp0Label.setBounds(25 + insets.left, 15 + insets.top, psp0LabelSize.width, psp0LabelSize.height);
     
        //Setting timeInPhaseLabel Settings and Location
        Font timeInPhaseLabelFont = new Font("Courier", Font.BOLD, 20);
        timeInPhaseLabel.setFont(timeInPhaseLabelFont);
        Dimension timeInPhaseLabelSize = timeInPhaseLabel.getPreferredSize();
        timeInPhaseLabel.setBounds(25 + insets.left, 60 + insets.top, timeInPhaseLabelSize.width, timeInPhaseLabelSize.height);
        
        //Setting actualTimeLabel Settings and Location
        Font actualTimeLabelFont = new Font("Courier", Font.BOLD, 20);
        actualTimeLabel.setFont(actualTimeLabelFont);
        Dimension actualTimeLabelSize = actualTimeLabel.getPreferredSize();
        actualTimeLabel.setBounds(45 + timeInPhaseLabelSize.width + insets.left, 60 + insets.top, actualTimeLabelSize.width, actualTimeLabelSize.height);
        
        //Setting percentTotalLabel1 Settings and Location
        Font percentTotalLabel1Font = new Font("Courier", Font.BOLD, 20);
        percentTotalLabel1.setFont(percentTotalLabel1Font);
        Dimension percentTotalLabel1Size = percentTotalLabel1.getPreferredSize();
        percentTotalLabel1.setBounds(65 + timeInPhaseLabelSize.width + actualTimeLabelSize.width + insets.left, 60 + insets.top, percentTotalLabel1Size.width, percentTotalLabel1Size.height);
        
        //Setting defectsInjectedLabel Settings and Location
        Font defectsInjectedLabelFont = new Font("Courier", Font.BOLD, 20);
        defectsInjectedLabel.setFont(defectsInjectedLabelFont);
        Dimension defectsInjectedLabelSize = defectsInjectedLabel.getPreferredSize();
        defectsInjectedLabel.setBounds(800 + insets.left, 60 + insets.top, defectsInjectedLabelSize.width, defectsInjectedLabelSize.height);
        
        //Setting actualNumberDefectsLabel Settings and Location
        Font actualNumberDefectsLabelFont = new Font("Courier", Font.BOLD, 20);
        actualNumberDefectsLabel.setFont(actualNumberDefectsLabelFont);
        Dimension actualNumberDefectsLabelSize = actualNumberDefectsLabel.getPreferredSize();
        actualNumberDefectsLabel.setBounds(820 + defectsInjectedLabelSize.width + insets.left, 60 + insets.top, actualNumberDefectsLabelSize.width, actualNumberDefectsLabelSize.height);
        
        //Setting percentTotalLabel2 Settings and Location
        Font percentTotalLabel2Font = new Font("Courier", Font.BOLD, 20);
        percentTotalLabel2.setFont(percentTotalLabel2Font);
        Dimension percentTotalLabel2Size = percentTotalLabel2.getPreferredSize();
        percentTotalLabel2.setBounds(840 + defectsInjectedLabelSize.width + actualNumberDefectsLabelSize.width + insets.left, 60 + insets.top, percentTotalLabel2Size.width, percentTotalLabel2Size.height);
        
        //Setting planningLabel1 Settings and Location
        Font planningLabel1Font = new Font("Courier", Font.PLAIN, 20);
        planningLabel1.setFont(planningLabel1Font);
        Dimension planningLabel1Size = planningLabel1.getPreferredSize();
        planningLabel1.setBounds(60 + insets.left, 80 + timeInPhaseLabelSize.height + insets.top, planningLabel1Size.width, planningLabel1Size.height);
        
        //Setting planningLabel2 Settings and Location
        Font planningLabel2Font = new Font("Courier", Font.PLAIN, 20);
        planningLabel2.setFont(planningLabel2Font);
        Dimension planningLabel2Size = planningLabel2.getPreferredSize();
        planningLabel2.setBounds(830 + insets.left, 80 + timeInPhaseLabelSize.height + insets.top, planningLabel2Size.width, planningLabel2Size.height);
        
        //Setting designLabel1 Settings and Location
        Font designLabel1Font = new Font("Courier", Font.PLAIN, 20);
        designLabel1.setFont(designLabel1Font);
        Dimension designLabel1Size = designLabel1.getPreferredSize();
        designLabel1.setBounds(60 + insets.left, 90 + planningLabel1Size.height + timeInPhaseLabelSize.height + insets.top, designLabel1Size.width, designLabel1Size.height);
        
        //Setting designLabel2 Settings and Location
        Font designLabel2Font = new Font("Courier", Font.PLAIN, 20);
        designLabel2.setFont(designLabel2Font);
        Dimension designLabel2Size = designLabel2.getPreferredSize();
        designLabel2.setBounds(830 + insets.left, 90 + planningLabel1Size.height + timeInPhaseLabelSize.height + insets.top, designLabel2Size.width, designLabel2Size.height);
        
        //Setting codeLabel1 Settings and Location
        Font codeLabel1Font = new Font("Courier", Font.PLAIN, 20);
        codeLabel1.setFont(codeLabel1Font);
        Dimension codeLabel1Size = codeLabel1.getPreferredSize();
        codeLabel1.setBounds(60 + insets.left, 100 + designLabel1Size.height + planningLabel1Size.height + timeInPhaseLabelSize.height + insets.top, codeLabel1Size.width, codeLabel1Size.height);
        
        //Setting codeLabel2 Settings and Location
        Font codeLabel2Font = new Font("Courier", Font.PLAIN, 20);
        codeLabel2.setFont(codeLabel2Font);
        Dimension codeLabel2Size = codeLabel2.getPreferredSize();
        codeLabel2.setBounds(830 + insets.left, 100 + designLabel1Size.height + planningLabel1Size.height + timeInPhaseLabelSize.height + insets.top, codeLabel2Size.width, codeLabel2Size.height);
        
        //Setting compileLabel1 Settings and Location
        Font compileLabel1Font = new Font("Courier", Font.PLAIN, 20);
        compileLabel1.setFont(compileLabel1Font);
        Dimension compileLabel1Size = compileLabel1.getPreferredSize();
        compileLabel1.setBounds(60 + insets.left, 110 + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + timeInPhaseLabelSize.height + insets.top, compileLabel1Size.width, compileLabel1Size.height);
        
        //Setting compileLabel2 Settings and Location
        Font compileLabel2Font = new Font("Courier", Font.PLAIN, 20);
        compileLabel2.setFont(compileLabel2Font);
        Dimension compileLabel2Size = compileLabel2.getPreferredSize();
        compileLabel2.setBounds(830 + insets.left, 110 + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + timeInPhaseLabelSize.height + insets.top, compileLabel2Size.width, compileLabel2Size.height);
        
        //Setting testLabel1 Settings and Location
        Font testLabel1Font = new Font("Courier", Font.PLAIN, 20);
        testLabel1.setFont(testLabel1Font);
        Dimension testLabel1Size = testLabel1.getPreferredSize();
        testLabel1.setBounds(60 + insets.left, 120 + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + compileLabel1Size.height + timeInPhaseLabelSize.height+ insets.top, testLabel1Size.width, testLabel1Size.height);
        
        //Setting testLabel2 Settings and Location
        Font testLabel2Font = new Font("Courier", Font.PLAIN, 20);
        testLabel2.setFont(testLabel2Font);
        Dimension testLabel2Size = testLabel2.getPreferredSize();
        testLabel2.setBounds(830 + insets.left, 120 + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + compileLabel1Size.height + timeInPhaseLabelSize.height+ insets.top, testLabel2Size.width, testLabel2Size.height);
        
        //Setting postmortemLabel1 Settings and Location
        Font postmortemLabel1Font = new Font("Courier", Font.PLAIN, 20);
        postmortemLabel1.setFont(postmortemLabel1Font);
        Dimension postmortemLabel1Size = postmortemLabel1.getPreferredSize();
        postmortemLabel1.setBounds(60 + insets.left, 130 + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + compileLabel1Size.height + testLabel1Size.height + timeInPhaseLabelSize.height + insets.top, postmortemLabel1Size.width, postmortemLabel1Size.height);
        
        //Setting postmortemLabel2 Settings and Location
        Font postmortemLabel2Font = new Font("Courier", Font.PLAIN, 20);
        postmortemLabel2.setFont(postmortemLabel2Font);
        Dimension postmortemLabel2Size = postmortemLabel2.getPreferredSize();
        postmortemLabel2.setBounds(830 + insets.left, 130 + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + compileLabel1Size.height + testLabel1Size.height + timeInPhaseLabelSize.height + insets.top, postmortemLabel2Size.width, postmortemLabel2Size.height);
        
        //Setting totalLabel1 Settings and Location
        Font totalLabel1Font = new Font("Courier", Font.PLAIN, 20);
        totalLabel1.setFont(totalLabel1Font);
        Dimension totalLabel1Size = totalLabel1.getPreferredSize();
        totalLabel1.setBounds(60 + insets.left, 140 + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + compileLabel1Size.height + testLabel1Size.height + postmortemLabel1Size.height + timeInPhaseLabelSize.height + insets.top, totalLabel1Size.width, totalLabel1Size.height);
        
        //Setting totalLabel2 Settings and Location
        Font totalLabel2Font = new Font("Courier", Font.PLAIN, 20);
        totalLabel2.setFont(totalLabel2Font);
        Dimension totalLabel2Size = totalLabel2.getPreferredSize();
        totalLabel2.setBounds(830 + insets.left, 140 + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + compileLabel1Size.height + testLabel1Size.height + postmortemLabel1Size.height + timeInPhaseLabelSize.height + insets.top, totalLabel2Size.width, totalLabel2Size.height);
        
        //Setting time_planningTextField Settings and Location
        time_planningTextField.setSize(12, 40);
        Font time_planningTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        time_planningTextField.setFont(time_planningTextFieldFont);
        Dimension time_planningTextFieldSize = time_planningTextField.getPreferredSize();
        time_planningTextField.setBounds(330 + insets.left, 88 + timeInPhaseLabelSize.height + insets.top, time_planningTextFieldSize.width, time_planningTextFieldSize.height);
        
        //Setting time_designTextField Settings and Location
        Font time_designTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        time_designTextField.setFont(time_designTextFieldFont);
        Dimension time_designTextFieldSize = time_designTextField.getPreferredSize();
        time_designTextField.setBounds(330 + insets.left, 99 + timeInPhaseLabelSize.height + planningLabel1Size.height + insets.top, time_designTextFieldSize.width, time_designTextFieldSize.height);
        
        //Setting time_codeTextField Settings and Location
        Font time_codeTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        time_codeTextField.setFont(time_codeTextFieldFont);
        Dimension time_codeTextFieldSize = time_codeTextField.getPreferredSize();
        time_codeTextField.setBounds(330 + insets.left, 108 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + insets.top, time_codeTextFieldSize.width, time_codeTextFieldSize.height);
        
        //Setting time_compileTextField Settings and Location
        time_compileTextField.setSize(12, 40);
        Font time_compileTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        time_compileTextField.setFont(time_compileTextFieldFont);
        Dimension time_compileTextFieldSize = time_compileTextField.getPreferredSize();
        time_compileTextField.setBounds(330 + insets.left, 118 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + insets.top, time_compileTextFieldSize.width, time_compileTextFieldSize.height);
        
        //Setting time_testTextField Settings and Location
        time_testTextField.setSize(12, 40);
        Font time_testTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        time_testTextField.setFont(time_testTextFieldFont);
        Dimension time_testTextFieldSize = time_testTextField.getPreferredSize();
        time_testTextField.setBounds(330 + insets.left, 127 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + compileLabel1Size.height + insets.top, time_testTextFieldSize.width, time_testTextFieldSize.height);
        
        //Setting time_postmortemTextField Settings and Location
        time_postmortemTextField.setSize(12, 40);
        Font time_postmortemTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        time_postmortemTextField.setFont(time_postmortemTextFieldFont);
        Dimension time_postmortemTextFieldSize = time_postmortemTextField.getPreferredSize();
        time_postmortemTextField.setBounds(330 + insets.left, 137 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + compileLabel1Size.height + testLabel1Size.height + insets.top, time_postmortemTextFieldSize.width, time_postmortemTextFieldSize.height);
        
        //Setting time_totalTextField Settings and Location
        time_totalTextField.setSize(12, 40);
        Font time_totalTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        time_totalTextField.setFont(time_totalTextFieldFont);
        Dimension time_totalTextFieldSize = time_totalTextField.getPreferredSize();
        time_totalTextField.setBounds(330 + insets.left, 147 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + compileLabel1Size.height + testLabel1Size.height + postmortemLabel1Size.height + insets.top, time_totalTextFieldSize.width, time_totalTextFieldSize.height);
        
        //Setting timepercent_planningTextField Settings and Location
        timepercent_planningTextField.setSize(12, 40);
        Font timepercent_planningTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        timepercent_planningTextField.setFont(timepercent_planningTextFieldFont);
        Dimension timepercent_planningTextFieldSize = timepercent_planningTextField.getPreferredSize();
        timepercent_planningTextField.setBounds(577 + insets.left, 88 + timeInPhaseLabelSize.height + insets.top, timepercent_planningTextFieldSize.width, timepercent_planningTextFieldSize.height);
        
        //Setting timepercent_designTextField Settings and Location
        timepercent_designTextField.setSize(12, 40);
        Font timepercent_designTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        timepercent_designTextField.setFont(timepercent_designTextFieldFont);
        Dimension timepercent_designTextFieldSize = timepercent_designTextField.getPreferredSize();
        timepercent_designTextField.setBounds(577 + insets.left, 99 + timeInPhaseLabelSize.height + planningLabel1Size.height + insets.top, timepercent_designTextFieldSize.width, timepercent_designTextFieldSize.height);
        
        //Setting timepercent_codeTextField Settings and Location
        timepercent_codeTextField.setSize(12, 40);
        Font timepercent_codeTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        timepercent_codeTextField.setFont(timepercent_codeTextFieldFont);
        Dimension timepercent_codeTextFieldSize = timepercent_codeTextField.getPreferredSize();
        timepercent_codeTextField.setBounds(577 + insets.left, 108 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + insets.top, timepercent_codeTextFieldSize.width, timepercent_codeTextFieldSize.height);
        
        //Setting timepercent_compileTextField Settings and Location
        timepercent_compileTextField.setSize(12, 40);
        Font timepercent_compileTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        timepercent_compileTextField.setFont(timepercent_compileTextFieldFont);
        Dimension timepercent_compileTextFieldSize = timepercent_compileTextField.getPreferredSize();
        timepercent_compileTextField.setBounds(577 + insets.left, 118 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + insets.top, timepercent_compileTextFieldSize.width, timepercent_compileTextFieldSize.height);
        
        //Setting timepercent_testTextField Settings and Location
        timepercent_testTextField.setSize(12, 40);
        Font timepercent_testTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        timepercent_testTextField.setFont(timepercent_testTextFieldFont);
        Dimension timepercent_testTextFieldSize = timepercent_testTextField.getPreferredSize();
        timepercent_testTextField.setBounds(577 + insets.left, 127 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + compileLabel1Size.height + insets.top, timepercent_testTextFieldSize.width, timepercent_testTextFieldSize.height);
        
        //Setting timepercent_postmortemTextField Settings and Location
        timepercent_postmortemTextField.setSize(12, 40);
        Font timepercent_postmortemTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        timepercent_postmortemTextField.setFont(timepercent_postmortemTextFieldFont);
        Dimension timepercent_postmortemTextFieldSize = timepercent_postmortemTextField.getPreferredSize();
        timepercent_postmortemTextField.setBounds(577 + insets.left, 137 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + compileLabel1Size.height + testLabel1Size.height + insets.top, timepercent_postmortemTextFieldSize.width, timepercent_postmortemTextFieldSize.height);
        
        //Setting timepercent_totalTextField Settings and Location
        timepercent_totalTextField.setSize(12, 40);
        Font timepercent_totalTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        timepercent_totalTextField.setFont(timepercent_totalTextFieldFont);
        Dimension timepercent_totalTextFieldSize = timepercent_totalTextField.getPreferredSize();
        timepercent_totalTextField.setBounds(577 + insets.left, 147 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + compileLabel1Size.height + testLabel1Size.height + postmortemLabel1Size.height + insets.top, timepercent_totalTextFieldSize.width, timepercent_totalTextFieldSize.height);
        
        //Setting defect_planningTextField Settings and Location
        defect_planningTextField.setSize(12, 40);
        Font defect_planningTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        defect_planningTextField.setFont(defect_planningTextFieldFont);
        Dimension defect_planningTextFieldSize = defect_planningTextField.getPreferredSize();
        defect_planningTextField.setBounds(1070 + insets.left, 88 + timeInPhaseLabelSize.height + insets.top, defect_planningTextFieldSize.width, defect_planningTextFieldSize.height);
        
        //Setting defect_designTextField Settings and Location
        Font defect_designTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        defect_designTextField.setFont(defect_designTextFieldFont);
        Dimension defect_designTextFieldSize = defect_designTextField.getPreferredSize();
        defect_designTextField.setBounds(1070 + insets.left, 99 + timeInPhaseLabelSize.height + planningLabel1Size.height + insets.top, defect_designTextFieldSize.width, defect_designTextFieldSize.height);
        
        //Setting defect_codeTextField Settings and Location
        Font defect_codeTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        defect_codeTextField.setFont(defect_codeTextFieldFont);
        Dimension defect_codeTextFieldSize = defect_codeTextField.getPreferredSize();
        defect_codeTextField.setBounds(1070 + insets.left, 108 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + insets.top, defect_codeTextFieldSize.width, defect_codeTextFieldSize.height);
        
        //Setting defect_compileTextField Settings and Location
        defect_compileTextField.setSize(12, 40);
        Font defect_compileTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        defect_compileTextField.setFont(defect_compileTextFieldFont);
        Dimension defect_compileTextFieldSize = defect_compileTextField.getPreferredSize();
        defect_compileTextField.setBounds(1070 + insets.left, 118 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + insets.top, defect_compileTextFieldSize.width, defect_compileTextFieldSize.height);
        
        //Setting defect_testTextField Settings and Location
        defect_testTextField.setSize(12, 40);
        Font defect_testTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        defect_testTextField.setFont(defect_testTextFieldFont);
        Dimension defect_testTextFieldSize = defect_testTextField.getPreferredSize();
        defect_testTextField.setBounds(1070 + insets.left, 127 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + compileLabel1Size.height + insets.top, defect_testTextFieldSize.width, defect_testTextFieldSize.height);
        
        //Setting defect_postmortemTextField Settings and Location
        defect_postmortemTextField.setSize(12, 40);
        Font defect_postmortemTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        defect_postmortemTextField.setFont(defect_postmortemTextFieldFont);
        Dimension defect_postmortemTextFieldSize = defect_postmortemTextField.getPreferredSize();
        defect_postmortemTextField.setBounds(1070 + insets.left, 137 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + compileLabel1Size.height + testLabel1Size.height + insets.top, defect_postmortemTextFieldSize.width, defect_postmortemTextFieldSize.height);
        
        //Setting defect_totalTextField Settings and Location
        defect_totalTextField.setSize(12, 40);
        Font defect_totalTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        defect_totalTextField.setFont(defect_totalTextFieldFont);
        Dimension defect_totalTextFieldSize = defect_totalTextField.getPreferredSize();
        defect_totalTextField.setBounds(1070 + insets.left, 147 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + compileLabel1Size.height + testLabel1Size.height + postmortemLabel1Size.height + insets.top, defect_totalTextFieldSize.width, defect_totalTextFieldSize.height);
        
        //Setting defectpercent_planningTextField Settings and Location
        defectpercent_planningTextField.setSize(12, 40);
        Font defectpercent_planningTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        defectpercent_planningTextField.setFont(defectpercent_planningTextFieldFont);
        Dimension defectpercent_planningTextFieldSize = defectpercent_planningTextField.getPreferredSize();
        defectpercent_planningTextField.setBounds(1326 + insets.left, 88 + timeInPhaseLabelSize.height + insets.top, defectpercent_planningTextFieldSize.width, defectpercent_planningTextFieldSize.height);
        
        //Setting defectpercent_designTextField Settings and Location
        defectpercent_designTextField.setSize(12, 40);
        Font defectpercent_designTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        defectpercent_designTextField.setFont(defectpercent_designTextFieldFont);
        Dimension defectpercent_designTextFieldSize = defectpercent_designTextField.getPreferredSize();
        defectpercent_designTextField.setBounds(1326 + insets.left, 99 + timeInPhaseLabelSize.height + planningLabel1Size.height + insets.top, defectpercent_designTextFieldSize.width, defectpercent_designTextFieldSize.height);
        
        //Setting defectpercent_codeTextField Settings and Location
        defectpercent_codeTextField.setSize(12, 40);
        Font defectpercent_codeTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        defectpercent_codeTextField.setFont(defectpercent_codeTextFieldFont);
        Dimension defectpercent_codeTextFieldSize = defectpercent_codeTextField.getPreferredSize();
        defectpercent_codeTextField.setBounds(1326 + insets.left, 108 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + insets.top, defectpercent_codeTextFieldSize.width, defectpercent_codeTextFieldSize.height);
        
        //Setting defectpercent_compileTextField Settings and Location
        defectpercent_compileTextField.setSize(12, 40);
        Font defectpercent_compileTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        defectpercent_compileTextField.setFont(defectpercent_compileTextFieldFont);
        Dimension defectpercent_compileTextFieldSize = defectpercent_compileTextField.getPreferredSize();
        defectpercent_compileTextField.setBounds(1326 + insets.left, 118 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + insets.top, defectpercent_compileTextFieldSize.width, defectpercent_compileTextFieldSize.height);
        
        //Setting defectpercent_testTextField Settings and Location
        defectpercent_testTextField.setSize(12, 40);
        Font defectpercent_testTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        defectpercent_testTextField.setFont(defectpercent_testTextFieldFont);
        Dimension defectpercent_testTextFieldSize = defectpercent_testTextField.getPreferredSize();
        defectpercent_testTextField.setBounds(1326 + insets.left, 127 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + compileLabel1Size.height + insets.top, defectpercent_testTextFieldSize.width, defectpercent_testTextFieldSize.height);
        
        //Setting defectpercent_postmortemTextField Settings and Location
        defectpercent_postmortemTextField.setSize(12, 40);
        Font defectpercent_postmortemTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        defectpercent_postmortemTextField.setFont(defectpercent_postmortemTextFieldFont);
        Dimension defectpercent_postmortemTextFieldSize = defectpercent_postmortemTextField.getPreferredSize();
        defectpercent_postmortemTextField.setBounds(1326 + insets.left, 137 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + compileLabel1Size.height + testLabel1Size.height + insets.top, defectpercent_postmortemTextFieldSize.width, defectpercent_postmortemTextFieldSize.height);
        
        //Setting defectpercent_totalTextField Settings and Location
        defectpercent_totalTextField.setSize(12, 40);
        Font defectpercent_totalTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        defectpercent_totalTextField.setFont(defectpercent_totalTextFieldFont);
        Dimension defectpercent_totalTextFieldSize = defectpercent_totalTextField.getPreferredSize();
        defectpercent_totalTextField.setBounds(1326 + insets.left, 147 + timeInPhaseLabelSize.height + planningLabel1Size.height + designLabel1Size.height + codeLabel1Size.height + compileLabel1Size.height + testLabel1Size.height + postmortemLabel1Size.height + insets.top, defectpercent_totalTextFieldSize.width, defectpercent_totalTextFieldSize.height);
        
        //Setting summaryLabel Settings and Location
        Font summaryLabelFont = new Font("Courier", Font.BOLD, 20);
        summaryLabel.setFont(summaryLabelFont);
        Dimension summaryLabelSize = summaryLabel.getPreferredSize();
        summaryLabel.setBounds(420 + insets.left, 440 + insets.top, summaryLabelSize.width, summaryLabelSize.height);

        //Setting programSizeLabel Settings and Location
        Font programSizeLabelFont = new Font("Courier", Font.PLAIN, 20);
        programSizeLabel.setFont(programSizeLabelFont);
        Dimension programSizeLabelSize = programSizeLabel.getPreferredSize();
        programSizeLabel.setBounds(400 + insets.left, 460 + summaryLabelSize.height + insets.top, programSizeLabelSize.width, programSizeLabelSize.height);
        
        //Setting productivityLabel Settings and Location
        Font productivityLabelFont = new Font("Courier", Font.PLAIN, 20);
        productivityLabel.setFont(productivityLabelFont);
        Dimension productivityLabelSize = productivityLabel.getPreferredSize();
        productivityLabel.setBounds(400 + insets.left, 470 + summaryLabelSize.height + programSizeLabelSize.height + insets.top, productivityLabelSize.width, productivityLabelSize.height);
        
        //Setting defectRateLabel Settings and Location
        Font defectRateLabelFont = new Font("Courier", Font.PLAIN, 20);
        defectRateLabel.setFont(defectRateLabelFont);
        Dimension defectRateLabelSize = defectRateLabel.getPreferredSize();
        defectRateLabel.setBounds(400 + insets.left, 480 + summaryLabelSize.height + programSizeLabelSize.height + productivityLabelSize.height + insets.top, defectRateLabelSize.width, defectRateLabelSize.height);
        
        //Setting actualLabel Settings and Location
        Font actualLabelFont = new Font("Courier", Font.BOLD, 20);
        actualLabel.setFont(actualLabelFont);
        Dimension actualLabelSize = actualLabel.getPreferredSize();
        actualLabel.setBounds(890 + insets.left, 440 + insets.top, actualLabelSize.width, actualLabelSize.height);
        
        //Setting toDateLabel Settings and Location
        Font toDateLabelFont = new Font("Courier", Font.BOLD, 20);
        toDateLabel.setFont(toDateLabelFont);
        Dimension toDateLabelSize = toDateLabel.getPreferredSize();
        toDateLabel.setBounds(1015 + insets.left, 440 + insets.top, toDateLabelSize.width, toDateLabelSize.height);
        
        //Setting sumactual_ProgramSizeTextField Settings and Location
        sumactual_ProgramSizeTextField.setSize(12, 40);
        Font sumactual_ProgramSizeTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        sumactual_ProgramSizeTextField.setFont(sumactual_ProgramSizeTextFieldFont);
        Dimension sumactual_ProgramSizeTextFieldSize = sumactual_ProgramSizeTextField.getPreferredSize();
        sumactual_ProgramSizeTextField.setBounds(889 + insets.left, 492 + insets.top, sumactual_ProgramSizeTextFieldSize.width, sumactual_ProgramSizeTextFieldSize.height);
        
        //Setting sumactual_ProductivityTextField Settings and Location
        sumactual_ProductivityTextField.setSize(12, 40);
        Font sumactual_ProductivityTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        sumactual_ProductivityTextField.setFont(sumactual_ProductivityTextFieldFont);
        Dimension sumactual_ProductivityTextFieldSize = sumactual_ProductivityTextField.getPreferredSize();
        sumactual_ProductivityTextField.setBounds(889 + insets.left, 529 + insets.top, sumactual_ProductivityTextFieldSize.width, sumactual_ProductivityTextFieldSize.height);
        
        //Setting sumactual_DefectRateTextField Settings and Location
        sumactual_DefectRateTextField.setSize(12, 40);
        Font sumactual_DefectRateTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        sumactual_DefectRateTextField.setFont(sumactual_DefectRateTextFieldFont);
        Dimension sumactual_DefectRateTextFieldSize = sumactual_DefectRateTextField.getPreferredSize();
        sumactual_DefectRateTextField.setBounds(889 + insets.left, 567 + insets.top, sumactual_DefectRateTextFieldSize.width, sumactual_DefectRateTextFieldSize.height);
        
        //Setting sumtodate_ProgramSizeTextField Settings and Location
        sumtodate_ProgramSizeTextField.setSize(12, 40);
        Font sumtodate_ProgramSizeTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        sumtodate_ProgramSizeTextField.setFont(sumtodate_ProgramSizeTextFieldFont);
        Dimension sumtodate_ProgramSizeTextFieldSize = sumtodate_ProgramSizeTextField.getPreferredSize();
        sumtodate_ProgramSizeTextField.setBounds(1020 + insets.left, 492 + insets.top, sumtodate_ProgramSizeTextFieldSize.width, sumtodate_ProgramSizeTextFieldSize.height);
        
        //Setting sumtodate_ProductivityTextField Settings and Location
        sumtodate_ProductivityTextField.setSize(12, 40);
        Font sumtodate_ProductivityTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        sumtodate_ProductivityTextField.setFont(sumtodate_ProductivityTextFieldFont);
        Dimension sumtodate_ProductivityTextFieldSize = sumtodate_ProductivityTextField.getPreferredSize();
        sumtodate_ProductivityTextField.setBounds(1020 + insets.left, 529 + insets.top, sumtodate_ProductivityTextFieldSize.width, sumtodate_ProductivityTextFieldSize.height);
        
        //Setting sumtodate_DefectRateTextField Settings and Location
        sumtodate_DefectRateTextField.setSize(12, 40);
        Font sumtodate_DefectRateTextFieldFont = new Font("Courier", Font.PLAIN, 12);
        sumtodate_DefectRateTextField.setFont(sumtodate_DefectRateTextFieldFont);
        Dimension sumtodate_DefectRateTextFieldSize = sumtodate_DefectRateTextField.getPreferredSize();
        sumtodate_DefectRateTextField.setBounds(1020 + insets.left, 567 + insets.top, sumtodate_DefectRateTextFieldSize.width, sumtodate_DefectRateTextFieldSize.height);
        
        //Add Components to PSP JPanel Container :) (fun part) 
        this.add(psp0Label);
        this.add(timeInPhaseLabel);
        this.add(actualTimeLabel);
        this.add(percentTotalLabel1);
        this.add(defectsInjectedLabel);
        this.add(actualNumberDefectsLabel);
        this.add(percentTotalLabel2);
        this.add(planningLabel1);
        this.add(planningLabel2);
        this.add(designLabel1);
        this.add(designLabel2);
        this.add(codeLabel1);
        this.add(codeLabel2);
        this.add(compileLabel1);
        this.add(compileLabel2);
        this.add(testLabel1);
        this.add(testLabel2);
        this.add(postmortemLabel1);
        this.add(postmortemLabel2);
        this.add(totalLabel1);
        this.add(totalLabel2);
        this.add(programSizeLabel);
        this.add(productivityLabel);
        this.add(defectRateLabel);
        this.add(time_planningTextField);
        this.add(time_designTextField);
        this.add(time_codeTextField);
        this.add(time_compileTextField);
        this.add(time_testTextField);
        this.add(time_postmortemTextField);
        this.add(time_totalTextField);
        this.add(timepercent_planningTextField);
        this.add(timepercent_designTextField);
        this.add(timepercent_codeTextField);
        this.add(timepercent_compileTextField);
        this.add(timepercent_testTextField);
        this.add(timepercent_postmortemTextField);
        this.add(timepercent_totalTextField);
        this.add(defect_planningTextField);
        this.add(defect_designTextField);
        this.add(defect_codeTextField);
        this.add(defect_compileTextField);
        this.add(defect_testTextField);
        this.add(defect_postmortemTextField);
        this.add(defect_totalTextField);
        this.add(defectpercent_planningTextField);
        this.add(defectpercent_designTextField);
        this.add(defectpercent_codeTextField);
        this.add(defectpercent_compileTextField);
        this.add(defectpercent_testTextField);
        this.add(defectpercent_postmortemTextField);
        this.add(defectpercent_totalTextField);
        this.add(sumactual_ProgramSizeTextField);
        this.add(sumactual_ProductivityTextField);
        this.add(sumactual_DefectRateTextField);
        this.add(sumtodate_ProgramSizeTextField);
        this.add(sumtodate_ProductivityTextField);
        this.add(sumtodate_DefectRateTextField);
        this.add(summaryLabel);
        this.add(actualLabel);
        this.add(toDateLabel);
    }
}