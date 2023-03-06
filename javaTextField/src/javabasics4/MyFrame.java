package javabasics4;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	
	JFrame frame;
	JTextField textfield;
	JButton button;
	
	MyFrame(){
		button=new JButton();
		button.setText("Submit");
		button.setBounds(0,0,50,50);
		button.addActionListener(this);
		
		textfield=new JTextField();
		textfield.setPreferredSize(new Dimension(200,200));
		
		frame=new JFrame();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.add(button);
		this.add(textfield);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println("Hello "+textfield.getText());
			button.setEnabled(false);
			textfield.setEditable(false);
		}
	}
}
