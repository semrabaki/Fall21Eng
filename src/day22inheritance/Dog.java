package day22inheritance;

public class Dog extends Mammal{
	
	public Dog()
	{
		super(true);
		System.out.println("Boolean Dog Constructor");
	}

	public Dog(int age)
	{
		super();
		System.out.println("Integer Dog Constructor");
	}
	
	public void bark()
	{
		System.out.println("Dogs bark...");
	}

}
