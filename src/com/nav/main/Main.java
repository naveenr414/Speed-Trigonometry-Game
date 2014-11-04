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
	public static JButton submit;
	public static JTextField textField;
	public static JLabel correct;
	
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
		
		JLabel info = new JLabel("3/2 = 0.9 2/2 = 0.7");
		info.setLayout(null);
		
		submit = new JButton("Submit");
		submit.addActionListener(new Submit());
		textField = new JTextField(5);
		textField.setSize(100, 50);
		correct = new JLabel("Is Correct");
		correct.setText("BOB");
		correct.setLocation(500, 500);
		//Create a Panel for Buttons
		panel = new MainPanel();
		panel.add(button);
		panel.add(info);
		panel.add(submit);
		panel.add(textField);
		panel.add(correct);
		frame.add(panel);
		frame.setVisible(true);
		
		//Draw the Button
		//genLatex(latex);
		
		//Refresh the Screen
	//	frame.setVisible(true);
	}
	

}
