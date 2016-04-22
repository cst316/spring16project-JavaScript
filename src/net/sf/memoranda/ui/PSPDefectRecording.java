package net.sf.memoranda.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
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
import net.sf.memoranda.NoteList;
import net.sf.memoranda.Project;
import net.sf.memoranda.ProjectListener;
import net.sf.memoranda.Resource;
import net.sf.memoranda.ResourcesList;
import net.sf.memoranda.TaskList;
import net.sf.memoranda.ui.ResourcesPanel.PopupListener;
import net.sf.memoranda.util.AppList;
import net.sf.memoranda.util.CurrentStorage;
import net.sf.memoranda.util.Local;
import net.sf.memoranda.util.MimeType;
import net.sf.memoranda.util.MimeTypesList;
import net.sf.memoranda.util.Util;

import java.io.*;
import java.util.Scanner;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTextPane;

/*$Id: ResourcesPanel.java,v 1.13 2007/03/20 08:22:41 alexeya Exp $*/
public class PSPDefectRecording extends JPanel {
	private JTextField nameTitleField;
	private JTextField projectTitleField;
	private JTextField dateTitleField;
	private JTextField programNumField;
	private JTextField projectField1;
	private JTextField dateField1;
	private JTextField numberField1;
	private JTextField typeField1;
	private JTextField injectField1;
	private JTextField removeField1;
	private JTextField fixTimeField1;
	private JTextField fixRefField1;
	private JTextField descriptionField1;
	private JTextField projectField2;
	private JTextField dateField2;
	private JTextField numberField2;
	private JTextField typeField2;
	private JTextField injectField2;
	private JTextField removeField2;
	private JTextField fixTimeField2;
	private JTextField fixRefField2;
	private JTextField descriptionField2;
	private JTextField projectField3;
	private JTextField dateField3;
	private JTextField numberField3;
	private JTextField typeField3;
	private JTextField injectField3;
	private JTextField removeField3;
	private JTextField fixTimeField3;
	private JTextField fixRefField3;
	private JTextField descriptionField3;
	private JTextField projectField4;
	private JTextField dateField4;
	private JTextField numberField4;
	private JTextField typeField4;
	private JTextField injectField4;
	private JTextField removeField4;
	private JTextField fixTimeField4;
	private JTextField fixRefField4;
	private JTextField descriptionField4;
	private JTextField projectField5;
	private JTextField dateField5;
	private JTextField numberField5;
	private JTextField typeField5;
	private JTextField injectField5;
	private JTextField removeField5;
	private JTextField fixTimeField5;
	private JTextField fixRefField5;
	private JTextField descriptionField5;
	private JTextField projectField6;
	private JTextField dateField6;
	private JTextField numberField6;
	private JTextField typeField6;
	private JTextField injectField6;
	private JTextField removeField6;
	private JTextField fixTimeField6;
	private JTextField fixRefField6;
	private JTextField descriptionField6;
	private JTextField projectField7;
	private JTextField dateField7;
	private JTextField numberField7;
	private JTextField typeField7;
	private JTextField injectField7;
	private JTextField removeField7;
	private JTextField fixTimeField7;
	private JTextField fixRefField7;
	private JTextField descriptionField7;
	private JTextField projectField8;
	private JTextField dateField8;
	private JTextField numberField8;
	private JTextField typeField8;
	private JTextField injectField8;
	private JTextField removeField8;
	private JTextField fixTimeField8;
	private JTextField fixRefField8;
	private JTextField descriptionField8;
	private JTextField projectField9;
	private JTextField dateField9;
	private JTextField numberField9;
	private JTextField typeField9;
	private JTextField injectField9;
	private JTextField removeField9;
	private JTextField fixTimeField9;
	private JTextField fixRefField9;
	private JTextField descriptionField9;
	
	String fileName;
	FileWriter fw;
	BufferedWriter bw;
	PrintWriter out;
	FileReader fReader;
	int counter = 0;
	String line;
    
