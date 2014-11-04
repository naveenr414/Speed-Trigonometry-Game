package com.nav.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.nav.latex.ProblemToLatex;
import com.nav.trig.ProblemGenerator;

public class MainListener implements ActionListener
{

	public void actionPerformed(ActionEvent arg0) 
	{
		MainPanel.genRandom();
		
		//Refresh the Screen
	//	Main.frame.setVisible(true);	
	}

}
