package Condition_Module;

public class For_loop_variation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int array [] = {1,2,3,4,5,6,7,8,9,0};
		/*
		 * for (int item:array) //item is temporary variable will initialize with every
		 * element of array { System.out.println("value in array : " + item); }
		 */
        for(int i = 0;i<array.length;i++)
       {
        	
        	System.out.println("value in array : " + array[i]);	
       }
	}

}
