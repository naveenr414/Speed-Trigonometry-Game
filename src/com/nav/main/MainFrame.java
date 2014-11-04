package com.nav.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.nav.latex.ProblemToLatex;
import com.nav.trig.ProblemGenerator;

public class MainFrame implements ActionListener
{

	public void actionPerformed(ActionEvent arg0) 
	{
		//Create the Problem
		String problem = ProblemGenerator.genProblem(false, true, true, false);
		String latex = ProblemToLatex.problemToLatex(problem);
		
		//Draw the Button
		MainPanel.newImage(latex);
		
		//Refresh the Screen
	//	Main.frame.setVisible(true);	
	}

}
