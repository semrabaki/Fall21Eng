package day14statickeywordarrays;
/*
 * Static Block:1) Static block is a code block, it is used to initialize "static (class) variables"
 *              2) If you use "static block" to initilaze "static variables", they will be 
 *              initialized before everythhing inside the Class.
 *              3) if you have multiple static blocks, Java will execute them from top to down
 *              4)[ you can initiazlie multiple static variable in one sttaic block
 */

public class CircleCalculator {
	
	static String nameOfTheShape = "Circle";
	static int value;
	static double pi;
	static String unit;
	
	static {
		value=12;
		pi=3.14;
		System.out.println("Static block");
	}
	
	static {
		unit="cm";
		System.out.println("Static Block 2");
	}
	public CircleCalculator()
	{
		System.out.println("Constructor");
		
	}

	public static void main(String[] args) {
		
		add();
		
		System.out.println("Main Method");
		
		CircleCalculator cc= new CircleCalculator();
		
		

	}
	
	public static void add()
	{
		System.out.println("Add method...");
	}

}
