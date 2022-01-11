package day12variabletypesmethodoverloadingconstructors;

public class MethodOverLoading01 {
	
	/*
 	Method Overloading: If you use same method name for different methods, it is called "method overloading"
 	                    Question: How do you achieve "method overloading"?
 	                              1)By using different number of parameters
 	                              2)By using different data types for parameters
 	                              3)If the data types of parameters are different you can change the order
 */
	//In method overloading , if you use same parameters with the same method name you will get Compile Time Error. 
	//Using different "return types or different  " access modifiers" or making " static" or non-static" does not fix 
	//"compile time error"

	public static void main(String[] args) {
		
		add(3,5);//This is "method call" Real values used for parameters in method call are called "Arguments"
		
		add(-2,12,32); //2. method
		
	
		
		add(3,5.2);// 4th method will be called because of the data types
		
		add(1.2, 5);//3rd
		
		add(2,3);
		    

	}
	
	public static void add(int a, int b) //When you create a method, if you create variables inside the method parentehsis
	                                     // it is called "parameters"
	{
		System.out.println("The sume is " + (a+b));
	}
	
	public static void add(int a, int b, int c)
	{
		System.out.println("The sume is " + (a+b+c));
	}
	
	public static void add(double x, int y)
	{
		System.out.println("The sume is " + (x+y));
	}
	
	public static void add(double y, double x)
	{
		System.out.println("The sume is " + (x+y));
	}

}
