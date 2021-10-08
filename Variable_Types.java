package JAVA_PACKAGE;

public class Variable_Types {

	public static void main(String[] args) 
	{
		
			int x=10;  
			System.out.println(x++);//10 (11)  // post increment /post decrement ,operator before variable
			System.out.println(x);//11
			System.out.println(++x);//12  // preincrement /pre decrement ,operator before variable
			System.out.println(x);//12
			System.out.println(x--);//12 (11) 
			System.out.println(x);//11
			System.out.println(--x);//10  
			int a=10;  
			int b=10;  
			System.out.println(a++ + ++a);//10+12=22  
			System.out.println(b++ + b++);//10+11=21  
			System.out.println(b);//12
			boolean c=true;  
			boolean d=false;  
			System.out.println(!c);//false (opposite of boolean value)  
			System.out.println(!d);//true    
            //int f = x++-++x;
            //System.out.println(f);
            int w = x++ + ++x;// 10 +12
            System.out.println(w);
            int s = 00001010 >> 1; //b to d multiplication , d to b division
            System.out.println(s);
            		
                     
          
	}

}
