package Array_practise;

public class Sum 
{
public static void main(String[] args) 
{      
int my_array1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
int sum = 0;
for (int i : my_array1) // first variable , second  // for(int i = 1 ;i<=10;i++) { sum = sum + array1[i]}
{
    sum += i; //sum =sum + i , sum =1
}
System.out.println("The sum is " + sum);
}
}

