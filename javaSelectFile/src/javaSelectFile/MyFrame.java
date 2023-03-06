package javaSelectFile;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	JButton button;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button=new JButton("Select a File");
		button.setBounds(0,0,50,50);
		
		button.addActionListener(this);
		this.add(button);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			JFileChooser filechooser=new JFileChooser();
			filechooser.setCurrentDirectory(new File("."));
			//int response=filechooser.showOpenDialog(null);
			int response=filechooser.showSaveDialog(null);
			
			if(response==JFileChooser.APPROVE_OPTION) {
				File file=new File(filechooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
	}

	
	
}
