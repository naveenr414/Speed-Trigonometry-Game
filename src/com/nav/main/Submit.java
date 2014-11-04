package com.nav.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Submit implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(Float.valueOf(Main.textField.getText()) == MainPanel.answer)
		{
			Main.correct.setText("Correct");
		}
		else
		{
			Main.correct.setText("Incorrect");
		}
		Main.frame.setVisible(true);
	}
	
}
