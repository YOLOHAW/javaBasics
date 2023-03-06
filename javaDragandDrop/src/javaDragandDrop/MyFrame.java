package javaDragandDrop;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	DragPanel dragPanel=new DragPanel();
	JFrame frame=new JFrame();
	MyFrame(){
		this.add(dragPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setSize(500,500);
		this.setVisible(true);
	}
}