    public PSPDefectRecording() {
    	
    		
        try {
            jbInit();
                        
        }
        catch (Exception ex) {
           new ExceptionDialog(ex);
        }
    }
    void jbInit() throws Exception {
    	JLabel nameTitleLabel = new JLabel("Name:");
    	
    	nameTitleField = new JTextField();
    	nameTitleField.setColumns(10);
    	
    	JLabel projectTitleLabel = new JLabel("Project:");
    	
    	projectTitleField = new JTextField();
    	projectTitleField.setFont(new Font("Lucida Grande", Font.BOLD, 13));
    	projectTitleField.setEditable(false);
    	projectTitleField.setColumns(10);
    	
    	projectTitleField.setText(CurrentProject.get().getTitle());
    	
    	CurrentProject.addProjectListener(new ProjectListener() {
			public void projectChange(
				Project p,
				NoteList nl,
				TaskList tl,
				ResourcesList rl) {
			}
			public void projectWasChanged() {
				projectTitleField.setText(CurrentProject.get().getTitle());
				fileName = "ProjectFiles/" + CurrentProject.get().getTitle() + ".txt";
				try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
				
				try{
		    		fReader = new FileReader(fileName);
		    		BufferedReader bReader = new BufferedReader(fReader);
		    	
		    		while((line = bReader.readLine()) != null){
		    			counter++;
		    			if(counter == 1){
		    				nameTitleField.setText("" + bReader.read());
		    				System.out.println("HHHHHEEEERRRRE " + bReader.readLine());
		    			}
		    		}
		    		}catch(Exception e){
		    		e.printStackTrace();
		    		}finally{
		    		if(fReader != null)
						try {
							fReader.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
		    		}
				
				nameTitleField.setText("");
				dateTitleField.setText("");
				programNumField.setText("");
				projectField1.setText("");
				dateField1.setText("");
				numberField1.setText("");
				typeField1.setText("");
				injectField1.setText("");
				removeField1.setText("");
				fixTimeField1.setText("");
				fixRefField1.setText("");
				descriptionField1.setText("");
				projectField2.setText("");
				dateField2.setText("");
				numberField2.setText("");
				typeField2.setText("");
				injectField2.setText("");
				removeField2.setText("");
				fixTimeField2.setText("");
				fixRefField2.setText("");
				descriptionField2.setText("");
				projectField3.setText("");
				dateField3.setText("");
				numberField3.setText("");
				typeField3.setText("");
				injectField3.setText("");
				removeField3.setText("");
				fixTimeField3.setText("");
				fixRefField3.setText("");
				descriptionField3.setText("");
				projectField4.setText("");
				dateField4.setText("");
				numberField4.setText("");
				typeField4.setText("");
				injectField4.setText("");
				removeField4.setText("");
				fixTimeField4.setText("");
				fixRefField4.setText("");
				descriptionField4.setText("");
				projectField5.setText("");
				dateField5.setText("");
				numberField5.setText("");
				typeField5.setText("");
				injectField5.setText("");
				removeField5.setText("");
				fixTimeField5.setText("");
				fixRefField5.setText("");
				descriptionField5.setText("");
				projectField6.setText("");
				dateField6.setText("");
				numberField6.setText("");
				typeField6.setText("");
				injectField6.setText("");
				removeField6.setText("");
				fixTimeField6.setText("");
				fixRefField6.setText("");
				descriptionField6.setText("");
				projectField7.setText("");
				dateField7.setText("");
				numberField7.setText("");
				typeField7.setText("");
				injectField7.setText("");
				removeField7.setText("");
				fixTimeField7.setText("");
				fixRefField7.setText("");
				descriptionField7.setText("");
				projectField8.setText("");
				dateField8.setText("");
				numberField8.setText("");
				typeField8.setText("");
				injectField8.setText("");
				removeField8.setText("");
				fixTimeField8.setText("");
				fixRefField8.setText("");
				descriptionField8.setText("");
				projectField9.setText("");
				dateField9.setText("");
				numberField9.setText("");
				typeField9.setText("");
				injectField9.setText("");
				removeField9.setText("");
				fixTimeField9.setText("");
				fixRefField9.setText("");
				descriptionField9.setText("");
				
				try{
		    		fReader = new FileReader(fileName);
		    		BufferedReader bReader = new BufferedReader(fReader);
		    		int counter = 0;
		    		
		    		File file = new File(fileName);
		    		@SuppressWarnings("resource")
					Scanner scanner = new Scanner(file);
		    		
		    		while((line = bReader.readLine()) != null){
		    			counter++;
		    			if(counter == 1){
		    				nameTitleField.setText(scanner.nextLine());
		    			}
		    			else if(counter == 2){
		    				
		    				dateTitleField.setText(scanner.nextLine());
		    			}
		    			else if(counter == 3){
		    				
		    				programNumField.setText(scanner.nextLine());
		    			}
		    			else if(counter == 4){
		    				
		    				projectField1.setText(scanner.nextLine());
		    			}
		    			else if(counter == 5){
		    				
		    				dateField1.setText(scanner.nextLine());
		    			}
		    			else if(counter == 6){
		    				
		    				numberField1.setText(scanner.nextLine());
		    			}
		    			else if(counter == 7){
		    				
		    				typeField1.setText(scanner.nextLine());
		    			}
		    			else if(counter == 8){
		    				
		    				injectField1.setText(scanner.nextLine());
		    			}
		    			else if(counter == 9){
		    				
		    				removeField1.setText(scanner.nextLine());
		    			}
		    			else if(counter == 10){
		    				
		    				fixTimeField1.setText(scanner.nextLine());
		    			}
		    			else if(counter == 11){
		    				
		    				fixRefField1.setText(scanner.nextLine());
		    			}
		    			else if(counter == 12){
		    				
		    				descriptionField1.setText(scanner.nextLine());
		    			}
		    			else if(counter == 13){
		    				
		    				projectField2.setText(scanner.nextLine());
		    			}
		    			else if(counter == 14){
		    				
		    				dateField2.setText(scanner.nextLine());
		    			}
		    			else if(counter == 15){
		    				
		    				numberField2.setText(scanner.nextLine());
		    			}
		    			else if(counter == 16){
		    				
		    				typeField2.setText(scanner.nextLine());
		    			}
		    			else if(counter == 17){
		    				
		    				injectField2.setText(scanner.nextLine());
		    			}
		    			else if(counter == 18){
		    				
		    				removeField2.setText(scanner.nextLine());
		    			}
		    			else if(counter == 19){
		    				
		    				fixTimeField2.setText(scanner.nextLine());
		    			}
		    			else if(counter == 20){
		    				
		    				fixRefField2.setText(scanner.nextLine());
		    			}
		    			else if(counter == 21){
		    				
		    				descriptionField2.setText(scanner.nextLine());
		    			}
		    			else if(counter == 222){
		    				
		    				projectField3.setText(scanner.nextLine());
		    			}
		    			else if(counter == 23){
		    				
		    				dateField3.setText(scanner.nextLine());
		    			}
		    			else if(counter == 24){
		    				
		    				numberField3.setText(scanner.nextLine());
		    			}
		    			else if(counter == 25){
		    				
		    				typeField3.setText(scanner.nextLine());
		    			}
		    			else if(counter == 26){
		    				
		    				injectField3.setText(scanner.nextLine());
		    			}
		    			else if(counter == 27){
		    				
		    				removeField3.setText(scanner.nextLine());
		    			}
		    			else if(counter == 28){
		    				
		    				fixTimeField3.setText(scanner.nextLine());
		    			}
		    			else if(counter == 29){
		    				
		    				fixRefField3.setText(scanner.nextLine());
		    			}
		    			else if(counter == 30){
		    				
		    				descriptionField3.setText(scanner.nextLine());
		    			}
		    			else if(counter == 31){
		    				
		    				projectField4.setText(scanner.nextLine());
		    			}
		    			else if(counter == 32){
		    				
		    				dateField4.setText(scanner.nextLine());
		    			}
		    			else if(counter == 33){
		    				
		    				numberField4.setText(scanner.nextLine());
		    			}
		    			else if(counter == 34){
		    				
		    				typeField4.setText(scanner.nextLine());
		    			}
		    			else if(counter == 35){
		    				
		    				injectField4.setText(scanner.nextLine());
		    			}
		    			else if(counter == 36){
		    				
		    				removeField4.setText(scanner.nextLine());
		    			}
		    			else if(counter == 37){
		    				
		    				fixTimeField4.setText(scanner.nextLine());
		    			}
		    			else if(counter == 38){
		    				
		    				fixRefField4.setText(scanner.nextLine());
		    			}
		    			else if(counter == 39){
		    				
		    				descriptionField4.setText(scanner.nextLine());
		    			}
		    			else if(counter == 40){
		    				
		    				projectField5.setText(scanner.nextLine());
		    			}
		    			else if(counter == 41){
		    				
		    				dateField5.setText(scanner.nextLine());
		    			}
		    			else if(counter == 42){
		    				
		    				numberField5.setText(scanner.nextLine());
		    			}
		    			else if(counter == 43){
		    				
		    				typeField5.setText(scanner.nextLine());
		    			}
		    			else if(counter == 44){
		    				
		    				injectField5.setText(scanner.nextLine());
		    			}
		    			else if(counter == 45){
		    				
		    				removeField5.setText(scanner.nextLine());
		    			}
		    			else if(counter == 46){
		    				
		    				fixTimeField5.setText(scanner.nextLine());
		    			}
		    			else if(counter == 47){
		    				
		    				fixRefField5.setText(scanner.nextLine());
		    			}
		    			else if(counter == 48){
		    				descriptionField5.setText(scanner.nextLine());
		    			}
		    			else if(counter == 49){
		    				projectField6.setText(scanner.nextLine());
		    			}
		    			else if(counter == 50){
		    				dateField6.setText(scanner.nextLine());
		    			}
		    			else if(counter == 51){
		    				numberField6.setText(scanner.nextLine());
		    			}
		    			else if(counter == 52){
		    				typeField6.setText(scanner.nextLine());
		    			}
		    			else if(counter == 53){
		    				injectField6.setText(scanner.nextLine());
		    			}
		    			else if(counter == 54){
		    				;
		    				removeField6.setText(scanner.nextLine());
		    			}
		    			else if(counter == 55){
		    				
		    				fixTimeField6.setText(scanner.nextLine());
		    			}
		    			else if(counter == 56){
		    				
		    				fixRefField6.setText(scanner.nextLine());
		    			}
		    			else if(counter == 57){
		    				
		    				descriptionField6.setText(scanner.nextLine());
		    			}
		    			else if(counter == 58){
		    				
		    				projectField7.setText(scanner.nextLine());
		    			}
		    			else if(counter == 59){
		    				
		    				dateField7.setText(scanner.nextLine());
		    			}
		    			else if(counter == 60){
		    				
		    				numberField7.setText(scanner.nextLine());
		    			}
		    			else if(counter == 61){
		    				
		    				typeField7.setText(scanner.nextLine());
		    			}
		    			else if(counter == 62){
		    				
		    				injectField7.setText(scanner.nextLine());
		    			}
		    			else if(counter == 63){
		    				
		    				removeField7.setText(scanner.nextLine());
		    			}
		    			else if(counter == 64){
		    				
		    				fixTimeField7.setText(scanner.nextLine());
		    			}
		    			else if(counter == 65){
		    				
		    				fixRefField7.setText(scanner.nextLine());
		    			}
		    			else if(counter == 66){
		    				descriptionField7.setText(scanner.nextLine());
		    			}
		    			else if(counter == 67){
		    				
		    				projectField8.setText(scanner.nextLine());
		    			}
		    			else if(counter == 68){
		    				
		    				dateField8.setText(scanner.nextLine());
		    			}
		    			else if(counter == 69){
		    				
		    				numberField8.setText(scanner.nextLine());
		    			}
		    			else if(counter == 70){
		    				
		    				typeField8.setText(scanner.nextLine());
		    			}
		    			else if(counter == 71){
		    				
		    				injectField8.setText(scanner.nextLine());
		    			}
		    			else if(counter == 72){
		    				
		    				removeField8.setText(scanner.nextLine());
		    			}
		    			else if(counter == 73){
		    				
		    				fixTimeField8.setText(scanner.nextLine());
		    			}
		    			else if(counter == 74){
		    				
		    				fixRefField8.setText(scanner.nextLine());
		    			}
		    			else if(counter == 75){
		    				descriptionField8.setText(scanner.nextLine());
		    			}
		    			else if(counter == 76){
		    				
		    				projectField9.setText(scanner.nextLine());
		    			}
		    			else if(counter == 77){
		    				
		    				dateField9.setText(scanner.nextLine());
		    			}
		    			else if(counter == 78){
		    				
		    				numberField9.setText(scanner.nextLine());
		    			}
		    			else if(counter == 79){
		    				
		    				typeField9.setText(scanner.nextLine());
		    			}
		    			else if(counter == 80){
		    				
		    				injectField9.setText(scanner.nextLine());
		    			}
		    			else if(counter == 81){
		    				
		    				removeField9.setText(scanner.nextLine());
		    			}
		    			else if(counter == 82){
		    				
		    				fixTimeField9.setText(scanner.nextLine());
		    			}
		    			else if(counter == 83){
		    				
		    				fixRefField9.setText(scanner.nextLine());
		    			}
		    			else if(counter == 84){
		    				descriptionField9.setText(scanner.nextLine());
		    			}
		    			
		    			}
		    		}catch(Exception e){
		    		e.printStackTrace();
		    		}finally{
		   
		    		if(fReader != null)
						try {
							fReader.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
		    		}
				
				projectTitleField.updateUI();
			}
		});
    	
    		JLabel dateTitleLabel = new JLabel("Date:");
    	
    	dateTitleField = new JTextField();
    	dateTitleField.setColumns(10);
    	
    	JLabel programNumLabel = new JLabel("Program #:");
    	
    	programNumField = new JTextField();
    	programNumField.setColumns(10);
    	
    	JPanel defectPanel1 = new JPanel();
    	GridBagLayout gbl_defectPanel1 = new GridBagLayout();
    	gbl_defectPanel1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    	gbl_defectPanel1.rowHeights = new int[]{0, 0, 0, 0};
    	gbl_defectPanel1.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    	gbl_defectPanel1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
    	defectPanel1.setLayout(gbl_defectPanel1);
    	
    	JLabel projectLabel1 = new JLabel("Project");
    	GridBagConstraints gbc_projectLabel1 = new GridBagConstraints();
    	gbc_projectLabel1.insets = new Insets(0, 0, 5, 5);
    	gbc_projectLabel1.gridx = 0;
    	gbc_projectLabel1.gridy = 0;
    	defectPanel1.add(projectLabel1, gbc_projectLabel1);
    	
    	JLabel dateLabel1 = new JLabel("Date");
    	GridBagConstraints gbc_dateLabel1 = new GridBagConstraints();
    	gbc_dateLabel1.anchor = GridBagConstraints.NORTH;
    	gbc_dateLabel1.insets = new Insets(0, 0, 5, 5);
    	gbc_dateLabel1.gridx = 1;
    	gbc_dateLabel1.gridy = 0;
    	defectPanel1.add(dateLabel1, gbc_dateLabel1);
    	
    	JLabel numberLabel1 = new JLabel("Number");
    	GridBagConstraints gbc_numberLabel1 = new GridBagConstraints();
    	gbc_numberLabel1.insets = new Insets(0, 0, 5, 5);
    	gbc_numberLabel1.gridx = 2;
    	gbc_numberLabel1.gridy = 0;
    	defectPanel1.add(numberLabel1, gbc_numberLabel1);
    	
    	JLabel typeLabel1 = new JLabel("Type");
    	GridBagConstraints gbc_typeLabel1 = new GridBagConstraints();
    	gbc_typeLabel1.insets = new Insets(0, 0, 5, 5);
    	gbc_typeLabel1.gridx = 3;
    	gbc_typeLabel1.gridy = 0;
    	defectPanel1.add(typeLabel1, gbc_typeLabel1);
    	
    	JLabel injectLabel1 = new JLabel("Inject");
    	GridBagConstraints gbc_injectLabel1 = new GridBagConstraints();
    	gbc_injectLabel1.insets = new Insets(0, 0, 5, 5);
    	gbc_injectLabel1.gridx = 4;
    	gbc_injectLabel1.gridy = 0;
    	defectPanel1.add(injectLabel1, gbc_injectLabel1);
    	
    	JLabel removeLabel1 = new JLabel("Remove");
    	GridBagConstraints gbc_removeLabel1 = new GridBagConstraints();
    	gbc_removeLabel1.insets = new Insets(0, 0, 5, 5);
    	gbc_removeLabel1.gridx = 5;
    	gbc_removeLabel1.gridy = 0;
    	defectPanel1.add(removeLabel1, gbc_removeLabel1);
    	
    	JLabel fixTimeLabel1 = new JLabel("Fix Time");
    	GridBagConstraints gbc_fixTimeLabel1 = new GridBagConstraints();
    	gbc_fixTimeLabel1.insets = new Insets(0, 0, 5, 5);
    	gbc_fixTimeLabel1.gridx = 6;
    	gbc_fixTimeLabel1.gridy = 0;
    	defectPanel1.add(fixTimeLabel1, gbc_fixTimeLabel1);
    	
    	JLabel fixRefLabel1 = new JLabel("Fix Ref");
    	GridBagConstraints gbc_fixRefLabel1 = new GridBagConstraints();
    	gbc_fixRefLabel1.insets = new Insets(0, 0, 5, 5);
    	gbc_fixRefLabel1.gridx = 7;
    	gbc_fixRefLabel1.gridy = 0;
    	defectPanel1.add(fixRefLabel1, gbc_fixRefLabel1);
    	
    	projectField1 = new JTextField();
    	projectField1.setColumns(10);
    	GridBagConstraints gbc_projectField1 = new GridBagConstraints();
    	gbc_projectField1.fill = GridBagConstraints.HORIZONTAL;
    	gbc_projectField1.insets = new Insets(0, 0, 5, 5);
    	gbc_projectField1.gridx = 0;
    	gbc_projectField1.gridy = 1;
    	defectPanel1.add(projectField1, gbc_projectField1);
    	
    	dateField1 = new JTextField();
    	dateField1.setColumns(10);
    	GridBagConstraints gbc_dateField1 = new GridBagConstraints();
    	gbc_dateField1.fill = GridBagConstraints.HORIZONTAL;
    	gbc_dateField1.insets = new Insets(0, 0, 5, 5);
    	gbc_dateField1.gridx = 1;
    	gbc_dateField1.gridy = 1;
    	defectPanel1.add(dateField1, gbc_dateField1);
    	
    	numberField1 = new JTextField();
    	numberField1.setColumns(10);
    	GridBagConstraints gbc_numberField1 = new GridBagConstraints();
    	gbc_numberField1.fill = GridBagConstraints.HORIZONTAL;
    	gbc_numberField1.insets = new Insets(0, 0, 5, 5);
    	gbc_numberField1.gridx = 2;
    	gbc_numberField1.gridy = 1;
    	defectPanel1.add(numberField1, gbc_numberField1);
    	
    	typeField1 = new JTextField();
    	typeField1.setColumns(10);
    	GridBagConstraints gbc_typeField1 = new GridBagConstraints();
    	gbc_typeField1.fill = GridBagConstraints.HORIZONTAL;
    	gbc_typeField1.insets = new Insets(0, 0, 5, 5);
    	gbc_typeField1.gridx = 3;
    	gbc_typeField1.gridy = 1;
    	defectPanel1.add(typeField1, gbc_typeField1);
    	
    	injectField1 = new JTextField();
    	injectField1.setColumns(10);
    	GridBagConstraints gbc_injectField1 = new GridBagConstraints();
    	gbc_injectField1.fill = GridBagConstraints.HORIZONTAL;
    	gbc_injectField1.insets = new Insets(0, 0, 5, 5);
    	gbc_injectField1.gridx = 4;
    	gbc_injectField1.gridy = 1;
    	defectPanel1.add(injectField1, gbc_injectField1);
    	
    	removeField1 = new JTextField();
    	removeField1.setColumns(10);
    	GridBagConstraints gbc_removeField1 = new GridBagConstraints();
    	gbc_removeField1.fill = GridBagConstraints.HORIZONTAL;
    	gbc_removeField1.insets = new Insets(0, 0, 5, 5);
    	gbc_removeField1.gridx = 5;
    	gbc_removeField1.gridy = 1;
    	defectPanel1.add(removeField1, gbc_removeField1);
    	
    	fixTimeField1 = new JTextField();
    	fixTimeField1.setColumns(10);
    	GridBagConstraints gbc_fixTimeField1 = new GridBagConstraints();
    	gbc_fixTimeField1.fill = GridBagConstraints.HORIZONTAL;
    	gbc_fixTimeField1.insets = new Insets(0, 0, 5, 5);
    	gbc_fixTimeField1.gridx = 6;
    	gbc_fixTimeField1.gridy = 1;
    	defectPanel1.add(fixTimeField1, gbc_fixTimeField1);
    	
    	fixRefField1 = new JTextField();
    	fixRefField1.setColumns(10);
    	GridBagConstraints gbc_fixRefField1 = new GridBagConstraints();
    	gbc_fixRefField1.fill = GridBagConstraints.HORIZONTAL;
    	gbc_fixRefField1.insets = new Insets(0, 0, 5, 5);
    	gbc_fixRefField1.gridx = 7;
    	gbc_fixRefField1.gridy = 1;
    	defectPanel1.add(fixRefField1, gbc_fixRefField1);
    	
    	JLabel descriptionLabel1 = new JLabel("Description");
    	GridBagConstraints gbc_descriptionLabel1 = new GridBagConstraints();
    	gbc_descriptionLabel1.anchor = GridBagConstraints.EAST;
    	gbc_descriptionLabel1.insets = new Insets(0, 0, 0, 5);
    	gbc_descriptionLabel1.gridx = 0;
    	gbc_descriptionLabel1.gridy = 2;
    	defectPanel1.add(descriptionLabel1, gbc_descriptionLabel1);
    	
    	descriptionField1 = new JTextField();
    	descriptionField1.setColumns(10);
    	GridBagConstraints gbc_descriptionField1 = new GridBagConstraints();
    	gbc_descriptionField1.fill = GridBagConstraints.HORIZONTAL;
    	gbc_descriptionField1.gridwidth = 7;
    	gbc_descriptionField1.insets = new Insets(0, 0, 0, 5);
    	gbc_descriptionField1.gridx = 1;
    	gbc_descriptionField1.gridy = 2;
    	defectPanel1.add(descriptionField1, gbc_descriptionField1);
    	
    	JPanel defectPanel2 = new JPanel();
    	GridBagLayout gbl_defectPanel2 = new GridBagLayout();
    	gbl_defectPanel2.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    	gbl_defectPanel2.rowHeights = new int[]{0, 0, 0, 0};
    	gbl_defectPanel2.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    	gbl_defectPanel2.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
    	defectPanel2.setLayout(gbl_defectPanel2);
    	
    	JLabel projectLabel2 = new JLabel("Project");
    	GridBagConstraints gbc_projectLabel2 = new GridBagConstraints();
    	gbc_projectLabel2.insets = new Insets(0, 0, 5, 5);
    	gbc_projectLabel2.gridx = 0;
    	gbc_projectLabel2.gridy = 0;
    	defectPanel2.add(projectLabel2, gbc_projectLabel2);
    	
    	JLabel dateLabel2 = new JLabel("Date");
    	GridBagConstraints gbc_dateLabel2 = new GridBagConstraints();
    	gbc_dateLabel2.anchor = GridBagConstraints.NORTH;
    	gbc_dateLabel2.insets = new Insets(0, 0, 5, 5);
    	gbc_dateLabel2.gridx = 1;
    	gbc_dateLabel2.gridy = 0;
    	defectPanel2.add(dateLabel2, gbc_dateLabel2);
    	
    	JLabel numberLabel2 = new JLabel("Number");
    	GridBagConstraints gbc_numberLabel2 = new GridBagConstraints();
    	gbc_numberLabel2.insets = new Insets(0, 0, 5, 5);
    	gbc_numberLabel2.gridx = 2;
    	gbc_numberLabel2.gridy = 0;
    	defectPanel2.add(numberLabel2, gbc_numberLabel2);
    	
    	JLabel typeLabel2 = new JLabel("Type");
    	GridBagConstraints gbc_typeLabel2 = new GridBagConstraints();
    	gbc_typeLabel2.insets = new Insets(0, 0, 5, 5);
    	gbc_typeLabel2.gridx = 3;
    	gbc_typeLabel2.gridy = 0;
    	defectPanel2.add(typeLabel2, gbc_typeLabel2);
    	
    	JLabel injectLabel2 = new JLabel("Inject");
    	GridBagConstraints gbc_injectLabel2 = new GridBagConstraints();
    	gbc_injectLabel2.insets = new Insets(0, 0, 5, 5);
    	gbc_injectLabel2.gridx = 4;
    	gbc_injectLabel2.gridy = 0;
    	defectPanel2.add(injectLabel2, gbc_injectLabel2);
    	
    	JLabel removeLabel2 = new JLabel("Remove");
    	GridBagConstraints gbc_removeLabel2 = new GridBagConstraints();
    	gbc_removeLabel2.insets = new Insets(0, 0, 5, 5);
    	gbc_removeLabel2.gridx = 5;
    	gbc_removeLabel2.gridy = 0;
    	defectPanel2.add(removeLabel2, gbc_removeLabel2);
    	
    	JLabel fixTimeLabel2 = new JLabel("Fix Time");
    	GridBagConstraints gbc_fixTimeLabel2 = new GridBagConstraints();
    	gbc_fixTimeLabel2.insets = new Insets(0, 0, 5, 5);
    	gbc_fixTimeLabel2.gridx = 6;
    	gbc_fixTimeLabel2.gridy = 0;
    	defectPanel2.add(fixTimeLabel2, gbc_fixTimeLabel2);
    	
    	JLabel fixRefLabel2 = new JLabel("Fix Ref");
    	GridBagConstraints gbc_fixRefLabel2 = new GridBagConstraints();
    	gbc_fixRefLabel2.insets = new Insets(0, 0, 5, 5);
    	gbc_fixRefLabel2.gridx = 7;
    	gbc_fixRefLabel2.gridy = 0;
    	defectPanel2.add(fixRefLabel2, gbc_fixRefLabel2);
    	
    	projectField2 = new JTextField();
    	projectField2.setColumns(10);
    	GridBagConstraints gbc_projectField2 = new GridBagConstraints();
    	gbc_projectField2.fill = GridBagConstraints.HORIZONTAL;
    	gbc_projectField2.insets = new Insets(0, 0, 5, 5);
    	gbc_projectField2.gridx = 0;
    	gbc_projectField2.gridy = 1;
    	defectPanel2.add(projectField2, gbc_projectField2);
    	
    	dateField2 = new JTextField();
    	dateField2.setColumns(10);
    	GridBagConstraints gbc_dateField2 = new GridBagConstraints();
    	gbc_dateField2.fill = GridBagConstraints.HORIZONTAL;
    	gbc_dateField2.insets = new Insets(0, 0, 5, 5);
    	gbc_dateField2.gridx = 1;
    	gbc_dateField2.gridy = 1;
    	defectPanel2.add(dateField2, gbc_dateField2);
    	
    	numberField2 = new JTextField();
    	numberField2.setColumns(10);
    	GridBagConstraints gbc_numberField2 = new GridBagConstraints();
    	gbc_numberField2.fill = GridBagConstraints.HORIZONTAL;
    	gbc_numberField2.insets = new Insets(0, 0, 5, 5);
    	gbc_numberField2.gridx = 2;
    	gbc_numberField2.gridy = 1;
    	defectPanel2.add(numberField2, gbc_numberField2);
    	
    	typeField2 = new JTextField();
    	typeField2.setColumns(10);
    	GridBagConstraints gbc_typeField2 = new GridBagConstraints();
    	gbc_typeField2.fill = GridBagConstraints.HORIZONTAL;
    	gbc_typeField2.insets = new Insets(0, 0, 5, 5);
    	gbc_typeField2.gridx = 3;
    	gbc_typeField2.gridy = 1;
    	defectPanel2.add(typeField2, gbc_typeField2);
    	
    	injectField2 = new JTextField();
    	injectField2.setColumns(10);
    	GridBagConstraints gbc_injectField2 = new GridBagConstraints();
    	gbc_injectField2.fill = GridBagConstraints.HORIZONTAL;
    	gbc_injectField2.insets = new Insets(0, 0, 5, 5);
    	gbc_injectField2.gridx = 4;
    	gbc_injectField2.gridy = 1;
    	defectPanel2.add(injectField2, gbc_injectField2);
    	
    	removeField2 = new JTextField();
    	removeField2.setColumns(10);
    	GridBagConstraints gbc_removeField2 = new GridBagConstraints();
    	gbc_removeField2.fill = GridBagConstraints.HORIZONTAL;
    	gbc_removeField2.insets = new Insets(0, 0, 5, 5);
    	gbc_removeField2.gridx = 5;
    	gbc_removeField2.gridy = 1;
    	defectPanel2.add(removeField2, gbc_removeField2);
    	
    	fixTimeField2 = new JTextField();
    	fixTimeField2.setColumns(10);
    	GridBagConstraints gbc_fixTimeField2 = new GridBagConstraints();
    	gbc_fixTimeField2.fill = GridBagConstraints.HORIZONTAL;
    	gbc_fixTimeField2.insets = new Insets(0, 0, 5, 5);
    	gbc_fixTimeField2.gridx = 6;
    	gbc_fixTimeField2.gridy = 1;
    	defectPanel2.add(fixTimeField2, gbc_fixTimeField2);
    	
    	fixRefField2 = new JTextField();
    	fixRefField2.setColumns(10);
    	GridBagConstraints gbc_fixRefField2 = new GridBagConstraints();
    	gbc_fixRefField2.fill = GridBagConstraints.HORIZONTAL;
    	gbc_fixRefField2.insets = new Insets(0, 0, 5, 5);
    	gbc_fixRefField2.gridx = 7;
    	gbc_fixRefField2.gridy = 1;
    	defectPanel2.add(fixRefField2, gbc_fixRefField2);
    	
    	JLabel descriptionLabel2 = new JLabel("Description");
    	GridBagConstraints gbc_descriptionLabel2 = new GridBagConstraints();
    	gbc_descriptionLabel2.anchor = GridBagConstraints.EAST;
    	gbc_descriptionLabel2.insets = new Insets(0, 0, 0, 5);
    	gbc_descriptionLabel2.gridx = 0;
    	gbc_descriptionLabel2.gridy = 2;
    	defectPanel2.add(descriptionLabel2, gbc_descriptionLabel2);
    	
    	descriptionField2 = new JTextField();
    	descriptionField2.setColumns(10);
    	GridBagConstraints gbc_descriptionField2 = new GridBagConstraints();
    	gbc_descriptionField2.fill = GridBagConstraints.HORIZONTAL;
    	gbc_descriptionField2.gridwidth = 7;
    	gbc_descriptionField2.insets = new Insets(0, 0, 0, 5);
    	gbc_descriptionField2.gridx = 1;
    	gbc_descriptionField2.gridy = 2;
    	defectPanel2.add(descriptionField2, gbc_descriptionField2);
    	
    	JPanel defectPanel3 = new JPanel();
    	GridBagLayout gbl_defectPanel3 = new GridBagLayout();
    	gbl_defectPanel3.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    	gbl_defectPanel3.rowHeights = new int[]{0, 0, 0, 0};
    	gbl_defectPanel3.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    	gbl_defectPanel3.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
    	defectPanel3.setLayout(gbl_defectPanel3);
    	
    	JLabel projectLabel3 = new JLabel("Project");
    	GridBagConstraints gbc_projectLabel3 = new GridBagConstraints();
    	gbc_projectLabel3.insets = new Insets(0, 0, 5, 5);
    	gbc_projectLabel3.gridx = 0;
    	gbc_projectLabel3.gridy = 0;
    	defectPanel3.add(projectLabel3, gbc_projectLabel3);
    	
    	JLabel dateLabel3 = new JLabel("Date");
    	GridBagConstraints gbc_dateLabel3 = new GridBagConstraints();
    	gbc_dateLabel3.anchor = GridBagConstraints.NORTH;
    	gbc_dateLabel3.insets = new Insets(0, 0, 5, 5);
    	gbc_dateLabel3.gridx = 1;
    	gbc_dateLabel3.gridy = 0;
    	defectPanel3.add(dateLabel3, gbc_dateLabel3);
    	
    	JLabel numberLabel3 = new JLabel("Number");
    	GridBagConstraints gbc_numberLabel3 = new GridBagConstraints();
    	gbc_numberLabel3.insets = new Insets(0, 0, 5, 5);
    	gbc_numberLabel3.gridx = 2;
    	gbc_numberLabel3.gridy = 0;
    	defectPanel3.add(numberLabel3, gbc_numberLabel3);
    	
    	JLabel typeLabel3 = new JLabel("Type");
    	GridBagConstraints gbc_typeLabel3 = new GridBagConstraints();
    	gbc_typeLabel3.insets = new Insets(0, 0, 5, 5);
    	gbc_typeLabel3.gridx = 3;
    	gbc_typeLabel3.gridy = 0;
    	defectPanel3.add(typeLabel3, gbc_typeLabel3);
    	
    	JLabel injectLabel3 = new JLabel("Inject");
    	GridBagConstraints gbc_injectLabel3 = new GridBagConstraints();
    	gbc_injectLabel3.insets = new Insets(0, 0, 5, 5);
    	gbc_injectLabel3.gridx = 4;
    	gbc_injectLabel3.gridy = 0;
    	defectPanel3.add(injectLabel3, gbc_injectLabel3);
    	
    	JLabel removeLabel3 = new JLabel("Remove");
    	GridBagConstraints gbc_removeLabel3 = new GridBagConstraints();
    	gbc_removeLabel3.insets = new Insets(0, 0, 5, 5);
    	gbc_removeLabel3.gridx = 5;
    	gbc_removeLabel3.gridy = 0;
    	defectPanel3.add(removeLabel3, gbc_removeLabel3);
    	
    	JLabel fixTimeLabel3 = new JLabel("Fix Time");
    	GridBagConstraints gbc_fixTimeLabel3 = new GridBagConstraints();
    	gbc_fixTimeLabel3.insets = new Insets(0, 0, 5, 5);
    	gbc_fixTimeLabel3.gridx = 6;
    	gbc_fixTimeLabel3.gridy = 0;
    	defectPanel3.add(fixTimeLabel3, gbc_fixTimeLabel3);
    	
    	JLabel fixRefLabel3 = new JLabel("Fix Ref");
    	GridBagConstraints gbc_fixRefLabel3 = new GridBagConstraints();
    	gbc_fixRefLabel3.insets = new Insets(0, 0, 5, 5);
    	gbc_fixRefLabel3.gridx = 7;
    	gbc_fixRefLabel3.gridy = 0;
    	defectPanel3.add(fixRefLabel3, gbc_fixRefLabel3);
    	
    	projectField3 = new JTextField();
    	projectField3.setColumns(10);
    	GridBagConstraints gbc_projectField3 = new GridBagConstraints();
    	gbc_projectField3.fill = GridBagConstraints.HORIZONTAL;
    	gbc_projectField3.insets = new Insets(0, 0, 5, 5);
    	gbc_projectField3.gridx = 0;
    	gbc_projectField3.gridy = 1;
    	defectPanel3.add(projectField3, gbc_projectField3);
    	
    	dateField3 = new JTextField();
    	dateField3.setColumns(10);
    	GridBagConstraints gbc_dateField3 = new GridBagConstraints();
    	gbc_dateField3.fill = GridBagConstraints.HORIZONTAL;
    	gbc_dateField3.insets = new Insets(0, 0, 5, 5);
    	gbc_dateField3.gridx = 1;
    	gbc_dateField3.gridy = 1;
    	defectPanel3.add(dateField3, gbc_dateField3);
    	
    	numberField3 = new JTextField();
    	numberField3.setColumns(10);
    	GridBagConstraints gbc_numberField3 = new GridBagConstraints();
    	gbc_numberField3.fill = GridBagConstraints.HORIZONTAL;
    	gbc_numberField3.insets = new Insets(0, 0, 5, 5);
    	gbc_numberField3.gridx = 2;
    	gbc_numberField3.gridy = 1;
    	defectPanel3.add(numberField3, gbc_numberField3);
    	
    	typeField3 = new JTextField();
    	typeField3.setColumns(10);
    	GridBagConstraints gbc_typeField3 = new GridBagConstraints();
    	gbc_typeField3.fill = GridBagConstraints.HORIZONTAL;
    	gbc_typeField3.insets = new Insets(0, 0, 5, 5);
    	gbc_typeField3.gridx = 3;
    	gbc_typeField3.gridy = 1;
    	defectPanel3.add(typeField3, gbc_typeField3);
    	
    	injectField3 = new JTextField();
    	injectField3.setColumns(10);
    	GridBagConstraints gbc_injectField3 = new GridBagConstraints();
    	gbc_injectField3.fill = GridBagConstraints.HORIZONTAL;
    	gbc_injectField3.insets = new Insets(0, 0, 5, 5);
    	gbc_injectField3.gridx = 4;
    	gbc_injectField3.gridy = 1;
    	defectPanel3.add(injectField3, gbc_injectField3);
    	
    	removeField3 = new JTextField();
    	removeField3.setColumns(10);
    	GridBagConstraints gbc_removeField3 = new GridBagConstraints();
    	gbc_removeField3.fill = GridBagConstraints.HORIZONTAL;
    	gbc_removeField3.insets = new Insets(0, 0, 5, 5);
    	gbc_removeField3.gridx = 5;
    	gbc_removeField3.gridy = 1;
    	defectPanel3.add(removeField3, gbc_removeField3);
    	
    	fixTimeField3 = new JTextField();
    	fixTimeField3.setColumns(10);
    	GridBagConstraints gbc_fixTimeField3 = new GridBagConstraints();
    	gbc_fixTimeField3.fill = GridBagConstraints.HORIZONTAL;
    	gbc_fixTimeField3.insets = new Insets(0, 0, 5, 5);
    	gbc_fixTimeField3.gridx = 6;
    	gbc_fixTimeField3.gridy = 1;
    	defectPanel3.add(fixTimeField3, gbc_fixTimeField3);
    	
    	fixRefField3 = new JTextField();
    	fixRefField3.setColumns(10);
    	GridBagConstraints gbc_fixRefField3 = new GridBagConstraints();
    	gbc_fixRefField3.fill = GridBagConstraints.HORIZONTAL;
    	gbc_fixRefField3.insets = new Insets(0, 0, 5, 5);
    	gbc_fixRefField3.gridx = 7;
    	gbc_fixRefField3.gridy = 1;
    	defectPanel3.add(fixRefField3, gbc_fixRefField3);
    	
    	JLabel descriptionLabel3 = new JLabel("Description");
    	GridBagConstraints gbc_descriptionLabel3 = new GridBagConstraints();
    	gbc_descriptionLabel3.anchor = GridBagConstraints.EAST;
    	gbc_descriptionLabel3.insets = new Insets(0, 0, 0, 5);
    	gbc_descriptionLabel3.gridx = 0;
    	gbc_descriptionLabel3.gridy = 2;
    	defectPanel3.add(descriptionLabel3, gbc_descriptionLabel3);
    	
    	descriptionField3 = new JTextField();
    	descriptionField3.setColumns(10);
    	GridBagConstraints gbc_descriptionField3 = new GridBagConstraints();
    	gbc_descriptionField3.fill = GridBagConstraints.HORIZONTAL;
    	gbc_descriptionField3.gridwidth = 7;
    	gbc_descriptionField3.insets = new Insets(0, 0, 0, 5);
    	gbc_descriptionField3.gridx = 1;
    	gbc_descriptionField3.gridy = 2;
    	defectPanel3.add(descriptionField3, gbc_descriptionField3);
    	
    	JPanel defectPanel4 = new JPanel();
    	GridBagLayout gbl_defectPanel4 = new GridBagLayout();
    	gbl_defectPanel4.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    	gbl_defectPanel4.rowHeights = new int[]{0, 0, 0, 0};
    	gbl_defectPanel4.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    	gbl_defectPanel4.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
    	defectPanel4.setLayout(gbl_defectPanel4);
    	
    	JLabel projectLabel4 = new JLabel("Project");
    	GridBagConstraints gbc_projectLabel4 = new GridBagConstraints();
    	gbc_projectLabel4.insets = new Insets(0, 0, 5, 5);
    	gbc_projectLabel4.gridx = 0;
    	gbc_projectLabel4.gridy = 0;
    	defectPanel4.add(projectLabel4, gbc_projectLabel4);
    	
    	JLabel dateLabel4 = new JLabel("Date");
    	GridBagConstraints gbc_dateLabel4 = new GridBagConstraints();
    	gbc_dateLabel4.anchor = GridBagConstraints.NORTH;
    	gbc_dateLabel4.insets = new Insets(0, 0, 5, 5);
    	gbc_dateLabel4.gridx = 1;
    	gbc_dateLabel4.gridy = 0;
    	defectPanel4.add(dateLabel4, gbc_dateLabel4);
    	
    	JLabel numberLabel4_1 = new JLabel("Number");
    	GridBagConstraints gbc_numberLabel4_1 = new GridBagConstraints();
    	gbc_numberLabel4_1.insets = new Insets(0, 0, 5, 5);
    	gbc_numberLabel4_1.gridx = 2;
    	gbc_numberLabel4_1.gridy = 0;
    	defectPanel4.add(numberLabel4_1, gbc_numberLabel4_1);
    	
    	JLabel typeLabel4 = new JLabel("Type");
    	GridBagConstraints gbc_typeLabel4 = new GridBagConstraints();
    	gbc_typeLabel4.insets = new Insets(0, 0, 5, 5);
    	gbc_typeLabel4.gridx = 3;
    	gbc_typeLabel4.gridy = 0;
    	defectPanel4.add(typeLabel4, gbc_typeLabel4);
    	
    	JLabel injectLabel4 = new JLabel("Inject");
    	GridBagConstraints gbc_injectLabel4 = new GridBagConstraints();
    	gbc_injectLabel4.insets = new Insets(0, 0, 5, 5);
    	gbc_injectLabel4.gridx = 4;
    	gbc_injectLabel4.gridy = 0;
    	defectPanel4.add(injectLabel4, gbc_injectLabel4);
    	
    	JLabel removeLabel4 = new JLabel("Remove");
    	GridBagConstraints gbc_removeLabel4 = new GridBagConstraints();
    	gbc_removeLabel4.insets = new Insets(0, 0, 5, 5);
    	gbc_removeLabel4.gridx = 5;
    	gbc_removeLabel4.gridy = 0;
    	defectPanel4.add(removeLabel4, gbc_removeLabel4);
    	
    	JLabel fixTimeLabel4 = new JLabel("Fix Time");
    	GridBagConstraints gbc_fixTimeLabel4 = new GridBagConstraints();
    	gbc_fixTimeLabel4.insets = new Insets(0, 0, 5, 5);
    	gbc_fixTimeLabel4.gridx = 6;
    	gbc_fixTimeLabel4.gridy = 0;
    	defectPanel4.add(fixTimeLabel4, gbc_fixTimeLabel4);
    	
    	JLabel fixRefLabel4 = new JLabel("Fix Ref");
    	GridBagConstraints gbc_fixRefLabel4 = new GridBagConstraints();
    	gbc_fixRefLabel4.insets = new Insets(0, 0, 5, 5);
    	gbc_fixRefLabel4.gridx = 7;
    	gbc_fixRefLabel4.gridy = 0;
    	defectPanel4.add(fixRefLabel4, gbc_fixRefLabel4);
    	
    	projectField4 = new JTextField();
    	projectField4.setColumns(10);
    	GridBagConstraints gbc_projectField4 = new GridBagConstraints();
    	gbc_projectField4.fill = GridBagConstraints.HORIZONTAL;
    	gbc_projectField4.insets = new Insets(0, 0, 5, 5);
    	gbc_projectField4.gridx = 0;
    	gbc_projectField4.gridy = 1;
    	defectPanel4.add(projectField4, gbc_projectField4);
    	
    	dateField4 = new JTextField();
    	dateField4.setColumns(10);
    	GridBagConstraints gbc_dateField4 = new GridBagConstraints();
    	gbc_dateField4.fill = GridBagConstraints.HORIZONTAL;
    	gbc_dateField4.insets = new Insets(0, 0, 5, 5);
    	gbc_dateField4.gridx = 1;
    	gbc_dateField4.gridy = 1;
    	defectPanel4.add(dateField4, gbc_dateField4);
    	
    	numberField4 = new JTextField();
    	numberField4.setColumns(10);
    	GridBagConstraints gbc_numberField4 = new GridBagConstraints();
    	gbc_numberField4.fill = GridBagConstraints.HORIZONTAL;
    	gbc_numberField4.insets = new Insets(0, 0, 5, 5);
    	gbc_numberField4.gridx = 2;
    	gbc_numberField4.gridy = 1;
    	defectPanel4.add(numberField4, gbc_numberField4);
    	
    	typeField4 = new JTextField();
    	typeField4.setColumns(10);
    	GridBagConstraints gbc_typeField4 = new GridBagConstraints();
    	gbc_typeField4.fill = GridBagConstraints.HORIZONTAL;
    	gbc_typeField4.insets = new Insets(0, 0, 5, 5);
    	gbc_typeField4.gridx = 3;
    	gbc_typeField4.gridy = 1;
    	defectPanel4.add(typeField4, gbc_typeField4);
    	
    	injectField4 = new JTextField();
    	injectField4.setColumns(10);
    	GridBagConstraints gbc_injectField4 = new GridBagConstraints();
    	gbc_injectField4.fill = GridBagConstraints.HORIZONTAL;
    	gbc_injectField4.insets = new Insets(0, 0, 5, 5);
    	gbc_injectField4.gridx = 4;
    	gbc_injectField4.gridy = 1;
    	defectPanel4.add(injectField4, gbc_injectField4);
    	
    	removeField4 = new JTextField();
    	removeField4.setColumns(10);
    	GridBagConstraints gbc_removeField4 = new GridBagConstraints();
    	gbc_removeField4.fill = GridBagConstraints.HORIZONTAL;
    	gbc_removeField4.insets = new Insets(0, 0, 5, 5);
    	gbc_removeField4.gridx = 5;
    	gbc_removeField4.gridy = 1;
    	defectPanel4.add(removeField4, gbc_removeField4);
    	
    	fixTimeField4 = new JTextField();
    	fixTimeField4.setColumns(10);
    	GridBagConstraints gbc_fixTimeField4 = new GridBagConstraints();
    	gbc_fixTimeField4.fill = GridBagConstraints.HORIZONTAL;
    	gbc_fixTimeField4.insets = new Insets(0, 0, 5, 5);
    	gbc_fixTimeField4.gridx = 6;
    	gbc_fixTimeField4.gridy = 1;
    	defectPanel4.add(fixTimeField4, gbc_fixTimeField4);
    	
    	fixRefField4 = new JTextField();
    	fixRefField4.setColumns(10);
    	GridBagConstraints gbc_fixRefField4 = new GridBagConstraints();
    	gbc_fixRefField4.fill = GridBagConstraints.HORIZONTAL;
    	gbc_fixRefField4.insets = new Insets(0, 0, 5, 5);
    	gbc_fixRefField4.gridx = 7;
    	gbc_fixRefField4.gridy = 1;
    	defectPanel4.add(fixRefField4, gbc_fixRefField4);
    	
    	JLabel descriptionLabel4 = new JLabel("Description");
    	GridBagConstraints gbc_descriptionLabel4 = new GridBagConstraints();
    	gbc_descriptionLabel4.anchor = GridBagConstraints.EAST;
    	gbc_descriptionLabel4.insets = new Insets(0, 0, 0, 5);
    	gbc_descriptionLabel4.gridx = 0;
    	gbc_descriptionLabel4.gridy = 2;
    	defectPanel4.add(descriptionLabel4, gbc_descriptionLabel4);
    	
    	descriptionField4 = new JTextField();
    	descriptionField4.setColumns(10);
    	GridBagConstraints gbc_descriptionField4 = new GridBagConstraints();
    	gbc_descriptionField4.fill = GridBagConstraints.HORIZONTAL;
    	gbc_descriptionField4.gridwidth = 7;
    	gbc_descriptionField4.insets = new Insets(0, 0, 0, 5);
    	gbc_descriptionField4.gridx = 1;
    	gbc_descriptionField4.gridy = 2;
    	defectPanel4.add(descriptionField4, gbc_descriptionField4);
    	
    	JPanel defectPanel5 = new JPanel();
    	GridBagLayout gbl_defectPanel5 = new GridBagLayout();
    	gbl_defectPanel5.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    	gbl_defectPanel5.rowHeights = new int[]{0, 0, 0, 0};
    	gbl_defectPanel5.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    	gbl_defectPanel5.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
    	defectPanel5.setLayout(gbl_defectPanel5);
    	
    	JLabel projectLabel5 = new JLabel("Project");
    	GridBagConstraints gbc_projectLabel5 = new GridBagConstraints();
    	gbc_projectLabel5.insets = new Insets(0, 0, 5, 5);
    	gbc_projectLabel5.gridx = 0;
    	gbc_projectLabel5.gridy = 0;
    	defectPanel5.add(projectLabel5, gbc_projectLabel5);
    	
    	JLabel dateLabel5 = new JLabel("Date");
    	GridBagConstraints gbc_dateLabel5 = new GridBagConstraints();
    	gbc_dateLabel5.anchor = GridBagConstraints.NORTH;
    	gbc_dateLabel5.insets = new Insets(0, 0, 5, 5);
    	gbc_dateLabel5.gridx = 1;
    	gbc_dateLabel5.gridy = 0;
    	defectPanel5.add(dateLabel5, gbc_dateLabel5);
    	
    	JLabel numberLabel5 = new JLabel("Number");
    	GridBagConstraints gbc_numberLabel5 = new GridBagConstraints();
    	gbc_numberLabel5.insets = new Insets(0, 0, 5, 5);
    	gbc_numberLabel5.gridx = 2;
    	gbc_numberLabel5.gridy = 0;
    	defectPanel5.add(numberLabel5, gbc_numberLabel5);
    	
    	JLabel typeLabel5 = new JLabel("Type");
    	GridBagConstraints gbc_typeLabel5 = new GridBagConstraints();
    	gbc_typeLabel5.insets = new Insets(0, 0, 5, 5);
    	gbc_typeLabel5.gridx = 3;
    	gbc_typeLabel5.gridy = 0;
    	defectPanel5.add(typeLabel5, gbc_typeLabel5);
    	
    	JLabel injectLabel5 = new JLabel("Inject");
    	GridBagConstraints gbc_injectLabel5 = new GridBagConstraints();
    	gbc_injectLabel5.insets = new Insets(0, 0, 5, 5);
    	gbc_injectLabel5.gridx = 4;
    	gbc_injectLabel5.gridy = 0;
    	defectPanel5.add(injectLabel5, gbc_injectLabel5);
    	
    	JLabel removeLabel5 = new JLabel("Remove");
    	GridBagConstraints gbc_removeLabel5 = new GridBagConstraints();
    	gbc_removeLabel5.insets = new Insets(0, 0, 5, 5);
    	gbc_removeLabel5.gridx = 5;
    	gbc_removeLabel5.gridy = 0;
    	defectPanel5.add(removeLabel5, gbc_removeLabel5);
    	
    	JLabel fixTimeLabel5 = new JLabel("Fix Time");
    	GridBagConstraints gbc_fixTimeLabel5 = new GridBagConstraints();
    	gbc_fixTimeLabel5.insets = new Insets(0, 0, 5, 5);
    	gbc_fixTimeLabel5.gridx = 6;
    	gbc_fixTimeLabel5.gridy = 0;
    	defectPanel5.add(fixTimeLabel5, gbc_fixTimeLabel5);
    	
    	JLabel fixRefLabel5 = new JLabel("Fix Ref");
    	GridBagConstraints gbc_fixRefLabel5 = new GridBagConstraints();
    	gbc_fixRefLabel5.insets = new Insets(0, 0, 5, 5);
    	gbc_fixRefLabel5.gridx = 7;
    	gbc_fixRefLabel5.gridy = 0;
    	defectPanel5.add(fixRefLabel5, gbc_fixRefLabel5);
    	
    	projectField5 = new JTextField();
    	projectField5.setColumns(10);
    	GridBagConstraints gbc_projectField5 = new GridBagConstraints();
    	gbc_projectField5.fill = GridBagConstraints.HORIZONTAL;
    	gbc_projectField5.insets = new Insets(0, 0, 5, 5);
    	gbc_projectField5.gridx = 0;
    	gbc_projectField5.gridy = 1;
    	defectPanel5.add(projectField5, gbc_projectField5);
    	
    	dateField5 = new JTextField();
    	dateField5.setColumns(10);
    	GridBagConstraints gbc_dateField5 = new GridBagConstraints();
    	gbc_dateField5.fill = GridBagConstraints.HORIZONTAL;
    	gbc_dateField5.insets = new Insets(0, 0, 5, 5);
    	gbc_dateField5.gridx = 1;
    	gbc_dateField5.gridy = 1;
    	defectPanel5.add(dateField5, gbc_dateField5);
    	
    	numberField5 = new JTextField();
    	numberField5.setColumns(10);
    	GridBagConstraints gbc_numberField5 = new GridBagConstraints();
    	gbc_numberField5.fill = GridBagConstraints.HORIZONTAL;
    	gbc_numberField5.insets = new Insets(0, 0, 5, 5);
    	gbc_numberField5.gridx = 2;
    	gbc_numberField5.gridy = 1;
    	defectPanel5.add(numberField5, gbc_numberField5);
    	
    	typeField5 = new JTextField();
    	typeField5.setColumns(10);
    	GridBagConstraints gbc_typeField5 = new GridBagConstraints();
    	gbc_typeField5.fill = GridBagConstraints.HORIZONTAL;
    	gbc_typeField5.insets = new Insets(0, 0, 5, 5);
    	gbc_typeField5.gridx = 3;
    	gbc_typeField5.gridy = 1;
    	defectPanel5.add(typeField5, gbc_typeField5);
    	
    	injectField5 = new JTextField();
    	injectField5.setColumns(10);
    	GridBagConstraints gbc_injectField5 = new GridBagConstraints();
    	gbc_injectField5.fill = GridBagConstraints.HORIZONTAL;
    	gbc_injectField5.insets = new Insets(0, 0, 5, 5);
    	gbc_injectField5.gridx = 4;
    	gbc_injectField5.gridy = 1;
    	defectPanel5.add(injectField5, gbc_injectField5);
    	
    	removeField5 = new JTextField();
    	removeField5.setColumns(10);
    	GridBagConstraints gbc_removeField5 = new GridBagConstraints();
    	gbc_removeField5.fill = GridBagConstraints.HORIZONTAL;
    	gbc_removeField5.insets = new Insets(0, 0, 5, 5);
    	gbc_removeField5.gridx = 5;
    	gbc_removeField5.gridy = 1;
    	defectPanel5.add(removeField5, gbc_removeField5);
    	
    	fixTimeField5 = new JTextField();
    	fixTimeField5.setColumns(10);
    	GridBagConstraints gbc_fixTimeField5 = new GridBagConstraints();
    	gbc_fixTimeField5.fill = GridBagConstraints.HORIZONTAL;
    	gbc_fixTimeField5.insets = new Insets(0, 0, 5, 5);
    	gbc_fixTimeField5.gridx = 6;
    	gbc_fixTimeField5.gridy = 1;
    	defectPanel5.add(fixTimeField5, gbc_fixTimeField5);
    	
    	fixRefField5 = new JTextField();
    	fixRefField5.setColumns(10);
    	GridBagConstraints gbc_fixRefField5 = new GridBagConstraints();
    	gbc_fixRefField5.fill = GridBagConstraints.HORIZONTAL;
    	gbc_fixRefField5.insets = new Insets(0, 0, 5, 5);
    	gbc_fixRefField5.gridx = 7;
    	gbc_fixRefField5.gridy = 1;
    	defectPanel5.add(fixRefField5, gbc_fixRefField5);
    	
    	JLabel descriptionLabel5 = new JLabel("Description");
    	GridBagConstraints gbc_descriptionLabel5 = new GridBagConstraints();
    	gbc_descriptionLabel5.anchor = GridBagConstraints.EAST;
    	gbc_descriptionLabel5.insets = new Insets(0, 0, 0, 5);
    	gbc_descriptionLabel5.gridx = 0;
    	gbc_descriptionLabel5.gridy = 2;
    	defectPanel5.add(descriptionLabel5, gbc_descriptionLabel5);
    	
    	descriptionField5 = new JTextField();
    	descriptionField5.setColumns(10);
    	GridBagConstraints gbc_descriptionField5 = new GridBagConstraints();
    	gbc_descriptionField5.fill = GridBagConstraints.HORIZONTAL;
    	gbc_descriptionField5.gridwidth = 7;
    	gbc_descriptionField5.insets = new Insets(0, 0, 0, 5);
    	gbc_descriptionField5.gridx = 1;
    	gbc_descriptionField5.gridy = 2;
    	defectPanel5.add(descriptionField5, gbc_descriptionField5);
    	
    	JPanel defectPanel6 = new JPanel();
    	GridBagLayout gbl_defectPanel6 = new GridBagLayout();
    	gbl_defectPanel6.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    	gbl_defectPanel6.rowHeights = new int[]{0, 0, 0, 0};
    	gbl_defectPanel6.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    	gbl_defectPanel6.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
    	defectPanel6.setLayout(gbl_defectPanel6);
    	
    	JLabel projectLabel6 = new JLabel("Project");
    	GridBagConstraints gbc_projectLabel6 = new GridBagConstraints();
    	gbc_projectLabel6.insets = new Insets(0, 0, 5, 5);
    	gbc_projectLabel6.gridx = 0;
    	gbc_projectLabel6.gridy = 0;
    	defectPanel6.add(projectLabel6, gbc_projectLabel6);
    	
    	JLabel dateLabel6 = new JLabel("Date");
    	GridBagConstraints gbc_dateLabel6 = new GridBagConstraints();
    	gbc_dateLabel6.anchor = GridBagConstraints.NORTH;
    	gbc_dateLabel6.insets = new Insets(0, 0, 5, 5);
    	gbc_dateLabel6.gridx = 1;
    	gbc_dateLabel6.gridy = 0;
    	defectPanel6.add(dateLabel6, gbc_dateLabel6);
    	
    	JLabel numberLabel6 = new JLabel("Number");
    	GridBagConstraints gbc_numberLabel6 = new GridBagConstraints();
    	gbc_numberLabel6.insets = new Insets(0, 0, 5, 5);
    	gbc_numberLabel6.gridx = 2;
    	gbc_numberLabel6.gridy = 0;
    	defectPanel6.add(numberLabel6, gbc_numberLabel6);
    	
    	JLabel typeLabel6 = new JLabel("Type");
    	GridBagConstraints gbc_typeLabel6 = new GridBagConstraints();
    	gbc_typeLabel6.insets = new Insets(0, 0, 5, 5);
    	gbc_typeLabel6.gridx = 3;
    	gbc_typeLabel6.gridy = 0;
    	defectPanel6.add(typeLabel6, gbc_typeLabel6);
    	
    	JLabel injectLabel6 = new JLabel("Inject");
    	GridBagConstraints gbc_injectLabel6 = new GridBagConstraints();
    	gbc_injectLabel6.insets = new Insets(0, 0, 5, 5);
    	gbc_injectLabel6.gridx = 4;
    	gbc_injectLabel6.gridy = 0;
    	defectPanel6.add(injectLabel6, gbc_injectLabel6);
    	
    	JLabel removeLabel6 = new JLabel("Remove");
    	GridBagConstraints gbc_removeLabel6 = new GridBagConstraints();
    	gbc_removeLabel6.insets = new Insets(0, 0, 5, 5);
    	gbc_removeLabel6.gridx = 5;
    	gbc_removeLabel6.gridy = 0;
    	defectPanel6.add(removeLabel6, gbc_removeLabel6);
    	
    	JLabel fixTimeLabel6 = new JLabel("Fix Time");
    	GridBagConstraints gbc_fixTimeLabel6 = new GridBagConstraints();
    	gbc_fixTimeLabel6.insets = new Insets(0, 0, 5, 5);
    	gbc_fixTimeLabel6.gridx = 6;
    	gbc_fixTimeLabel6.gridy = 0;
    	defectPanel6.add(fixTimeLabel6, gbc_fixTimeLabel6);
    	
    	JLabel fixRefLabel6 = new JLabel("Fix Ref");
    	GridBagConstraints gbc_fixRefLabel6 = new GridBagConstraints();
    	gbc_fixRefLabel6.insets = new Insets(0, 0, 5, 5);
    	gbc_fixRefLabel6.gridx = 7;
    	gbc_fixRefLabel6.gridy = 0;
    	defectPanel6.add(fixRefLabel6, gbc_fixRefLabel6);
    	
    	projectField6 = new JTextField();
    	projectField6.setColumns(10);
    	GridBagConstraints gbc_projectField6 = new GridBagConstraints();
    	gbc_projectField6.fill = GridBagConstraints.HORIZONTAL;
    	gbc_projectField6.insets = new Insets(0, 0, 5, 5);
    	gbc_projectField6.gridx = 0;
    	gbc_projectField6.gridy = 1;
    	defectPanel6.add(projectField6, gbc_projectField6);
    	
    	dateField6 = new JTextField();
    	dateField6.setColumns(10);
    	GridBagConstraints gbc_dateField6 = new GridBagConstraints();
    	gbc_dateField6.fill = GridBagConstraints.HORIZONTAL;
    	gbc_dateField6.insets = new Insets(0, 0, 5, 5);
    	gbc_dateField6.gridx = 1;
    	gbc_dateField6.gridy = 1;
    	defectPanel6.add(dateField6, gbc_dateField6);
    	
    	numberField6 = new JTextField();
    	numberField6.setColumns(10);
    	GridBagConstraints gbc_numberField6 = new GridBagConstraints();
    	gbc_numberField6.fill = GridBagConstraints.HORIZONTAL;
    	gbc_numberField6.insets = new Insets(0, 0, 5, 5);
    	gbc_numberField6.gridx = 2;
    	gbc_numberField6.gridy = 1;
    	defectPanel6.add(numberField6, gbc_numberField6);
    	
    	typeField6 = new JTextField();
    	typeField6.setColumns(10);
    	GridBagConstraints gbc_typeField6 = new GridBagConstraints();
    	gbc_typeField6.fill = GridBagConstraints.HORIZONTAL;
    	gbc_typeField6.insets = new Insets(0, 0, 5, 5);
    	gbc_typeField6.gridx = 3;
    	gbc_typeField6.gridy = 1;
    	defectPanel6.add(typeField6, gbc_typeField6);
    	
    	injectField6 = new JTextField();
    	injectField6.setColumns(10);
    	GridBagConstraints gbc_injectField6 = new GridBagConstraints();
    	gbc_injectField6.fill = GridBagConstraints.HORIZONTAL;
    	gbc_injectField6.insets = new Insets(0, 0, 5, 5);
    	gbc_injectField6.gridx = 4;
    	gbc_injectField6.gridy = 1;
    	defectPanel6.add(injectField6, gbc_injectField6);
    	
    	removeField6 = new JTextField();
    	removeField6.setColumns(10);
    	GridBagConstraints gbc_removeField6 = new GridBagConstraints();
    	gbc_removeField6.fill = GridBagConstraints.HORIZONTAL;
    	gbc_removeField6.insets = new Insets(0, 0, 5, 5);
    	gbc_removeField6.gridx = 5;
    	gbc_removeField6.gridy = 1;
    	defectPanel6.add(removeField6, gbc_removeField6);
    	
    	fixTimeField6 = new JTextField();
    	fixTimeField6.setColumns(10);
    	GridBagConstraints gbc_fixTimeField6 = new GridBagConstraints();
    	gbc_fixTimeField6.fill = GridBagConstraints.HORIZONTAL;
    	gbc_fixTimeField6.insets = new Insets(0, 0, 5, 5);
    	gbc_fixTimeField6.gridx = 6;
    	gbc_fixTimeField6.gridy = 1;
    	defectPanel6.add(fixTimeField6, gbc_fixTimeField6);
    	
    	fixRefField6 = new JTextField();
    	fixRefField6.setColumns(10);
    	GridBagConstraints gbc_fixRefField6 = new GridBagConstraints();
    	gbc_fixRefField6.fill = GridBagConstraints.HORIZONTAL;
    	gbc_fixRefField6.insets = new Insets(0, 0, 5, 5);
    	gbc_fixRefField6.gridx = 7;
    	gbc_fixRefField6.gridy = 1;
    	defectPanel6.add(fixRefField6, gbc_fixRefField6);
    	
    	JLabel descriptionLabel6 = new JLabel("Description");
    	GridBagConstraints gbc_descriptionLabel6 = new GridBagConstraints();
    	gbc_descriptionLabel6.anchor = GridBagConstraints.EAST;
    	gbc_descriptionLabel6.insets = new Insets(0, 0, 0, 5);
    	gbc_descriptionLabel6.gridx = 0;
    	gbc_descriptionLabel6.gridy = 2;
    	defectPanel6.add(descriptionLabel6, gbc_descriptionLabel6);
    	
    	descriptionField6 = new JTextField();
    	descriptionField6.setColumns(10);
    	GridBagConstraints gbc_descriptionField6 = new GridBagConstraints();
    	gbc_descriptionField6.fill = GridBagConstraints.HORIZONTAL;
    	gbc_descriptionField6.gridwidth = 7;
    	gbc_descriptionField6.insets = new Insets(0, 0, 0, 5);
    	gbc_descriptionField6.gridx = 1;
    	gbc_descriptionField6.gridy = 2;
    	defectPanel6.add(descriptionField6, gbc_descriptionField6);
    	
    	JPanel defectPanel7 = new JPanel();
    	GridBagLayout gbl_defectPanel7 = new GridBagLayout();
    	gbl_defectPanel7.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    	gbl_defectPanel7.rowHeights = new int[]{0, 0, 0, 0};
    	gbl_defectPanel7.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    	gbl_defectPanel7.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
    	defectPanel7.setLayout(gbl_defectPanel7);
    	
    	JLabel projectLabel7 = new JLabel("Project");
    	GridBagConstraints gbc_projectLabel7 = new GridBagConstraints();
    	gbc_projectLabel7.insets = new Insets(0, 0, 5, 5);
    	gbc_projectLabel7.gridx = 0;
    	gbc_projectLabel7.gridy = 0;
    	defectPanel7.add(projectLabel7, gbc_projectLabel7);
    	
    	JLabel dateLabel7 = new JLabel("Date");
    	GridBagConstraints gbc_dateLabel7 = new GridBagConstraints();
    	gbc_dateLabel7.anchor = GridBagConstraints.NORTH;
    	gbc_dateLabel7.insets = new Insets(0, 0, 5, 5);
    	gbc_dateLabel7.gridx = 1;
    	gbc_dateLabel7.gridy = 0;
    	defectPanel7.add(dateLabel7, gbc_dateLabel7);
    	
    	JLabel numberLabel7 = new JLabel("Number");
    	GridBagConstraints gbc_numberLabel7 = new GridBagConstraints();
    	gbc_numberLabel7.insets = new Insets(0, 0, 5, 5);
    	gbc_numberLabel7.gridx = 2;
    	gbc_numberLabel7.gridy = 0;
    	defectPanel7.add(numberLabel7, gbc_numberLabel7);
    	
    	JLabel typeLabel7 = new JLabel("Type");
    	GridBagConstraints gbc_typeLabel7 = new GridBagConstraints();
    	gbc_typeLabel7.insets = new Insets(0, 0, 5, 5);
    	gbc_typeLabel7.gridx = 3;
    	gbc_typeLabel7.gridy = 0;
    	defectPanel7.add(typeLabel7, gbc_typeLabel7);
    	
    	JLabel injectLabel7 = new JLabel("Inject");
    	GridBagConstraints gbc_injectLabel7 = new GridBagConstraints();
    	gbc_injectLabel7.insets = new Insets(0, 0, 5, 5);
    	gbc_injectLabel7.gridx = 4;
    	gbc_injectLabel7.gridy = 0;
    	defectPanel7.add(injectLabel7, gbc_injectLabel7);
    	
    	JLabel removeLabel7 = new JLabel("Remove");
    	GridBagConstraints gbc_removeLabel7 = new GridBagConstraints();
    	gbc_removeLabel7.insets = new Insets(0, 0, 5, 5);
    	gbc_removeLabel7.gridx = 5;
    	gbc_removeLabel7.gridy = 0;
    	defectPanel7.add(removeLabel7, gbc_removeLabel7);
    	
    	JLabel fixTimeLabel7 = new JLabel("Fix Time");
    	GridBagConstraints gbc_fixTimeLabel7 = new GridBagConstraints();
    	gbc_fixTimeLabel7.insets = new Insets(0, 0, 5, 5);
    	gbc_fixTimeLabel7.gridx = 6;
    	gbc_fixTimeLabel7.gridy = 0;
    	defectPanel7.add(fixTimeLabel7, gbc_fixTimeLabel7);
    	
    	JLabel fixRefLabel7 = new JLabel("Fix Ref");
    	GridBagConstraints gbc_fixRefLabel7 = new GridBagConstraints();
    	gbc_fixRefLabel7.insets = new Insets(0, 0, 5, 5);
    	gbc_fixRefLabel7.gridx = 7;
    	gbc_fixRefLabel7.gridy = 0;
    	defectPanel7.add(fixRefLabel7, gbc_fixRefLabel7);
    	
    	projectField7 = new JTextField();
    	projectField7.setColumns(10);
    	GridBagConstraints gbc_projectField7 = new GridBagConstraints();
    	gbc_projectField7.fill = GridBagConstraints.HORIZONTAL;
    	gbc_projectField7.insets = new Insets(0, 0, 5, 5);
    	gbc_projectField7.gridx = 0;
    	gbc_projectField7.gridy = 1;
    	defectPanel7.add(projectField7, gbc_projectField7);
    	
    	dateField7 = new JTextField();
    	dateField7.setColumns(10);
    	GridBagConstraints gbc_dateField7 = new GridBagConstraints();
    	gbc_dateField7.fill = GridBagConstraints.HORIZONTAL;
    	gbc_dateField7.insets = new Insets(0, 0, 5, 5);
    	gbc_dateField7.gridx = 1;
    	gbc_dateField7.gridy = 1;
    	defectPanel7.add(dateField7, gbc_dateField7);
    	
    	numberField7 = new JTextField();
    	numberField7.setColumns(10);
    	GridBagConstraints gbc_numberField7 = new GridBagConstraints();
    	gbc_numberField7.fill = GridBagConstraints.HORIZONTAL;
    	gbc_numberField7.insets = new Insets(0, 0, 5, 5);
    	gbc_numberField7.gridx = 2;
    	gbc_numberField7.gridy = 1;
    	defectPanel7.add(numberField7, gbc_numberField7);
    	
    	typeField7 = new JTextField();
    	typeField7.setColumns(10);
    	GridBagConstraints gbc_typeField7 = new GridBagConstraints();
    	gbc_typeField7.fill = GridBagConstraints.HORIZONTAL;
    	gbc_typeField7.insets = new Insets(0, 0, 5, 5);
    	gbc_typeField7.gridx = 3;
    	gbc_typeField7.gridy = 1;
    	defectPanel7.add(typeField7, gbc_typeField7);
    	
    	injectField7 = new JTextField();
    	injectField7.setColumns(10);
    	GridBagConstraints gbc_injectField7 = new GridBagConstraints();
    	gbc_injectField7.fill = GridBagConstraints.HORIZONTAL;
    	gbc_injectField7.insets = new Insets(0, 0, 5, 5);
    	gbc_injectField7.gridx = 4;
    	gbc_injectField7.gridy = 1;
    	defectPanel7.add(injectField7, gbc_injectField7);
    	
    	removeField7 = new JTextField();
    	removeField7.setColumns(10);
    	GridBagConstraints gbc_removeField7 = new GridBagConstraints();
    	gbc_removeField7.fill = GridBagConstraints.HORIZONTAL;
    	gbc_removeField7.insets = new Insets(0, 0, 5, 5);
    	gbc_removeField7.gridx = 5;
    	gbc_removeField7.gridy = 1;
    	defectPanel7.add(removeField7, gbc_removeField7);
    	
    	fixTimeField7 = new JTextField();
    	fixTimeField7.setColumns(10);
    	GridBagConstraints gbc_fixTimeField7 = new GridBagConstraints();
    	gbc_fixTimeField7.fill = GridBagConstraints.HORIZONTAL;
    	gbc_fixTimeField7.insets = new Insets(0, 0, 5, 5);
    	gbc_fixTimeField7.gridx = 6;
    	gbc_fixTimeField7.gridy = 1;
    	defectPanel7.add(fixTimeField7, gbc_fixTimeField7);
    	
    	fixRefField7 = new JTextField();
    	fixRefField7.setColumns(10);
    	GridBagConstraints gbc_fixRefField7 = new GridBagConstraints();
    	gbc_fixRefField7.fill = GridBagConstraints.HORIZONTAL;
    	gbc_fixRefField7.insets = new Insets(0, 0, 5, 5);
    	gbc_fixRefField7.gridx = 7;
    	gbc_fixRefField7.gridy = 1;
    	defectPanel7.add(fixRefField7, gbc_fixRefField7);
    	
    	JLabel descriptionLabel7 = new JLabel("Description");
    	GridBagConstraints gbc_descriptionLabel7 = new GridBagConstraints();
    	gbc_descriptionLabel7.anchor = GridBagConstraints.EAST;
    	gbc_descriptionLabel7.insets = new Insets(0, 0, 0, 5);
    	gbc_descriptionLabel7.gridx = 0;
    	gbc_descriptionLabel7.gridy = 2;
    	defectPanel7.add(descriptionLabel7, gbc_descriptionLabel7);
    	
    	descriptionField7 = new JTextField();
    	descriptionField7.setColumns(10);
    	GridBagConstraints gbc_descriptionField7 = new GridBagConstraints();
    	gbc_descriptionField7.fill = GridBagConstraints.HORIZONTAL;
    	gbc_descriptionField7.gridwidth = 7;
    	gbc_descriptionField7.insets = new Insets(0, 0, 0, 5);
    	gbc_descriptionField7.gridx = 1;
    	gbc_descriptionField7.gridy = 2;
    	defectPanel7.add(descriptionField7, gbc_descriptionField7);
    	
    	JPanel defectPanel8 = new JPanel();
    	GridBagLayout gbl_defectPanel8 = new GridBagLayout();
    	gbl_defectPanel8.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    	gbl_defectPanel8.rowHeights = new int[]{0, 0, 0, 0};
    	gbl_defectPanel8.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    	gbl_defectPanel8.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
    	defectPanel8.setLayout(gbl_defectPanel8);
    	
    	JLabel projectLabel8 = new JLabel("Project");
    	GridBagConstraints gbc_projectLabel8 = new GridBagConstraints();
    	gbc_projectLabel8.insets = new Insets(0, 0, 5, 5);
    	gbc_projectLabel8.gridx = 0;
    	gbc_projectLabel8.gridy = 0;
    	defectPanel8.add(projectLabel8, gbc_projectLabel8);
    	
    	JLabel dateLabel8 = new JLabel("Date");
    	GridBagConstraints gbc_dateLabel8 = new GridBagConstraints();
    	gbc_dateLabel8.anchor = GridBagConstraints.NORTH;
    	gbc_dateLabel8.insets = new Insets(0, 0, 5, 5);
    	gbc_dateLabel8.gridx = 1;
    	gbc_dateLabel8.gridy = 0;
    	defectPanel8.add(dateLabel8, gbc_dateLabel8);
    	
    	JLabel numberLabel8 = new JLabel("Number");
    	GridBagConstraints gbc_numberLabel8 = new GridBagConstraints();
    	gbc_numberLabel8.insets = new Insets(0, 0, 5, 5);
    	gbc_numberLabel8.gridx = 2;
    	gbc_numberLabel8.gridy = 0;
    	defectPanel8.add(numberLabel8, gbc_numberLabel8);
    	
    	JLabel typeLabel8 = new JLabel("Type");
    	GridBagConstraints gbc_typeLabel8 = new GridBagConstraints();
    	gbc_typeLabel8.insets = new Insets(0, 0, 5, 5);
    	gbc_typeLabel8.gridx = 3;
    	gbc_typeLabel8.gridy = 0;
    	defectPanel8.add(typeLabel8, gbc_typeLabel8);
    	
    	JLabel injectLabel8 = new JLabel("Inject");
    	GridBagConstraints gbc_injectLabel8 = new GridBagConstraints();
    	gbc_injectLabel8.insets = new Insets(0, 0, 5, 5);
    	gbc_injectLabel8.gridx = 4;
    	gbc_injectLabel8.gridy = 0;
    	defectPanel8.add(injectLabel8, gbc_injectLabel8);
    	
    	JLabel removeLabel8 = new JLabel("Remove");
    	GridBagConstraints gbc_removeLabel8 = new GridBagConstraints();
    	gbc_removeLabel8.insets = new Insets(0, 0, 5, 5);
    	gbc_removeLabel8.gridx = 5;
    	gbc_removeLabel8.gridy = 0;
    	defectPanel8.add(removeLabel8, gbc_removeLabel8);
    	
    	JLabel fixTimeLabel8 = new JLabel("Fix Time");
    	GridBagConstraints gbc_fixTimeLabel8 = new GridBagConstraints();
    	gbc_fixTimeLabel8.insets = new Insets(0, 0, 5, 5);
    	gbc_fixTimeLabel8.gridx = 6;
    	gbc_fixTimeLabel8.gridy = 0;
    	defectPanel8.add(fixTimeLabel8, gbc_fixTimeLabel8);
    	
    	JLabel fixRefLabel8 = new JLabel("Fix Ref");
    	GridBagConstraints gbc_fixRefLabel8 = new GridBagConstraints();
    	gbc_fixRefLabel8.insets = new Insets(0, 0, 5, 5);
    	gbc_fixRefLabel8.gridx = 7;
    	gbc_fixRefLabel8.gridy = 0;
    	defectPanel8.add(fixRefLabel8, gbc_fixRefLabel8);
    	
    	projectField8 = new JTextField();
    	projectField8.setColumns(10);
    	GridBagConstraints gbc_projectField8 = new GridBagConstraints();
    	gbc_projectField8.fill = GridBagConstraints.HORIZONTAL;
    	gbc_projectField8.insets = new Insets(0, 0, 5, 5);
    	gbc_projectField8.gridx = 0;
    	gbc_projectField8.gridy = 1;
    	defectPanel8.add(projectField8, gbc_projectField8);
    	
    	dateField8 = new JTextField();
    	dateField8.setColumns(10);
    	GridBagConstraints gbc_dateField8 = new GridBagConstraints();
    	gbc_dateField8.fill = GridBagConstraints.HORIZONTAL;
    	gbc_dateField8.insets = new Insets(0, 0, 5, 5);
    	gbc_dateField8.gridx = 1;
    	gbc_dateField8.gridy = 1;
    	defectPanel8.add(dateField8, gbc_dateField8);
    	
    	numberField8 = new JTextField();
    	numberField8.setColumns(10);
    	GridBagConstraints gbc_numberField8 = new GridBagConstraints();
    	gbc_numberField8.fill = GridBagConstraints.HORIZONTAL;
    	gbc_numberField8.insets = new Insets(0, 0, 5, 5);
    	gbc_numberField8.gridx = 2;
    	gbc_numberField8.gridy = 1;
    	defectPanel8.add(numberField8, gbc_numberField8);
    	
    	typeField8 = new JTextField();
    	typeField8.setColumns(10);
    	GridBagConstraints gbc_typeField8 = new GridBagConstraints();
    	gbc_typeField8.fill = GridBagConstraints.HORIZONTAL;
    	gbc_typeField8.insets = new Insets(0, 0, 5, 5);
    	gbc_typeField8.gridx = 3;
    	gbc_typeField8.gridy = 1;
    	defectPanel8.add(typeField8, gbc_typeField8);
    	
    	injectField8 = new JTextField();
    	injectField8.setColumns(10);
    	GridBagConstraints gbc_injectField8 = new GridBagConstraints();
    	gbc_injectField8.fill = GridBagConstraints.HORIZONTAL;
    	gbc_injectField8.insets = new Insets(0, 0, 5, 5);
    	gbc_injectField8.gridx = 4;
    	gbc_injectField8.gridy = 1;
    	defectPanel8.add(injectField8, gbc_injectField8);
    	
    	removeField8 = new JTextField();
    	removeField8.setColumns(10);
    	GridBagConstraints gbc_removeField8 = new GridBagConstraints();
    	gbc_removeField8.fill = GridBagConstraints.HORIZONTAL;
    	gbc_removeField8.insets = new Insets(0, 0, 5, 5);
    	gbc_removeField8.gridx = 5;
    	gbc_removeField8.gridy = 1;
    	defectPanel8.add(removeField8, gbc_removeField8);
    	
    	fixTimeField8 = new JTextField();
    	fixTimeField8.setColumns(10);
    	GridBagConstraints gbc_fixTimeField8 = new GridBagConstraints();
    	gbc_fixTimeField8.fill = GridBagConstraints.HORIZONTAL;
    	gbc_fixTimeField8.insets = new Insets(0, 0, 5, 5);
    	gbc_fixTimeField8.gridx = 6;
    	gbc_fixTimeField8.gridy = 1;
    	defectPanel8.add(fixTimeField8, gbc_fixTimeField8);
    	
    	fixRefField8 = new JTextField();
    	fixRefField8.setColumns(10);
    	GridBagConstraints gbc_fixRefField8 = new GridBagConstraints();
    	gbc_fixRefField8.fill = GridBagConstraints.HORIZONTAL;
    	gbc_fixRefField8.insets = new Insets(0, 0, 5, 5);
    	gbc_fixRefField8.gridx = 7;
    	gbc_fixRefField8.gridy = 1;
    	defectPanel8.add(fixRefField8, gbc_fixRefField8);
    	
    	JLabel descriptionLabel8 = new JLabel("Description");
    	GridBagConstraints gbc_descriptionLabel8 = new GridBagConstraints();
    	gbc_descriptionLabel8.anchor = GridBagConstraints.EAST;
    	gbc_descriptionLabel8.insets = new Insets(0, 0, 0, 5);
    	gbc_descriptionLabel8.gridx = 0;
    	gbc_descriptionLabel8.gridy = 2;
    	defectPanel8.add(descriptionLabel8, gbc_descriptionLabel8);
    	
    	descriptionField8 = new JTextField();
    	descriptionField8.setColumns(10);
    	GridBagConstraints gbc_descriptionField8 = new GridBagConstraints();
    	gbc_descriptionField8.fill = GridBagConstraints.HORIZONTAL;
    	gbc_descriptionField8.gridwidth = 7;
    	gbc_descriptionField8.insets = new Insets(0, 0, 0, 5);
    	gbc_descriptionField8.gridx = 1;
    	gbc_descriptionField8.gridy = 2;
    	defectPanel8.add(descriptionField8, gbc_descriptionField8);
    	
    	JPanel defectPanel9 = new JPanel();
    	GridBagLayout gbl_defectPanel9 = new GridBagLayout();
    	gbl_defectPanel9.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    	gbl_defectPanel9.rowHeights = new int[]{0, 0, 0, 0};
    	gbl_defectPanel9.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    	gbl_defectPanel9.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
    	defectPanel9.setLayout(gbl_defectPanel9);
    	
    	JLabel projectLabel9 = new JLabel("Project");
    	GridBagConstraints gbc_projectLabel9 = new GridBagConstraints();
    	gbc_projectLabel9.insets = new Insets(0, 0, 5, 5);
    	gbc_projectLabel9.gridx = 0;
    	gbc_projectLabel9.gridy = 0;
    	defectPanel9.add(projectLabel9, gbc_projectLabel9);
    	
    	JLabel dateLabel9 = new JLabel("Date");
    	GridBagConstraints gbc_dateLabel9 = new GridBagConstraints();
    	gbc_dateLabel9.anchor = GridBagConstraints.NORTH;
    	gbc_dateLabel9.insets = new Insets(0, 0, 5, 5);
    	gbc_dateLabel9.gridx = 1;
    	gbc_dateLabel9.gridy = 0;
    	defectPanel9.add(dateLabel9, gbc_dateLabel9);
    	
    	JLabel numberLabel9 = new JLabel("Number");
    	GridBagConstraints gbc_numberLabel9 = new GridBagConstraints();
    	gbc_numberLabel9.insets = new Insets(0, 0, 5, 5);
    	gbc_numberLabel9.gridx = 2;
    	gbc_numberLabel9.gridy = 0;
    	defectPanel9.add(numberLabel9, gbc_numberLabel9);
    	
    	JLabel typeLabel9 = new JLabel("Type");
    	GridBagConstraints gbc_typeLabel9 = new GridBagConstraints();
    	gbc_typeLabel9.insets = new Insets(0, 0, 5, 5);
    	gbc_typeLabel9.gridx = 3;
    	gbc_typeLabel9.gridy = 0;
    	defectPanel9.add(typeLabel9, gbc_typeLabel9);
    	
    	JLabel injectLabel9 = new JLabel("Inject");
    	GridBagConstraints gbc_injectLabel9 = new GridBagConstraints();
    	gbc_injectLabel9.insets = new Insets(0, 0, 5, 5);
    	gbc_injectLabel9.gridx = 4;
    	gbc_injectLabel9.gridy = 0;
    	defectPanel9.add(injectLabel9, gbc_injectLabel9);
    	
    	JLabel removeLabel9 = new JLabel("Remove");
    	GridBagConstraints gbc_removeLabel9 = new GridBagConstraints();
    	gbc_removeLabel9.insets = new Insets(0, 0, 5, 5);
    	gbc_removeLabel9.gridx = 5;
    	gbc_removeLabel9.gridy = 0;
    	defectPanel9.add(removeLabel9, gbc_removeLabel9);
    	
    	JLabel fixTimeLabel9 = new JLabel("Fix Time");
    	GridBagConstraints gbc_fixTimeLabel9 = new GridBagConstraints();
    	gbc_fixTimeLabel9.insets = new Insets(0, 0, 5, 5);
    	gbc_fixTimeLabel9.gridx = 6;
    	gbc_fixTimeLabel9.gridy = 0;
    	defectPanel9.add(fixTimeLabel9, gbc_fixTimeLabel9);
    	
    	JLabel fixRefLabel9 = new JLabel("Fix Ref");
    	GridBagConstraints gbc_fixRefLabel9 = new GridBagConstraints();
    	gbc_fixRefLabel9.insets = new Insets(0, 0, 5, 5);
    	gbc_fixRefLabel9.gridx = 7;
    	gbc_fixRefLabel9.gridy = 0;
    	defectPanel9.add(fixRefLabel9, gbc_fixRefLabel9);
    	
    	projectField9 = new JTextField();
    	projectField9.setColumns(10);
    	GridBagConstraints gbc_projectField9 = new GridBagConstraints();
    	gbc_projectField9.fill = GridBagConstraints.HORIZONTAL;
    	gbc_projectField9.insets = new Insets(0, 0, 5, 5);
    	gbc_projectField9.gridx = 0;
    	gbc_projectField9.gridy = 1;
    	defectPanel9.add(projectField9, gbc_projectField9);
    	
    	dateField9 = new JTextField();
    	dateField9.setColumns(10);
    	GridBagConstraints gbc_dateField9 = new GridBagConstraints();
    	gbc_dateField9.fill = GridBagConstraints.HORIZONTAL;
    	gbc_dateField9.insets = new Insets(0, 0, 5, 5);
    	gbc_dateField9.gridx = 1;
    	gbc_dateField9.gridy = 1;
    	defectPanel9.add(dateField9, gbc_dateField9);
    	
    	numberField9 = new JTextField();
    	numberField9.setColumns(10);
    	GridBagConstraints gbc_numberField9 = new GridBagConstraints();
    	gbc_numberField9.fill = GridBagConstraints.HORIZONTAL;
    	gbc_numberField9.insets = new Insets(0, 0, 5, 5);
    	gbc_numberField9.gridx = 2;
    	gbc_numberField9.gridy = 1;
    	defectPanel9.add(numberField9, gbc_numberField9);
    	
    	typeField9 = new JTextField();
    	typeField9.setColumns(10);
    	GridBagConstraints gbc_typeField9 = new GridBagConstraints();
    	gbc_typeField9.fill = GridBagConstraints.HORIZONTAL;
    	gbc_typeField9.insets = new Insets(0, 0, 5, 5);
    	gbc_typeField9.gridx = 3;
    	gbc_typeField9.gridy = 1;
    	defectPanel9.add(typeField9, gbc_typeField9);
    	
    	injectField9 = new JTextField();
    	injectField9.setColumns(10);
    	GridBagConstraints gbc_injectField9 = new GridBagConstraints();
    	gbc_injectField9.fill = GridBagConstraints.HORIZONTAL;
    	gbc_injectField9.insets = new Insets(0, 0, 5, 5);
    	gbc_injectField9.gridx = 4;
    	gbc_injectField9.gridy = 1;
    	defectPanel9.add(injectField9, gbc_injectField9);
    	
    	removeField9 = new JTextField();
    	removeField9.setColumns(10);
    	GridBagConstraints gbc_removeField9 = new GridBagConstraints();
    	gbc_removeField9.fill = GridBagConstraints.HORIZONTAL;
    	gbc_removeField9.insets = new Insets(0, 0, 5, 5);
    	gbc_removeField9.gridx = 5;
    	gbc_removeField9.gridy = 1;
    	defectPanel9.add(removeField9, gbc_removeField9);
    	
    	fixTimeField9 = new JTextField();
    	fixTimeField9.setColumns(10);
    	GridBagConstraints gbc_fixTimeField9 = new GridBagConstraints();
    	gbc_fixTimeField9.fill = GridBagConstraints.HORIZONTAL;
    	gbc_fixTimeField9.insets = new Insets(0, 0, 5, 5);
    	gbc_fixTimeField9.gridx = 6;
    	gbc_fixTimeField9.gridy = 1;
    	defectPanel9.add(fixTimeField9, gbc_fixTimeField9);
    	
    	fixRefField9 = new JTextField();
    	fixRefField9.setColumns(10);
    	GridBagConstraints gbc_fixRefField9 = new GridBagConstraints();
    	gbc_fixRefField9.fill = GridBagConstraints.HORIZONTAL;
    	gbc_fixRefField9.insets = new Insets(0, 0, 5, 5);
    	gbc_fixRefField9.gridx = 7;
    	gbc_fixRefField9.gridy = 1;
    	defectPanel9.add(fixRefField9, gbc_fixRefField9);
    	
    	JLabel descriptionLabel9 = new JLabel("Description");
    	GridBagConstraints gbc_descriptionLabel9 = new GridBagConstraints();
    	gbc_descriptionLabel9.anchor = GridBagConstraints.EAST;
    	gbc_descriptionLabel9.insets = new Insets(0, 0, 0, 5);
    	gbc_descriptionLabel9.gridx = 0;
    	gbc_descriptionLabel9.gridy = 2;
    	defectPanel9.add(descriptionLabel9, gbc_descriptionLabel9);
    	
    	descriptionField9 = new JTextField();
    	descriptionField9.setColumns(10);
    	GridBagConstraints gbc_descriptionField9 = new GridBagConstraints();
    	gbc_descriptionField9.fill = GridBagConstraints.HORIZONTAL;
    	gbc_descriptionField9.gridwidth = 7;
    	gbc_descriptionField9.insets = new Insets(0, 0, 0, 5);
    	gbc_descriptionField9.gridx = 1;
    	gbc_descriptionField9.gridy = 2;
    	defectPanel9.add(descriptionField9, gbc_descriptionField9);
    	
    	JTextPane info = new JTextPane();
    	info.setText("Please complete the form from left to right. Press the enter key after entering text in a box. "
    			+ "If you do not want to enter anything in a box please enter \"-\" and press the enter key.");
    	info.setEditable(false);
    	GroupLayout groupLayout = new GroupLayout(this);
    	groupLayout.setHorizontalGroup(
    		groupLayout.createParallelGroup(Alignment.LEADING)
    			.addGroup(groupLayout.createSequentialGroup()
    				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    					.addGroup(groupLayout.createSequentialGroup()
    						.addGap(6)
    						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    							.addGroup(groupLayout.createSequentialGroup()
    								.addComponent(nameTitleLabel)
    								.addPreferredGap(ComponentPlacement.RELATED)
    								.addComponent(nameTitleField, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))
    							.addGroup(groupLayout.createSequentialGroup()
    								.addComponent(projectTitleLabel)
    								.addPreferredGap(ComponentPlacement.RELATED)
    								.addComponent(projectTitleField, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)))
    						.addPreferredGap(ComponentPlacement.RELATED)
    						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    							.addGroup(groupLayout.createSequentialGroup()
    								.addComponent(programNumLabel)
    								.addPreferredGap(ComponentPlacement.RELATED)
    								.addComponent(programNumField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
    							.addGroup(groupLayout.createSequentialGroup()
    								.addComponent(dateTitleLabel)
    								.addPreferredGap(ComponentPlacement.RELATED)
    								.addComponent(dateTitleField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
    						.addGap(103)
    						.addComponent(info, GroupLayout.PREFERRED_SIZE, 585, GroupLayout.PREFERRED_SIZE))
    					.addComponent(defectPanel1, GroupLayout.PREFERRED_SIZE, 1610, GroupLayout.PREFERRED_SIZE)
    					.addComponent(defectPanel2, GroupLayout.PREFERRED_SIZE, 1610, GroupLayout.PREFERRED_SIZE)
    					.addComponent(defectPanel3, GroupLayout.PREFERRED_SIZE, 1610, GroupLayout.PREFERRED_SIZE)
    					.addComponent(defectPanel4, GroupLayout.PREFERRED_SIZE, 1610, GroupLayout.PREFERRED_SIZE)
    					.addComponent(defectPanel5, GroupLayout.PREFERRED_SIZE, 1610, GroupLayout.PREFERRED_SIZE)
    					.addComponent(defectPanel6, GroupLayout.PREFERRED_SIZE, 1610, GroupLayout.PREFERRED_SIZE)
    					.addComponent(defectPanel7, GroupLayout.PREFERRED_SIZE, 1610, GroupLayout.PREFERRED_SIZE)
    					.addComponent(defectPanel8, GroupLayout.PREFERRED_SIZE, 1610, GroupLayout.PREFERRED_SIZE)
    					.addComponent(defectPanel9, GroupLayout.PREFERRED_SIZE, 1610, GroupLayout.PREFERRED_SIZE))
    				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    	);
    	groupLayout.setVerticalGroup(
    		groupLayout.createParallelGroup(Alignment.LEADING)
    			.addGroup(groupLayout.createSequentialGroup()
    				.addContainerGap()
    				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    					.addGroup(groupLayout.createSequentialGroup()
    						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
    							.addComponent(nameTitleField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    							.addComponent(dateTitleLabel)
    							.addComponent(dateTitleField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    							.addComponent(nameTitleLabel))
    						.addPreferredGap(ComponentPlacement.RELATED)
    						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
    							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
    								.addComponent(projectTitleField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
    								.addComponent(projectTitleLabel))
    							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
    								.addComponent(programNumLabel)
    								.addComponent(programNumField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
    					.addComponent(info, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
    				.addGap(18)
    				.addComponent(defectPanel1, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
    				.addPreferredGap(ComponentPlacement.RELATED)
    				.addComponent(defectPanel2, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
    				.addPreferredGap(ComponentPlacement.RELATED)
    				.addComponent(defectPanel3, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
    				.addPreferredGap(ComponentPlacement.RELATED)
    				.addComponent(defectPanel4, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
    				.addPreferredGap(ComponentPlacement.RELATED)
    				.addComponent(defectPanel5, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
    				.addPreferredGap(ComponentPlacement.RELATED)
    				.addComponent(defectPanel6, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
    				.addPreferredGap(ComponentPlacement.RELATED)
    				.addComponent(defectPanel7, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
    				.addPreferredGap(ComponentPlacement.RELATED)
    				.addComponent(defectPanel8, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
    				.addPreferredGap(ComponentPlacement.RELATED)
    				.addComponent(defectPanel9, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
    				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    	);
    	
    	fileName = "ProjectFiles/" + projectTitleField.getText() + ".txt";
    	
    	nameTitleField.addActionListener(new ActionListener(){ 
    		@Override
    		public void actionPerformed(ActionEvent e){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write(nameTitleField.getText());
    					dateTitleField.requestFocus();
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	}); 
    	
    	dateTitleField.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + dateTitleField.getText());
    					programNumField.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	programNumField.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + programNumField.getText());
    					projectField1.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	projectField1.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + projectField1.getText());
    					dateField1.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	dateField1.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + dateField1.getText());
    					numberField1.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	numberField1.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + numberField1.getText());
    					typeField1.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	typeField1.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + typeField1.getText());
    					injectField1.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	injectField1.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + injectField1.getText());
    					removeField1.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	removeField1.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + removeField1.getText());
    					fixTimeField1.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	fixTimeField1.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + fixTimeField1.getText());
    					fixRefField1.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	fixRefField1.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + fixRefField1.getText());
    					descriptionField1.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	descriptionField1.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + descriptionField1.getText());
    					projectField2.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	projectField2.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + projectField2.getText());
    					dateField2.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	dateField2.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + dateField2.getText());
    					numberField2.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	numberField2.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + numberField2.getText());
    					typeField2.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	typeField2.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + typeField2.getText());
    					injectField2.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	injectField2.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + injectField2.getText());
    					removeField2.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	removeField2.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + removeField2.getText());
    					fixTimeField2.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	fixTimeField2.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + fixTimeField2.getText());
    					fixRefField2.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	fixRefField2.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + fixRefField2.getText());
    					descriptionField2.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	descriptionField2.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + descriptionField2.getText());
    					projectField3.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	projectField3.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + projectField3.getText());
    					dateField3.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	dateField3.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + dateField3.getText());
    					numberField3.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	numberField3.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + numberField3.getText());
    					typeField3.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	typeField3.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + typeField3.getText());
    					injectField3.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	injectField3.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + injectField3.getText());
    					removeField3.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	removeField3.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + removeField3.getText());
    					fixTimeField3.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	fixTimeField3.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + fixTimeField3.getText());
    					fixRefField3.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	fixRefField3.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + fixRefField3.getText());
    					descriptionField3.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	descriptionField3.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + descriptionField3.getText());
    					projectField4.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	projectField4.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + projectField4.getText());
    					dateField4.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	dateField4.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + dateField4.getText());
    					numberField4.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	numberField4.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + numberField4.getText());
    					typeField4.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	typeField4.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + typeField4.getText());
    					injectField4.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	injectField4.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + injectField4.getText());
    					removeField4.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	removeField4.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + removeField4.getText());
    					fixTimeField4.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	fixTimeField4.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + fixTimeField4.getText());
    					fixRefField4.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	fixRefField4.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + fixRefField4.getText());
    					descriptionField4.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	descriptionField4.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + descriptionField4.getText());
    					projectField5.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	projectField5.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + projectField5.getText());
    					dateField5.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	dateField5.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + dateField5.getText());
    					numberField5.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	numberField5.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + numberField5.getText());
    					typeField5.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	typeField5.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + typeField5.getText());
    					injectField5.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	injectField5.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + injectField5.getText());
    					removeField5.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	removeField5.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + removeField5.getText());
    					fixTimeField5.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	fixTimeField5.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + fixTimeField5.getText());
    					fixRefField5.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	fixRefField5.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + fixRefField5.getText());
    					descriptionField5.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	descriptionField5.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + descriptionField5.getText());
    					projectField6.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	projectField6.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + projectField6.getText());
    					dateField6.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	dateField6.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + dateField6.getText());
    					numberField6.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	numberField6.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + numberField6.getText());
    					typeField6.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	typeField6.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + typeField6.getText());
    					injectField6.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	injectField6.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + injectField6.getText());
    					removeField6.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	removeField6.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + removeField6.getText());
    					fixTimeField6.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	fixTimeField6.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + fixTimeField6.getText());
    					fixRefField6.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	fixRefField6.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + fixRefField6.getText());
    					descriptionField6.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	descriptionField6.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + descriptionField6.getText());
    					projectField7.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	projectField7.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + projectField7.getText());
    					dateField7.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	dateField7.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + dateField7.getText());
    					numberField7.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	numberField7.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + numberField7.getText());
    					typeField7.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	typeField7.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + typeField7.getText());
    					injectField7.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	injectField7.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + injectField7.getText());
    					removeField7.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	removeField7.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + removeField7.getText());
    					fixTimeField7.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	fixTimeField7.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + fixTimeField7.getText());
    					fixRefField7.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	fixRefField7.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + fixRefField7.getText());
    					descriptionField7.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	descriptionField7.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + descriptionField7.getText());
    					projectField8.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	projectField8.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + projectField8.getText());
    					dateField8.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	dateField8.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + dateField8.getText());
    					numberField8.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	numberField8.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + numberField8.getText());
    					typeField8.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	typeField8.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + typeField8.getText());
    					injectField8.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	injectField8.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + injectField8.getText());
    					removeField8.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	removeField8.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + removeField8.getText());
    					fixTimeField8.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	fixTimeField8.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + fixTimeField8.getText());
    					fixRefField8.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	fixRefField8.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + fixRefField8.getText());
    					descriptionField8.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	descriptionField8.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + descriptionField8.getText());
    					projectField9.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	projectField9.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + projectField9.getText());
    					dateField9.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	dateField9.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + dateField9.getText());
    					numberField9.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	numberField9.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + numberField9.getText());
    					typeField9.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	typeField9.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + typeField9.getText());
    					injectField9.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	injectField9.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + injectField9.getText());
    					removeField9.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	removeField9.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + removeField9.getText());
    					fixTimeField9.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	fixTimeField9.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + fixTimeField9.getText());
    					fixRefField9.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	fixRefField9.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + fixRefField9.getText());
    					descriptionField9.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	descriptionField9.addActionListener(new ActionListener(){
    		@Override
    		public void actionPerformed(ActionEvent a){
    		
    			try(FileWriter fw = new FileWriter(fileName, true);
    				    BufferedWriter bw = new BufferedWriter(fw);
    				    PrintWriter out = new PrintWriter(bw))
    				{
    					bw.write("\n" + descriptionField9.getText());
    					projectField2.requestFocus();
    				
    				} catch (IOException ex) {
    				    System.out.println(ex);
    				}
    		}   
    	});
    	
    	try{
    		fReader = new FileReader(fileName);
    		BufferedReader bReader = new BufferedReader(fReader);
    		StringBuffer string = new StringBuffer();
    		
    		File file = new File(fileName);
    		Scanner scanner = new Scanner(file);
    		
    		while((line = bReader.readLine()) != null){
    			counter++;
    			if(counter == 1){
    				nameTitleField.setText(scanner.nextLine());
    			}
    			else if(counter == 2){
    				
    				dateTitleField.setText(scanner.nextLine());
    			}
    			else if(counter == 3){
    				
    				programNumField.setText(scanner.nextLine());
    			}
    			else if(counter == 4){
    				
    				projectField1.setText(scanner.nextLine());
    			}
    			else if(counter == 5){
    				
    				dateField1.setText(scanner.nextLine());
    			}
    			else if(counter == 6){
    				
    				numberField1.setText(scanner.nextLine());
    			}
    			else if(counter == 7){
    				
    				typeField1.setText(scanner.nextLine());
    			}
    			else if(counter == 8){
    				
    				injectField1.setText(scanner.nextLine());
    			}
    			else if(counter == 9){
    				
    				removeField1.setText(scanner.nextLine());
    			}
    			else if(counter == 10){
    				
    				fixTimeField1.setText(scanner.nextLine());
    			}
    			else if(counter == 11){
    				
    				fixRefField1.setText(scanner.nextLine());
    			}
    			else if(counter == 12){
    				
    				descriptionField1.setText(scanner.nextLine());
    			}
    			else if(counter == 13){
    				
    				projectField2.setText(scanner.nextLine());
    			}
    			else if(counter == 14){
    				
    				dateField2.setText(scanner.nextLine());
    			}
    			else if(counter == 15){
    				
    				numberField2.setText(scanner.nextLine());
    			}
    			else if(counter == 16){
    				
    				typeField2.setText(scanner.nextLine());
    			}
    			else if(counter == 17){
    				
    				injectField2.setText(scanner.nextLine());
    			}
    			else if(counter == 18){
    				
    				removeField2.setText(scanner.nextLine());
    			}
    			else if(counter == 19){
    				
    				fixTimeField2.setText(scanner.nextLine());
    			}
    			else if(counter == 20){
    				
    				fixRefField2.setText(scanner.nextLine());
    			}
    			else if(counter == 21){
    				
    				descriptionField2.setText(scanner.nextLine());
    			}
    			else if(counter == 222){
    				
    				projectField3.setText(scanner.nextLine());
    			}
    			else if(counter == 23){
    				
    				dateField3.setText(scanner.nextLine());
    			}
    			else if(counter == 24){
    				
    				numberField3.setText(scanner.nextLine());
    			}
    			else if(counter == 25){
    				
    				typeField3.setText(scanner.nextLine());
    			}
    			else if(counter == 26){
    				
    				injectField3.setText(scanner.nextLine());
    			}
    			else if(counter == 27){
    				
    				removeField3.setText(scanner.nextLine());
    			}
    			else if(counter == 28){
    				
    				fixTimeField3.setText(scanner.nextLine());
    			}
    			else if(counter == 29){
    				
    				fixRefField3.setText(scanner.nextLine());
    			}
    			else if(counter == 30){
    				
    				descriptionField3.setText(scanner.nextLine());
    			}
    			else if(counter == 31){
    				
    				projectField4.setText(scanner.nextLine());
    			}
    			else if(counter == 32){
    				
    				dateField4.setText(scanner.nextLine());
    			}
    			else if(counter == 33){
    				
    				numberField4.setText(scanner.nextLine());
    			}
    			else if(counter == 34){
    				
    				typeField4.setText(scanner.nextLine());
    			}
    			else if(counter == 35){
    				
    				injectField4.setText(scanner.nextLine());
    			}
    			else if(counter == 36){
    				
    				removeField4.setText(scanner.nextLine());
    			}
    			else if(counter == 37){
    				
    				fixTimeField4.setText(scanner.nextLine());
    			}
    			else if(counter == 38){
    				
    				fixRefField4.setText(scanner.nextLine());
    			}
    			else if(counter == 39){
    				
    				descriptionField4.setText(scanner.nextLine());
    			}
    			else if(counter == 40){
    				
    				projectField5.setText(scanner.nextLine());
    			}
    			else if(counter == 41){
    				
    				dateField5.setText(scanner.nextLine());
    			}
    			else if(counter == 42){
    				
    				numberField5.setText(scanner.nextLine());
    			}
    			else if(counter == 43){
    				
    				typeField5.setText(scanner.nextLine());
    			}
    			else if(counter == 44){
    				
    				injectField5.setText(scanner.nextLine());
    			}
    			else if(counter == 45){
    				
    				removeField5.setText(scanner.nextLine());
    			}
    			else if(counter == 46){
    				
    				fixTimeField5.setText(scanner.nextLine());
    			}
    			else if(counter == 47){
    				
    				fixRefField5.setText(scanner.nextLine());
    			}
    			else if(counter == 48){
    				descriptionField5.setText(scanner.nextLine());
    			}
    			else if(counter == 49){
    				projectField6.setText(scanner.nextLine());
    			}
    			else if(counter == 50){
    				dateField6.setText(scanner.nextLine());
    			}
    			else if(counter == 51){
    				numberField6.setText(scanner.nextLine());
    			}
    			else if(counter == 52){
    				typeField6.setText(scanner.nextLine());
    			}
    			else if(counter == 53){
    				injectField6.setText(scanner.nextLine());
    			}
    			else if(counter == 54){
    				;
    				removeField6.setText(scanner.nextLine());
    			}
    			else if(counter == 55){
    				
    				fixTimeField6.setText(scanner.nextLine());
    			}
    			else if(counter == 56){
    				
    				fixRefField6.setText(scanner.nextLine());
    			}
    			else if(counter == 57){
    				
    				descriptionField6.setText(scanner.nextLine());
    			}
    			else if(counter == 58){
    				
    				projectField7.setText(scanner.nextLine());
    			}
    			else if(counter == 59){
    				
    				dateField7.setText(scanner.nextLine());
    			}
    			else if(counter == 60){
    				
    				numberField7.setText(scanner.nextLine());
    			}
    			else if(counter == 61){
    				
    				typeField7.setText(scanner.nextLine());
    			}
    			else if(counter == 62){
    				
    				injectField7.setText(scanner.nextLine());
    			}
    			else if(counter == 63){
    				
    				removeField7.setText(scanner.nextLine());
    			}
    			else if(counter == 64){
    				
    				fixTimeField7.setText(scanner.nextLine());
    			}
    			else if(counter == 65){
    				
    				fixRefField7.setText(scanner.nextLine());
    			}
    			else if(counter == 66){
    				descriptionField7.setText(scanner.nextLine());
    			}
    			else if(counter == 67){
    				
    				projectField8.setText(scanner.nextLine());
    			}
    			else if(counter == 68){
    				
    				dateField8.setText(scanner.nextLine());
    			}
    			else if(counter == 69){
    				
    				numberField8.setText(scanner.nextLine());
    			}
    			else if(counter == 70){
    				
    				typeField8.setText(scanner.nextLine());
    			}
    			else if(counter == 71){
    				
    				injectField8.setText(scanner.nextLine());
    			}
    			else if(counter == 72){
    				
    				removeField8.setText(scanner.nextLine());
    			}
    			else if(counter == 73){
    				
    				fixTimeField8.setText(scanner.nextLine());
    			}
    			else if(counter == 74){
    				
    				fixRefField8.setText(scanner.nextLine());
    			}
    			else if(counter == 75){
    				descriptionField8.setText(scanner.nextLine());
    			}
    			else if(counter == 76){
    				
    				projectField9.setText(scanner.nextLine());
    			}
    			else if(counter == 77){
    				
    				dateField9.setText(scanner.nextLine());
    			}
    			else if(counter == 78){
    				
    				numberField9.setText(scanner.nextLine());
    			}
    			else if(counter == 79){
    				
    				typeField9.setText(scanner.nextLine());
    			}
    			else if(counter == 80){
    				
    				injectField9.setText(scanner.nextLine());
    			}
    			else if(counter == 81){
    				
    				removeField9.setText(scanner.nextLine());
    			}
    			else if(counter == 82){
    				
    				fixTimeField9.setText(scanner.nextLine());
    			}
    			else if(counter == 83){
    				
    				fixRefField9.setText(scanner.nextLine());
    			}
    			else if(counter == 84){
    				descriptionField9.setText(scanner.nextLine());
    			}
    			
    			}
    		}catch(Exception e){
    		e.printStackTrace();
    		}finally{
   
    		if(fReader != null)
    			fReader.close();
    		}
    	setLayout(groupLayout);
    
        
    }
}