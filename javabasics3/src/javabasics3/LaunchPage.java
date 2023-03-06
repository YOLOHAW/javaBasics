package javabasics3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage extends JFrame implements ActionListener {
	
	JFrame frame=new JFrame();
	JButton button=new JButton("Click to get a new Window");
	//constructor
	LaunchPage(){
		
		button.setBounds(100,100,200,200);
		button.setFocusable(false);
		button.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(420,420);
		frame.add(button);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			frame.dispose();
			NewWindow newwindow=new NewWindow();
			
		}
	}
}
