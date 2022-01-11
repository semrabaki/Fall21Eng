package day07stringmanipulation;

import java.util.Scanner;

public class StringManipulation02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your full name");
		String fullName = scan.nextLine();
		
		String s1 = "Java";
		
		System.out.println(fullName);
		
		//1) Remove spaces from beginning and end when user entered the name
		
		String trimmedFullName = fullName.trim();
		System.out.println(trimmedFullName);
		
		//2) Check if the String is empty (No characters) String
		boolean IsTheStringEmpty = fullName.isEmpty();
		System.out.println(IsTheStringEmpty);
		
		
		//3)Check if the String is blank (No characters or just space character) String
		boolean IsTheStringBlank = fullName.isBlank();
		System.out.println(IsTheStringBlank);
		

		
		
		
		
		

	}

}
