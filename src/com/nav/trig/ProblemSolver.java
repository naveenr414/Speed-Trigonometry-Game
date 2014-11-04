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
			float answer = 0;
			//The leading and divisor of pi (3 pi / 4) 3 = leading, 4 = divisor
			int leading = 1;
			int divisor = 1;
			
			//If there is a leading number
			if(code.split(" ")[1].charAt(0)!='p')
			{
				leading = Integer.valueOf(code.split(" ")[1].substring(0, 1));
				System.out.println(code.split(" ")[1]);
			}
			
			//If there is a divisor
			if(code.split(" ")[1].charAt(code.split(" ")[1].length()-1)!='i')
			{
				int len = code.split(" ")[1].length();
				//Select the Last Character
				divisor = Integer.valueOf(code.split(" ")[1].substring(len-1,len));
			}
			System.out.println(leading+ " "+divisor);
			if(operation.equalsIgnoreCase("sin"))
			{
				answer =  (float) Math.sin(leading*Math.PI/divisor);
			}
			
			else if(operation.equalsIgnoreCase("cos"))
			{
				answer =  (float) Math.cos(leading*Math.PI/divisor);
			}
			
			else if(operation.equalsIgnoreCase("tan"))
			{
				answer =  (float) Math.tan(leading*Math.PI/divisor);
			}
			
			else if(operation.equalsIgnoreCase("csc"))
			{
				answer =  (float) Math.sin(leading*Math.PI/divisor);
			}
			
			else if(operation.equalsIgnoreCase("sec"))
			{
				answer =  (float) Math.cos(leading*Math.PI/divisor);
			}
			
			else if(operation.equalsIgnoreCase("cot"))
			{
				answer =  (float) Math.tan(leading*Math.PI/divisor);
			}
			return (float)Math.round(answer * 10) / 10;
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
			
			else if(operation.equalsIgnoreCase("csc"))
			{
				return (float) Math.sin(Math.toRadians(value));
			}
			
			else if(operation.equalsIgnoreCase("sec"))
			{
				return (float) Math.cos(Math.toRadians(value));
			}
			
			else if(operation.equalsIgnoreCase("cot"))
			{
				return (float) Math.tan(Math.toRadians(value));
			}
			
		}
		
		return 0;
	}
}
