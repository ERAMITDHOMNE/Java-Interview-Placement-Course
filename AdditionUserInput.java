import java.util.*;
public class AdditionUserInput 
{

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter two input float value");
	System.out.println("Enter the value of a");
	float a = sc.nextFloat();
	System.out.println("Enter the value of b");
	float b = sc.nextFloat();
	System.out.println("Addition of two float user input value : " + (a + b));
    if (a > b)
	{
		System.out.println("a is bigger");
	}
	else
	{
		System.out.println("b is bigger");
	}
	}
}
