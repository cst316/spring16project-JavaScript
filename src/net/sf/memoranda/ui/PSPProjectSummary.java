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
        
    }
}