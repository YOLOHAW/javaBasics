package javaProgressBar;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class MyFrame {
	JFrame frame=new JFrame();
	JProgressBar progressbar=new JProgressBar();
	MyFrame(){
		progressbar.setValue(0);
		progressbar.setBounds(0,0,420,70);
		progressbar.setStringPainted(true);
		progressbar.setFont(new Font("MV Boli",Font.BOLD,25));
		progressbar.setForeground(Color.blue);
		progressbar.setBackground(Color.yellow);
		
		frame.add(progressbar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		fill();
	}
	public void fill() {
		int counter=0;
		
		
		while(counter<=100) {
			progressbar.setValue(counter);
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter +=1;
		}
		progressbar.setString("Done");
	}
}
