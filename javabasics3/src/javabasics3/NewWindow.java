package javabasics3;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {
	
	JFrame frame;
	JLabel label;
	
	NewWindow(){
		label=new JLabel();
		label.setText("Welcome from new Window");
		label.setBounds(100,100,200,200);
		
		frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(420,420);
		frame.add(label);
		frame.setVisible(true);
		
	}
}
