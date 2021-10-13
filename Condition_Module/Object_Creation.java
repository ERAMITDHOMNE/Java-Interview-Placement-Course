package Condition_Module;

class Object_creation
{  
 //defining fields  
 int id = 1;//field or data member or instance variable  
 String name;  
 //creating main method inside the Student class  
 public static void main(String args[])
 {  
  //Creating an object or instance  
  Object_creation s1=new Object_creation();//creating an object of Student  
  //Printing values of the object  
  System.out.println(s1.id);//accessing member through reference variable  
  System.out.println(s1.name);  
 }  
}