package Array_practise;
//import Array_practise.Array_input_user;
import java.util.Scanner;  
class Array_input_user  
{  
public static void main(String[] args)   
{  
int n; // 5  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");

//reading the number of elements from the that we want to enter  
n=sc.nextInt(); 

//creates an array in the memory of length 10  
int[] array = new int[10]; // 7 , 3 space 

System.out.println("Enter the elements of the array: ");  

for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
array[i]=sc.nextInt();  
}  
System.out.println("Array elements are: ");  
// accessing array elements using the for loop  
for (int i=0; i<n; i++)   
{  
System.out.println(array[i]);  
}  
}  
}  