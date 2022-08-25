package com.test.shelltest;

public class Grade {
	
	public String calculateGrade(int marks)
	{
		if(marks<=35)
			return "Fail";
		else if(marks>35 && marks<=50)
			return "3rd Class";
		else if(marks>50 && marks<=75)
			return "2nd Class";
		else if(marks>75 && marks<=100)
			return "1st Class";
		else
			return "Limit exceeded";
	}

	public static void main(String[] args) 
	{
		Grade obj = new Grade();
		System.out.print(obj.calculateGrade(80));

	}
	

}
