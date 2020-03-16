/*package whatever //do not write package name here */

import java.io.*;

//implemenatation of interface

interface StringFunctions{
    
    //functions by default abstract
    //only declaration
    void Concate(String str);
   
    void Show(String str);
    
}
class DemoInterface implements StringFunctions{
    
	public static void main (String[] args) {
	    String s="Learning ";
	    //object of class
	   	DemoInterface obj1=new DemoInterface();
	    
	    //invoke methods of interface
	    obj1.Show(s);
	    
	   	obj1.Concate(s);
	   	
	   	
	}
	//defining interface methods
	
	public void Concate(String str)
	{
	  String s1="is fun";
	  str+=s1;
	  System.out.println("Concated String is "+ str);
	}
	public void Show(String str)
	{
	    System.out.println("Original String is "+str);
	}
}
/* Output
Original String is Learning 
Concated String is Learning is fun*/
