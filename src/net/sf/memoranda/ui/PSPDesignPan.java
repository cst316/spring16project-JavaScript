package paintel;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//based off of NomNom's Java Mini-Paint Program
public class PSPDesignPan {
 
  JButton clearButt, blackButt, blueButt, greenButt, redButt,eraseButt;
  WhiteBoard drawArea;
  ActionListener actionListener = new ActionListener() {
 
  public void actionPerformed(ActionEvent e) {
      if (e.getSource() == clearButt) {
        drawArea.clear();
      } else if (e.getSource() == blackButt) {
        drawArea.black();
      } else if (e.getSource() == blueButt) {
        drawArea.blue();
      } else if (e.getSource() == greenButt) {
        drawArea.green();
      } else if (e.getSource() == redButt) {
        drawArea.red();
      } else if (e.getSource() == eraseButt) {
        drawArea.white();
        } 
    }
  	};
 
  public static void main(String[] args) {
    new PSPDesignPan().show();
  }
 
  
  public void show() {
    // create main frame
    JFrame frame = new JFrame("PSP Design");
    Container content = frame.getContentPane();
    
    
    // set layout on content pane
    content.setLayout(new BorderLayout());
    
    
    // create draw area
    drawArea = new WhiteBoard();
    content.add(drawArea, BorderLayout.CENTER);
 
    // Set the colors
    JPanel controls = new JPanel();
 
    clearButt = new JButton("Clear");
    clearButt.addActionListener(actionListener);
    blackButt = new JButton("Black");
    blackButt.addActionListener(actionListener);
    blueButt = new JButton("Blue");
    blueButt.addActionListener(actionListener);
    greenButt = new JButton("Green");
    greenButt.addActionListener(actionListener);
    redButt = new JButton("Red");
    redButt.addActionListener(actionListener);
    eraseButt = new JButton("Eraser");
    eraseButt.addActionListener(actionListener);
   
 
    // add buttons
    controls.add(blackButt);
    controls.add(redButt);
    controls.add(blueButt);
    controls.add(greenButt);
    controls.add(eraseButt);
    controls.add(clearButt);
 
    
    //Set Frame Stuff
    content.add(controls, BorderLayout.NORTH);
    frame.setSize(1280, 860);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
 
  }
 
}