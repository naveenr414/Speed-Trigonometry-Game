package com.nav.trig;

public class ProblemSolver 
{
	public static float solveProblem(String code)
	{
		/*
		 * Solve a Trig Problem (Like Sin pi/2), returns the result
		 */
		
		String operation = code.split(" ")[0];
		
		//If it is a Radian Problem
		if(code.contains("pi"))
		{
			
		}
		
		//Degree Problem
		else
		{
			//The Input is on the right hand side (30 in Sin 30)
			int value = Integer.valueOf(code.split(" ")[1]);
					
			if(operation.equalsIgnoreCase("sin"))
			{
				return (float) Math.sin(Math.toRadians(value));
			}
			
			else if(operation.equalsIgnoreCase("cos"))
			{
				return (float) Math.cos(Math.toRadians(value));
			}
			
			else if(operation.equalsIgnoreCase("tan"))
			{
				return (float) Math.tan(Math.toRadians(value));
			}
			
		}
		
		return 0;
	}
}
