package day25interfaceencapsualtion;

public interface Vehicle {
	
	public default void move()
	{
		System.out.println("All cheicles should move...");
	}
	
	public static void staticMove()
	{
		System.out.println("All cheicles should move better...");
	}
	
	}


