package com.nav.trig;

import java.util.Random;

public class ProblemGenerator
{
	/*
	 * A Class that creates different trig problems depending on the specifications
	 */
	
	private static String[] functions;
	private static String[] possibleValues;
	
	public static String genProblem(boolean radian,boolean degree,boolean basic,boolean invFunc)
	{
		/*
		 * Creates a problem depending on if the problem can include
		 * Radians
		 * Degrees
		 * Only Be in Quadrant 1 (0 - 90 / 0 - pi/2) 
		 * Involve inverse functions (csc, sec, cot)
		 */
		
		//It can be any of the basic functions or their inverses
		if(invFunc)
		{
			functions = new String[]{"sin","cos","tan","cot","sec","csc"};
		}
		
		//Only Basic Functions
		else
		{
			functions = new String[]{"sin","cos","tan"};
		}
		
		//If the values can be both Radians and Degrees
		if(radian && degree)
		{
			//The Possible Values for radians + degrees
			possibleValues = new String[]{"0","30","45","60","0 pi","pi / 6","pi / 4","pi / 3"};
		}
		
		else
		{
			//If only raidans
			if(radian)
			{
				possibleValues = new String[]{"0 pi","pi / 6","pi / 4","pi / 3"};
			}
			
			//If Only Degrees
			else
			{
				possibleValues = new String[]{"0","30","45","60"};
			}
		}
		
		//Select a Random value and function
		Random r = new Random();
		String currentFunction = functions[r.nextInt(functions.length)];
		String currentValue = possibleValues[r.nextInt(possibleValues.length)];	
		
		return currentFunction + " "+currentValue;
	}
}
