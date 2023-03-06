package javabasics3;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	MyFrame(){
		
		this.setTitle("First Jthis is Here");//set the title of this
		this.setSize(500,500);//set the x and y dimensions of this
		this.setVisible(true);//make the this visible
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);//exit out of the app
		this.setResizable(false);//prevents from this resizing
		
		ImageIcon image=new ImageIcon("lookingcat.png");
		this.setIconImage(image.getImage());//set the logo of this
		this.getContentPane().setBackground(new Color(150,0,200));//set the background color of this
		
		
	}
	
}
