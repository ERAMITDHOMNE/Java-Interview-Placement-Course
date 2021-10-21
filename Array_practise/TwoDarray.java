package Array_practise;
class TwoDarray
{
    public static void main(String[] args) {
        // declares an array of integers 
    	// allocates memory for 10 integers
    	int anArray[][] = new int[3][3]; // 3x3 = 9 elements, size of row = 3,size of columns =3
    	// initialize first element
        anArray[0][0] = 100;
        // initialize second element
        anArray[0][1] = 200;
        // and so forth
        anArray[0][2] = 300;
        anArray[1][0] = 400;
        anArray[1][1]= 500;
        anArray[1][2]= 600;
        anArray[2][0] = 700;
        anArray[2][1] = 800;
        anArray[2][2] = 900;
        
        for(int i= 0 ;i < 3;i++)
        {
        for(int j= 0 ;j < 3;j++)
        {
        	System.out.println("Element at index : " + anArray[i][j]);	
        }
        }
      
		/*
		 * System.out.println("Element at index : " + anArray[0][0]);
		 * System.out.println("Element at index : " + anArray[0][1]);
		 * System.out.println("Element at index : " + anArray[0][2]);
		 * System.out.println("Element at index : " + anArray[1][0]);
		 * System.out.println("Element at index : " + anArray[1][1]);
		 * System.out.println("Element at index : " + anArray[1][2]);
		 * System.out.println("Element at index : " + anArray[2][0]);
		 * System.out.println("Element at index : " + anArray[2][1]);
		 * System.out.println("Element at index : " + anArray[2][2]);
		 */
    }
} 