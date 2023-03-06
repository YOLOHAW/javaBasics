package java2DAnimation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements ActionListener  {
	
	final int PANEL_WIDTH=500;
	final int PANEL_HEIGHT=500;
	Image enemy;
	Image backgroundImage;
	Timer timer;
	int xVelocity=1;
	int yVelocity=1;
	int x=0;
	int y=0;
	
	
	MyPanel(){
		this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
		this.setBackground(Color.black);
		enemy=new ImageIcon("alien.jpg").getImage();
		timer=new Timer(1000,this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		Graphics2D g2d=(Graphics2D) g;
		g2d.drawImage(enemy, x, y,null);
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
