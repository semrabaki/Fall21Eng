package day27exceptions;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		try {
     getPrintAge();
	} 
		catch(IllegalArgumentException e)
	{
			System.out.println("Hey do not you know age cannot be negatie=ve");
		}
		
	}

	//Create a method to get students` age  and print it on the console
	public static void getPrintAge()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Eneter your age...");
		int age= scan.nextInt();
		if(age>=0) {
		System.out.println("Your age is "+ age);
	    }
		else
		{
			throw new IllegalArgumentException();
		}
} 
}
