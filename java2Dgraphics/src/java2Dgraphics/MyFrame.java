package java2Dgraphics;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	MyPanel panel;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		panel=new MyPanel();
		
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}
