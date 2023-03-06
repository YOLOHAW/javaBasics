package javaRadioButtons;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener {
	
	JRadioButton pizzaButton;
	JRadioButton humburgerButton;
	JRadioButton hotdogButton;
	ImageIcon pizzaPhoto;
	ImageIcon humburgerPhoto;
	ImageIcon hotdogPhoto;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaPhoto=new ImageIcon("pizza.jpg");
		humburgerPhoto=new ImageIcon("humburger.jpg");
		hotdogPhoto=new ImageIcon("hotdog.jpg");
		
		pizzaButton=new JRadioButton("Pizza");
		humburgerButton=new JRadioButton("Humburger");
		hotdogButton=new JRadioButton("HotDog");
		pizzaButton.setIcon(pizzaPhoto);
		humburgerButton.setIcon(humburgerPhoto);
		hotdogButton.setIcon(hotdogPhoto);
		
		pizzaButton.addActionListener(this);
		humburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		ButtonGroup group=new ButtonGroup();
		group.add(pizzaButton);
		group.add(humburgerButton);
		group.add(hotdogButton);
		
		this.add(pizzaButton);
		this.add(humburgerButton);
		this.add(hotdogButton);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==pizzaButton) {
			System.out.println("You have ordered the Pizza");
		}else if(e.getSource()==humburgerButton) {
			System.out.println("You have ordered the Humburger");
		}else if(e.getSource()==hotdogButton) {
			System.out.println("You have ordered the Hotdog");
		}
	}
}
