package com.nav.main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main 
{
	/*
	 * Create the Main Frame in here
	 */
	
	//Main Frame
	public static JFrame frame;
	private static JPanel panel;
	private static JButton button;
	private static JButton submit;
	private static JTextField textField;
	private static JLabel correct;
	
	//Screen Dimensions
	public static int width = 800;
	public static int height = 600;
	
	public static void main(String[] args)
	{
		//Initialize the Frame
		frame = new JFrame("Speed Trig Game");
		frame.setSize(width,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		//Create the Button
		button = new JButton("New Problem");
		button.addActionListener(new MainListener());
		
		correct = new JLabel("Is Correct");
		correct.setText("BOB");
		//Create a Panel for Buttons
		panel = new MainPanel();
		panel.add(button);
		frame.add(panel);
		frame.setVisible(true);
		
		//Draw the Button
		//genLatex(latex);
		
		//Refresh the Screen
	//	frame.setVisible(true);
	}
	

}
