package day21accessmodifiersstringbuilder;

public class Student {
	
	//If you use "private" as access modifier, it means you hid the data
	//If the access modifier is " private " , it is impossible to seee from
	//other classes
	private String name= "Ali Can";
	
	//If you do not type any access modifier, it means access modifier is
	//"default"
	//If the access modifier is default, the data will be visible inside
	//the entire package
	int age=13;
	
	//If you use protected acccess modifier, you can acccess to it,
	//from inside the package and from everychild classes even they 
	//are in different packages
	protected int grade=11;
	
	//If you use public access modifier, the class member(variables and methods)will be 
	//visible from entire the project
	public String country="USA";
	

}
