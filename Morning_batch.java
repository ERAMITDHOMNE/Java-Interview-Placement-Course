// Structure of java program

//(JDK, JRE, JVM, JIT)
	//Java Development Kit to install java application on the system
	// java application to run software & program
	// JRE java run time environment to run application on system by default present on system
	//JVM - Java virtual machine(Intepreter) which do interpretation of java program varies from system to system
	//JIT - Just in time compiler (JAVAC) to compile
package JAVA_PACKAGE; // Set of classes

public class Morning_batch //class_name, Access specifier ,private,protected ,public
{

	public static void main(String[] args) // execution of whole code begin from here 
	{
		// static ,all variable/method  to belong to same class
		// int is datatype
		int a = 10;
		int b = 20; // int dataype
		int c = a + b;
		float z = a * b;
		double p = 90.0990908; // 90.909009 ,
		double q = 2.3090909; // double datatype
		char x ='q';//single quotes
		String s = "Java Programming";// group of character
		byte w = 100; // -128 to 127
		boolean o = true;
		boolean y = false;
		int i = 2 ;
		System.out.println(i);
		int j= 5;
		//i = i * j;
		i*=j;
		System.out.println(i);
		System.out.println(o);
		System.out.println(y);
		System.out.println(s);
		System.out.println(x);
		System.out.println(p+q);
		System.out.println(a);
		System.out.println(a * b);
		System.out.println(z);
		System.out.println(b);
		System.out.println(w);
		System.out.println("Addition of two number:" + c);
		

	}
	
	

}
