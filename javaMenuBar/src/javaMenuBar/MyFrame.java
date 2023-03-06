package javaMenuBar;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener {
	JMenuBar menubar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		menubar=new JMenuBar();
		
		
		fileMenu=new JMenu("File");
		editMenu=new JMenu("Edit");
		helpMenu=new JMenu("Help");
		
		loadItem=new JMenuItem("Load");
		saveItem=new JMenuItem("Save");
		exitItem=new JMenuItem("Exit");
		
		fileMenu.setMnemonic(KeyEvent.VK_F);
		editMenu.setMnemonic(KeyEvent.VK_E);
		helpMenu.setMnemonic(KeyEvent.VK_H);
		loadItem.setMnemonic(KeyEvent.VK_L);
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_Z);
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		menubar.add(fileMenu);
		menubar.add(editMenu);
		menubar.add(helpMenu);
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		this.setJMenuBar(menubar);
		this.setSize(500,500);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==loadItem) {
			System.out.println("You loaded the file**");
		}else if(e.getSource()==saveItem) {
			System.out.println("You saved the file");
		}else if(e.getSource()==exitItem) {
			System.exit(0);
		}
	}
}
