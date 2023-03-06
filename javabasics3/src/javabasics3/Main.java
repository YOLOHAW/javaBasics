package javabasics3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Main {

	private static final Object buttonseven = null;

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
//		//Audio
//		
//		Scanner scanner=new Scanner(System.in);
//		
//		File file=new File("Champion.wav");
//		AudioInputStream audioStream=AudioSystem.getAudioInputStream(file);
//		Clip clip=AudioSystem.getClip();
//		clip.open(audioStream);
//		
//		String response="";
//		
//		while(!response.equals("Q")) {
//			System.out.println("P =Play,S =Stop,R =Reset,Q =Quit");
//			System.out.println("Enter your choice: ");
//			
//			response=scanner.next();
//			response=response.toUpperCase();
//			
//			switch(response) {
//			case("P"): clip.start();
//			break;
//			case("S"): clip.stop();
//			break;
//			case("R"): clip.setMicrosecondPosition(0);
//			break;
//			case("Q"): clip.close();
//			default: System.out.println("Not a valid response");
//			}
//			
//		}
//		System.out.println("Bye See you next Time");
//		
//		//J Frame a GUI window to add components to
//		//New MyFrame class
//		MyFrame myframe=new MyFrame();
//		
//		//JLabel a GUI display area for styling text and image
//		ImageIcon image1=new ImageIcon("lookingcat.png");
//		Border border=BorderFactory.createLineBorder(Color.green,3);
//		
//		JLabel label=new JLabel();
//		label.setText("Java is my first language");//set text of label
//		label.setIcon(image1);
//		label.setHorizontalTextPosition(JLabel.CENTER);//set  text left,center,right of imageicon
//		label.setVerticalTextPosition(JLabel.TOP);//set text top,center,bottom of imageicon
//		label.setForeground(Color.blue);//set color of text
//		label.setFont(new Font("MV Boli",Font.PLAIN,20));//set font of text
//		label.setIconTextGap(-25);//set gap of text to image
//		label.setBackground(Color.yellow);//set background color
//		label.setOpaque(true);//display background color
//		label.setBorder(border);
//		label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
//		label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text within label
//		//label.setBounds(100,100,250,250); //set x,y position within frame as well as dimensions
//		
//		JFrame frame1=new JFrame();
//		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		//frame1.setLayout(null);
//		//frame1.setSize(500,500);
//		frame1.setVisible(true);
//		frame1.add(label);
//		frame1.pack();
		
//		//JPanel a gui component that as container to hold other components
//		ImageIcon icon2=new ImageIcon("lookingcat.png");
//		
//		JLabel label1=new JLabel();
//		label1.setText("Hi");
//		label1.setIcon(icon2);
//		label1.setVerticalAlignment(JLabel.BOTTOM);
//		label1.setHorizontalAlignment(JLabel.RIGHT);
//		//label1.setBounds(0,0,75,75)(100,100,75,75); if panels layouts null and no need verticalandhorizontalAlignments
//		 
//		JPanel redpanel=new JPanel();
//		redpanel.setBackground(Color.red);
//		redpanel.setBounds(0,0,250,250);
//		redpanel.setLayout(new BorderLayout());
//		
//		JPanel yellowpanel=new JPanel();
//		yellowpanel.setBackground(Color.yellow);
//		yellowpanel.setBounds(250,0,250,250);
//		yellowpanel.setLayout(new BorderLayout());
//		
//		JPanel greenpanel=new JPanel();
//		greenpanel.setBounds(0,250,500,250);
//		greenpanel.setBackground(Color.green);
//		greenpanel.setLayout(new BorderLayout());
//		
//		JFrame frame2=new JFrame();
//		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame2.setLayout(null);
//		frame2.setSize(750,750);
//		frame2.setVisible(true);
//		greenpanel.add(label1);
//		frame2.add(redpanel);
//		frame2.add(yellowpanel);
//		frame2.add(greenpanel);		
//		
//		//JButton a button performs an action when clicked on
//		ButtonFrame buttonframe=new ButtonFrame();
//		
//		//BorderLayout places in five areas: north,south,east,west
//		JFrame frame3=new JFrame();
//		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame3.setLayout(new BorderLayout(10,10));
//		frame3.setSize(500,500);
//		frame3.setVisible(true);
//		
//		JPanel panel1=new JPanel();
//		JPanel panel2=new JPanel();
//		JPanel panel3=new JPanel();
//		JPanel panel4=new JPanel();
//		JPanel panel5=new JPanel();
//		
//		panel1.setBackground(Color.red);
//		panel2.setBackground(Color.blue);
//		panel3.setBackground(Color.yellow);
//		panel4.setBackground(Color.green);
//		panel5.setBackground(Color.white);
//		//panel5.setLayout(new BorderLayout());
//	
//		panel1.setPreferredSize(new Dimension(100,100));
//		panel2.setPreferredSize(new Dimension(100,100));
//		panel3.setPreferredSize(new Dimension(100,100));
//		panel4.setPreferredSize(new Dimension(100,100));
//		panel5.setPreferredSize(new Dimension(100,100));
//		
//		//--------------------sub panels----------------
//		JPanel panel6=new JPanel();
//		JPanel panel7=new JPanel();
//		JPanel panel8=new JPanel();
//		JPanel panel9=new JPanel();
//		JPanel panel10=new JPanel();
//		
//		panel6.setBackground(Color.black);
//		panel7.setBackground(Color.green);
//		panel8.setBackground(Color.blue);
//		panel9.setBackground(Color.yellow);
//		panel10.setBackground(Color.red);
//		
//		panel6.setPreferredSize(new Dimension(50,50));
//		panel7.setPreferredSize(new Dimension(50,50));
//		panel8.setPreferredSize(new Dimension(50,50));
//		panel9.setPreferredSize(new Dimension(50,50));
//		panel10.setPreferredSize(new Dimension(50,50));
//		
//		panel5.setLayout(new BorderLayout());
//		
//		panel5.add(panel6,BorderLayout.NORTH);
//		panel5.add(panel7,BorderLayout.EAST);
//		panel5.add(panel8,BorderLayout.SOUTH);
//		panel5.add(panel9,BorderLayout.WEST);
//		panel5.add(panel10,BorderLayout.CENTER);
//		
//		//--------------------sub panels----------------
//		
//		frame3.add(panel1,BorderLayout.NORTH);
//		frame3.add(panel2,BorderLayout.EAST);
//		frame3.add(panel3,BorderLayout.SOUTH);
//		frame3.add(panel4,BorderLayout.WEST);
//		frame3.add(panel5,BorderLayout.CENTER);
//		
//		//Flow Layout places components in row
//		JFrame frame4=new JFrame();
//		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame4.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));//hor,ver
//		frame4.setSize(500,500);
//		
//		
//		JPanel p=new JPanel();
//		p.setPreferredSize(new Dimension(250,250));
//		p.setLayout(new FlowLayout());
//		p.setBackground(Color.yellow);
//		
//		p.add(new JButton("1"));
//		p.add(new JButton("2"));
//		p.add(new JButton("3"));
//		p.add(new JButton("4"));
//		p.add(new JButton("5"));
//		p.add(new JButton("6"));
//		p.add(new JButton("7"));
//		p.add(new JButton("8"));
//		p.add(new JButton("9"));
//		
//		frame4.add(p);
//		frame4.setVisible(true);
//		
//		//Grid Layout places componenets in grid of cells in same size
//		JFrame frame5=new JFrame();
//		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame5.setLayout(new GridLayout(3,3,10,10));
//		frame5.setSize(500,500);
//		
//		frame5.add(new JButton("1"));
//		frame5.add(new JButton("2"));
//		frame5.add(new JButton("3"));
//		frame5.add(new JButton("4"));
//		frame5.add(new JButton("5"));
//		frame5.add(new JButton("6"));
//		frame5.add(new JButton("7"));
//		frame5.add(new JButton("8"));
//		frame5.add(new JButton("9"));
//		
//		frame5.setVisible(true);
//		
//		//Layered Pane dimension for positioning components eg.depth,z-index
//		JLabel label1=new JLabel();
//		label1.setOpaque(true);
//		label1.setBackground(Color.red);
//		label1.setBounds(50,50,200,200);
//		
//		JLabel label2=new JLabel();
//		label2.setOpaque(true);
//		label2.setBackground(Color.blue);
//		label2.setBounds(100,100,200,200);
//		
//		JLabel label3=new JLabel();
//		label3.setOpaque(true);
//		label3.setBackground(Color.yellow);
//		label3.setBounds(150,150,200,200);
//		
//		
//		JLayeredPane layeredpane=new JLayeredPane();
//		layeredpane.setBounds(0,0,500,500);
//		layeredpane.add(label1,Integer.valueOf(0));
//		layeredpane.add(label2,Integer.valueOf(2));
//		layeredpane.add(label3,Integer.valueOf(1));
//		
//		JFrame frame6=new JFrame();
//		frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame6.setLayout(null);
//		frame6.setSize(500,500);
//		frame6.add(layeredpane);
//		frame6.setVisible(true);
//		
//		//Open a new GUI Window
//		//New LaunchPage,New Window classes
//		LaunchPage launchPage=new LaunchPage();
//		
//		//JOption Pane Pops up standard dialog box ->prompts users for a value or informs them of something
//		
//		JOptionPane.showMessageDialog(null,"You are the Best","Title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null,"Dont care environment","Title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null,"How are you?","Title",JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null,"Society is fucked up","Title",JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null,"What is giving up","Title",JOptionPane.ERROR_MESSAGE);
//		
//		JOptionPane.showConfirmDialog(null,"Are you giving up now?");
//		JOptionPane.showInputDialog("Enter your name");
//		ImageIcon icon=new ImageIcon("lookingcat.png");
//		String[] responses= {
//				"I know It","Of Course","Thanks I already Knew that"
//		};
//		JOptionPane.showOptionDialog(null, "You are Awesome Dude", "Secret Message", 0, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);

	
	}
}
