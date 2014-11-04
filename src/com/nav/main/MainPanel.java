package com.nav.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.image.BufferedImage;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;

import com.nav.latex.ProblemToLatex;
import com.nav.trig.ProblemGenerator;
import com.nav.trig.ProblemSolver;

public class MainPanel extends JPanel
{
	private static BufferedImage image;
	private static float answer;
	public MainPanel()
	{
		genRandom();
	}
	
	public static void genRandom()
	{
		String problem = ProblemGenerator.genProblem(true,true, false, true);
		answer = ProblemSolver.solveProblem(problem);
		String latex = ProblemToLatex.problemToLatex(problem);
		System.out.println(answer + " "+latex);
		image = genLatex(latex);
	}
	
	protected void paintComponent(Graphics g) 
	{
		    super.paintComponent(g);  
		    g.setColor(Color.WHITE);  
		    g.fillRect(0,0,Main.width,Main.height);  
		    g.drawImage(image, 50, 0, null);
		    repaint();
		    
	}
		  
			public static BufferedImage genLatex(String latex)
			{
				// create a formula
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
				
				return image;
			}


}
