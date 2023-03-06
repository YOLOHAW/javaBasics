package javaSlider;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyFrame implements ChangeListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	MyFrame(){
		frame=new JFrame("Slider Demo");
		panel=new JPanel();
		label=new JLabel();
		slider=new JSlider(0,100,50);
		
		slider.setPreferredSize(new Dimension(400,200));
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25);
		
		slider.setPaintLabels(true);
		
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.addChangeListener(this);
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
	
	
	}
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		label.setText("C = "+slider.getValue());
	}
	
	
}
