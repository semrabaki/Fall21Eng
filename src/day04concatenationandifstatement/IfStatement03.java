package day04concatenationandifstatement;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Hey user enter a month name..");
		String monthName= scan.next();
		
		if(monthName.equalsIgnoreCase("January")|| monthName.equalsIgnoreCase("February")|| monthName.equalsIgnoreCase("December")) {
			System.out.println(monthName + " is in winter");
		} 
		else if(monthName.equalsIgnoreCase("March")|| monthName.equalsIgnoreCase("April")|| monthName.equalsIgnoreCase("May")) {
			System.out.println(monthName + " is in spring");
		}
		else if(monthName.equalsIgnoreCase("June")|| monthName.equalsIgnoreCase("July")|| monthName.equalsIgnoreCase("August")) {
			System.out.println(monthName + " is in summer");
		}
		else if(monthName.equalsIgnoreCase("September")|| monthName.equalsIgnoreCase("October")|| monthName.equalsIgnoreCase("November")) {
			System.out.println(monthName + " is in summer");
		} else {System.out.println("Are you sure " + monthName+ " is a month name!!!");

	}
	}

}
