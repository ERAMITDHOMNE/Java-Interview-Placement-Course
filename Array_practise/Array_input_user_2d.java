package Array_practise;
import java.util.Scanner;   
public class Array_input_user_2d  
{   
public static void main(String args[])   
{   
int m, n, i, j;   
Scanner sc=new Scanner(System.in);   
System.out.print("Enter the number of rows: ");   

m = sc.nextInt(); 

System.out.print("Enter the number of columns: ");   

n = sc.nextInt();   

int array[][] = new int[m][n];   

System.out.println("Enter the elements of the array: ");   

for (i = 0; i < m; i++)
{
for (j = 0; j < n; j++) //0,0  , 0,1 ,0,2 , 1,0,1,1,1 ,2     2,0   2,1  2,2
{
array[i][j] = sc.nextInt();
}

}

System.out.println("Elements of the array are: ");   
for (i = 0; i < m; i++)   
{   
for (j = 0; j < n; j++)   
{ 
System.out.print(array[i][j] + " ");   
}
System.out.println();   
}   
}   
}  