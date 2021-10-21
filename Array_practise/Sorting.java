package Array_practise;

import java.util.Arrays; 
// # include<stdio.h>
// # include<Math.h>
// import pandas as pd
public class Sorting {
public static void main(String[] args)
{   
    
    int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013,    // adding data at compile time
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456
            };
            
    String[] my_array2 = {
            "Java",
			
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };        
    System.out.println("Original numeric array : "+Arrays.toString(my_array1));
    System.out.print("\n ");
    Arrays.sort(my_array1);
    System.out.print(" \n ");
    System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
    System.out.print("\n ");
    
    System.out.println("Original string array : "+Arrays.toString(my_array2));
    System.out.print(" \n ");
    Arrays.sort(my_array2);
    System.out.print(" \n ");
    System.out.println("Sorted string array : "+Arrays.toString(my_array2));
    }
}
