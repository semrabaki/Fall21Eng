package day02variablesscanner;

import java.util.Scanner;

public class Day02Scanner01 {

	public static void main(String[] args) {
		
		//To go to a class we create object most of the times
		//How will we create an object from class
		// a) Class Name b) Put a name for object c) " = " put d) new e) Class Name()
		
		
		Scanner scan = new Scanner(System.in);
		//System.out.println("Hey use enter your age!");
		//int age = scan.nextInt();
		//System.out.println("The age entered by user is " + age);
		
		
		
		// To get String from user you have 2 options 1) next(): Gets just first word
		                                             //2) nextLine():Gets all words then move the next line
		//System.out.println("Hey user enter firt name!");
		//String firstName= scan.next();
		//System.out.println("The first name entered by user is " + firstName);
		
		
		System.out.println("Hey user enter your address!");
		String address = scan.nextLine();
		System.out.println("Address user entered:" + address);
		
		
		
				
	
		

	}

}
