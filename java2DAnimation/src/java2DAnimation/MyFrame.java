package java2DAnimation;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	MyPanel panel;
	MyFrame(){
		
		panel=new MyPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(panel);
		this.pack();
		
		this.setVisible(true);
	}
}
