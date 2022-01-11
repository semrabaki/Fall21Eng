package day03scannersincrementdecrement;

import java.util.Scanner;

public class Scanner04 {
	
	/*
 	Get the firstname, middle name, lastname, SSN from user then print them like the following
 	
 	Ali Mert Can
 	123456789	 	
    */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Hey user enter firstname");
		
		String firstName = scan.next();
		
        System.out.println("Hey user enter middle name");
		String middleName = scan.next();
		
		System.out.println("Enter your last name");
		String lastName = scan.next();
		
		System.out.println("Enter your social security number");
		String ssn = scan.next();
		
		System.out.println(firstName+" "+middleName+" "+lastName);
		System.out.println(ssn);
		
		scan.close();
		

	}

}
