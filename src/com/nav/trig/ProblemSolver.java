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
			//The leading and divisor of pi (3 pi / 4) 3 = leading, 4 = divisor
			int leading = 1;
			int divisor = 1;
			
			//If there is a leading number
			if(code.split(" ")[1].charAt(0)!='p')
			{
				leading = Integer.valueOf(code.split(" ")[1].charAt(0));
			}
			
			//If there is a divisor
			if(code.split(" ")[1].charAt(code.split(" ")[1].length()-1)!='i')
			{
				//Select the Last Character
				divisor = Integer.valueOf(code.split(" ")[1].charAt(code.split(" ")[1].length()-1));
			}
			
			if(operation.equalsIgnoreCase("sin"))
			{
				return (float) Math.sin(leading*Math.PI/divisor);
			}
			
			else if(operation.equalsIgnoreCase("cos"))
			{
				return (float) Math.cos(leading*Math.PI/divisor);
			}
			
			else if(operation.equalsIgnoreCase("tan"))
			{
				return (float) Math.tan(leading*Math.PI/divisor);
			}
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
