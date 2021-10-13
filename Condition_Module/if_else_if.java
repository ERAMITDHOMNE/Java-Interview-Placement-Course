package Condition_Module;

public class if_else_if  
{
	 
		public static void main(String[] args)
		{
	 
			int marks = 96;
	        char grade;// value ranges from A to F
	 
	        if (marks >= 90) 
	        {
	            grade = 'A';
	        } 
	        else if (marks >= 80) 
	        {
	            grade = 'B';
	        } 
	        else if (marks >= 70) 
	        {
	            grade = 'C';
	        } 
	        else if (marks >= 60) 
	        {
	            grade = 'D';
	        } 
	        else 
	        {
	            grade = 'F';
	        }
	        System.out.println("Grade = " + grade);
			
		}
	 
	}
