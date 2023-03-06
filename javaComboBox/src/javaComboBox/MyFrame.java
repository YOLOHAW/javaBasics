package javaComboBox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	JComboBox combo;
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals= {
				"cat","dog","horse"
		};
		combo=new JComboBox(animals);
		//sysout(combo.getItemCount);
		combo.addItem("Shark");
		//combo.insertItemAt("fish",7);
		//combo.removeAllItems();
		combo.addActionListener(this);
		
		this.add(combo);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==combo) {
			System.out.println(combo.getSelectedItem());
		}
	}
}
