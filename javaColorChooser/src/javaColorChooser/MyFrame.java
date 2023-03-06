package javaColorChooser;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {
	JButton button;
	JLabel label;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button=new JButton("Choose a color: ");
		button.setBounds(0,0,50,50);
		
		label=new JLabel("This is a Text :3");
		label.setFont(new Font("MV Boli",Font.PLAIN,30));
		label.setOpaque(true);
		
		button.addActionListener(this);
		this.add(button);
		this.add(label);
		
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			JColorChooser colorchooser=new JColorChooser();
			
			Color color=JColorChooser.showDialog(null,"Now Choose A Color", Color.white);
			label.setForeground(color);
		}
	}
}
