package Condition_Module;

public class Switch_without_break 
{
	 
		public static void main(String[] args) 
		{
			/*The java switch statement is fall-through. 
			It means it executes all statement after first match if break statement is not used with switch cases.*/
			int num=20;
			switch(num){
			
			case 100:
				System.out.println("Value of Case 1 is "+num);
				break;
			case 200:
				System.out.println("Value of Case 2 is "+num);
				break;
			default:
				System.out.println("Value of default is "+num);
			
			}
			
		}
	 
	}