package Condition_Package;

public class IF_Condition
{

	public static void main(String[] args) 
	{
		int score = 91;
		if(score > 95)
		{
		 System.out.println("Outstanding");
		}
		if(score < 95 || score > 90) // Logical and operator when both condition are true than only you will get inside 
		{
		 System.out.println("Excellent");
		}
		if(score < 90)
		{
		 System.out.println("Good");
		}

	}
}


