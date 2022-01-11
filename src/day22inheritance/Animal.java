package day22inheritance;
/*
 * 1)"private" class members cannot be used by child classes
 * 2)"default" class members can be used by child classes if the
 * child class is in the same package with the parent class
 * 3)"protected" class members can be used by child classes
 * 3)"public" class members can be used by child classes
 * 5)To use "Static"class members, no need to create object, 
 * use them by class name
 * 6)"super()" is for calling parents constructor.
 * if you do not type "super()" inside the constructor
 * Java will put it as default but it will be invisible. 
 * 7)"Super()" must be in the first line inside the constructor. 
 * 8) "this()" and "super()"  must be in the first line inside a constructor
 * so "this()" and "super()" cannot  be used at the same time in a Constructor. 
 * 9)Java does not support "multiple inheritance".
 *  A child class cannot  have multiple parents
 */
public class Animal {
	
	public Animal(String name)
	{ 
		System.out.println("String animal Constructor");
	}
	
	public Animal()
	{ 
		
		System.out.println("No parameter animal Constructor");
	}
	
	int age;

	
	public void eat()
	{
		System.out.println("They eat...");
	}
	public void drink()
	{
		System.out.println("They drink...");
	}
	
	public static int heg=5;
}
