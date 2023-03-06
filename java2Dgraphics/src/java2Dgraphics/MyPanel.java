package java2Dgraphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	Image image;
	MyPanel(){
		image=new ImageIcon("calFlip.jpg").getImage();
		this.setPreferredSize(new Dimension(500,500));
		
	}
	public void paint(Graphics g) {
		Graphics2D g2d=(Graphics2D) g;
		
		g2d.drawImage(image, 0, 0, null);
		//g2d.setPaint(Color.blue);
		//g2d.setStroke(new BasicStroke(5));
		//g2d.drawLine(0, 0, 500, 500);
		
		//g2d.drawRect(0,0,100,200);
		//g2d.fillRect(0, 0, 100, 200);
		
		//g2d.drawOval(0, 0, 100, 100);
		//g2d.fillOval(0, 0, 100, 100);
		
		//PokeMon
		//g2d.setPaint(Color.red);
		//g2d.drawArc(0, 0, 100, 100, 180, 180);
		//g2d.fillArc(0, 0, 100, 100, 0, 180);
		//g2d.setPaint(Color.white);
		//g2d.fillArc(0,0,100,100,180,180);
		
		//Triangle
//		int[] xPoints= {
//				150,250,350
//		};
//		int[] yPoints= {
//				300,150,300
//		};
//		g2d.setPaint(Color.yellow);
//		g2d.fillPolygon(xPoints,yPoints,3);
		
//		g2d.setPaint(Color.blue);
//		g2d.setFont(new Font("Ink Free",Font.BOLD,50));
//		g2d.drawString("You are A WInner", 50, 50);

		
		
	
	}
}
