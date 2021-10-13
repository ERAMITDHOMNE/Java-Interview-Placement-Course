package Condition_Module;

public class Nested_If 
{
	 
		public static void main(String[] args) // find out greatest of all
		{
	 
			int num = 99;
		// Nested If condition 	 , there is if inside another if condition
			if (num<=100)// outer if condition 
			{
				System.out.println("Value of num is "+num);
				
				if (num>90)// inner if condition
				{
					System.out.println("yes num is "+num);
				}
			}
		}
}
	 


