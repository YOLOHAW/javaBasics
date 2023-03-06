package javaMouseListener;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener {
	JLabel label;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		label=new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		this.add(label);
		this.setSize(500,500);
		this.setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("you clicked the mouse");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You pressed the mouse");
		label.setBackground(Color.white);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You released the mouse");
		label.setBackground(Color.yellow);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You entered the mouse");
		label.setBackground(Color.cyan);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You exit");
		label.setBackground(Color.green);
	}

}
