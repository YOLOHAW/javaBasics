package javaKeyListener;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener {
	
	JLabel label;
	ImageIcon jumpingCat;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		
		jumpingCat=new ImageIcon("jumpingCat.jpg");
		
		label=new JLabel();
		label.setBounds(0,0,100,100);
		//label.setBackground(Color.white);
		label.setIcon(jumpingCat);
		label.setOpaque(true);
		
		this.add(label);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.black);
		this.addKeyListener(this);
		this.setVisible(true);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()) {
		case 'a': label.setLocation(label.getX()-10,label.getY());
		break;
		case 'd': label.setLocation(label.getX()+10,label.getY());
		break;
		case 's': label.setLocation(label.getX(),label.getY()+10);
		break;
		case 'w': label.setLocation(label.getX(),label.getY()-10);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()) {
		case 37 : label.setLocation(label.getX()-10,label.getY());
		break;
		case 39 : label.setLocation(label.getX()+10,label.getY());
		break;
		case 40 : label.setLocation(label.getX(),label.getY()+10);
		break;
		case 38 : label.setLocation(label.getX(),label.getY()-10);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(e.getKeyChar());
		//sysout(e.getKeyCode());
	}
}
