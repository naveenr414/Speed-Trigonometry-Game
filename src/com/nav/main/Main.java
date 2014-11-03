package com.nav.main;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main 
{
	/*
	 * Create the Main Frame in here
	 */
	
	//Main Frame
	private static JFrame frame;
	private static JPanel panel;
	
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
		
		//Create a Panel for Buttons
		panel = new JPanel();
		frame.add(panel);
		
		frame.setVisible(true);		
	}
}
