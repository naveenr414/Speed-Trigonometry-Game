package com.nav.latex;

public class ProblemToLatex
{
	
	public static String problemToLatex(String problem)
	{
		//LaTeX each seperate part
		String sign = problem.split(" ")[0];
		String value = problem.split(" ")[1];
				
		//Convert the operation 
		sign = "\\" + sign;
		
		//Convert Pi
		value = value.replaceAll("pi", "\\pi");
		
		//Convert Fractions
		if(value.contains("/"))
		{
			String[] valueParts  = value.split("/");
			value = "{frac}{"+valueParts[0]+"}{"+valueParts[1]+"}";
		}
		return sign+" "+value;
		
	}
}
