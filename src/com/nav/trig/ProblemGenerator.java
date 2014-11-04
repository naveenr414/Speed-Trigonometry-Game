package com.nav.trig;

import java.util.Random;

public class ProblemGenerator
{
	/*
	 * A Class that creates different trig problems depending on the specifications
	 */
	
	private static String[] functions;
	private static String[] possibleValues;
	
	private static final String[] radianValues = {
		"0pi",   "pi/2",  "pi",       "3pi/2", "2pi",
		"pi/6", "2pi/3","7pi/6", "5pi/3", "13pi/6",
		"pi/4", "3pi/4","5pi/4", "7pi/4", "9pi/4",
		"pi/3", "5pi/6","4pi/3", "11pi/6","7pi/3"
	};

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
			possibleValues = new String[]{"0","30","45","60","000","001","002","003"};
		}
		
		else
		{
			//If only raidans
			if(radian)
			{
				possibleValues = new String[]{"000","001","002","003"};
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
		
		
		//Add Support for angle values outside of the first quadrant
		if(!basic)
		{
			int quadrant = r.nextInt(5)+1;
						
			//If this is a radian value
			if(currentValue.length() == 3)
			{
				currentValue = radianValues[5*(Integer.valueOf(currentValue))+quadrant-1];
			}
			
			//It is a degree
			else
			{
				//Change the Quadrant Value
				int newValue = Integer.valueOf(currentValue);
				newValue+=(quadrant-1)*90;
				currentValue = String.valueOf(newValue);
			}
		}
		else
		{
			if(currentValue.length() == 3)
			{
				currentValue = radianValues[Integer.valueOf(currentValue)];
			}
		}
		
		return currentFunction + " "+currentValue;
	}
}
