package com.nav.main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;

import com.nav.latex.ProblemToLatex;
import com.nav.trig.ProblemGenerator;
import com.nav.trig.ProblemSolver;

public class Main 
{
	/*
	 * Create the Main Frame in here
	 */
	
	//Main Frame
	public static JFrame frame;
	private static JPanel panel;
	private static JButton button;
	
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
		button = new JButton("Click Me");
		button.addActionListener(new MainFrame());
		
		//Create a Panel for Buttons
		panel = new MainPanel();
		panel.add(button);
		frame.add(panel);
		frame.setVisible(true);
		
		//Create the Problem
	//	String problem = ProblemGenerator.genProblem(false, true, true, false);
	//	String latex = ProblemToLatex.problemToLatex(problem);
		
		//Draw the Button
		//genLatex(latex);
		
		//Refresh the Screen
	//	frame.setVisible(true);
	}
	

}
