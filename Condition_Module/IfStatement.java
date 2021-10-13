package Condition_Module;

public class IfStatement 
{
	 
		public static void main(String[] args) //execution of problem start from main
		{
	     int num = 0;// variable will initialize with 0
		 //while (num<=100)//loop
	     //for(int num=0;num <=100 ;num++)
			do
		    {
			if (num<=50 || num<=60)//OR  && AND
			{
				System.out.println("Value of num is "+num);//0 1 2
			}
		     num++; //1 2 3
			}
			while(num<=100); //num = 1
	     }
}