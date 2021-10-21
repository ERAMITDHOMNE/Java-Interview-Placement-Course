package Array_practise;

public class Arrayloop {

	public static void main(String[] args) 
	{
		
	        // declares an array of integers 
	    	// allocates memory for 10 integers
	    	int anArray[] = new int[10]; // size of array
	    	// initialize first element
	        anArray[0] = 100;// "snigdha" // 23.90909.//23.3456
	        // initialize second element
	        anArray[1] = 200;
	        // and so forth
	        anArray[2] = 300;
	        anArray[3] = 400;
	        anArray[4] = 500;
	        anArray[5] = 600;
	        anArray[6] = 700;
	        anArray[7] = 800;
	        anArray[8] = 900;
	        anArray[9] = 1000;
			/*
			 * for(int i=0;i<anArray.length;i++) { System.out.println("Element at index : "
			 * + anArray[i]); }
			 */
	        int i =0;
	        while(i<anArray.length) //10  9 
	        {
	        System.out.println("Element at index : " + anArray[i]);
	        i++;
	        }

	}

}
