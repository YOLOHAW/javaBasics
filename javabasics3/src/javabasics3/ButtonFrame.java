package javabasics3;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonFrame extends JFrame implements ActionListener {
	
	JButton button;
	JLabel label;
	ButtonFrame(){
		
		ImageIcon icon=new ImageIcon("lookingcat.png");
		ImageIcon image=new ImageIcon("cr7realMadrid.jpeg");
		
		label=new JLabel();
		label.setIcon(image);
		label.setBounds(10,10,500,500);
		label.setVisible(false);
		
		button=new JButton();
		button.setBounds(150,200,200,200);
		//button.addActionListener(e-> System.out.println("Siuuuuu"));
		button.addActionListener(this);
		button.setText("Click Me");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,25));
		button.setIconTextGap(-15);
		button.setForeground(Color.cyan);
		button.setBackground(Color.yellow);
		button.setBorder(BorderFactory.createEtchedBorder());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println("Siuuuuuuu");
			label.setVisible(true);
			//button.setenabled(false);
		}
	}
}
