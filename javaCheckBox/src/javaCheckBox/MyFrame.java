package javaCheckBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JCheckBox checkbox;
	ImageIcon xIcon;
	ImageIcon selectedIcon;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		this.setLayout(new FlowLayout());
		
		xIcon=new ImageIcon("false.png");
		selectedIcon=new ImageIcon("true.png");
		button=new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		
		checkbox=new JCheckBox();
		checkbox.setText("I am not a robot");
		checkbox.setFocusable(false);
		checkbox.setIcon(xIcon);
		checkbox.setSelectedIcon(selectedIcon);
		
		this.add(button);
		this.add(checkbox);
		this.pack();
		this.setVisible(true);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println(checkbox.isSelected());
		}
	}

}