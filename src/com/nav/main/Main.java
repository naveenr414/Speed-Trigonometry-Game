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
	private static JFrame frame;
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
		
		//Create a Panel for Buttons
		panel = new JPanel();
		panel.add(button);
		frame.add(panel);
		frame.setVisible(true);
		
		//Create the Problem
		String problem = ProblemGenerator.genProblem(false, true, true, false);
		String latex = ProblemToLatex.problemToLatex(problem);
		
		//Draw the Button
		genLatex(latex);
		
		//Refresh the Screen
		frame.setVisible(true);
	}
	
	public static void genLatex(String latex)
	{
		TeXFormula formula = new TeXFormula(latex);
		
		// render the formla to an icon of the same size as the formula.
		TeXIcon icon = formula
				.createTeXIcon(TeXConstants.STYLE_DISPLAY, 20);
		
		// insert a border 
		icon.setInsets(new Insets(5, 5, 5, 5));

		// now create an actual image of the rendered equation
		BufferedImage image = new BufferedImage(icon.getIconWidth(),
				icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = image.createGraphics();
		g2.setColor(Color.white);
		g2.fillRect(0, 0, icon.getIconWidth(), icon.getIconHeight());
		JLabel jl = new JLabel();
		jl.setForeground(new Color(0, 0, 0));
		icon.paintIcon(jl, g2, 0, 0);
		
		panel.getGraphics().drawImage(image, 0, 0, null);
	}
}
