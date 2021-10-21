package Array_practise;

public class Main 
{
public static void main(String[] args) 
{   
 int a[][] = new int[15][15];    // 10 row and 10 column 
 for(int i = 0; i <= 11; i++)
   {
      for(int j = 0; j < 10; j++)
      {
         System.out.printf("%2d ", a[i][j]);
      }
      System.out.println();
   }
}
}

