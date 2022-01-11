package day04concatenationandifstatement;

import java.util.Scanner;

public class IfStatement02 {
	
	/*
	 * If you want to compare the values of two string use "equals()" method, do not use "=="
	 * "equals()" method only check the values 
	 * " =="checks values and the addresses
	 */

	public static void main(String[] args) {
		//Ask user to ender any day name, then print if it is "Week day" or "weekend day" 
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Hey user enter a day name..");
		String dayName = scan.next();
		
		if(dayName.equalsIgnoreCase("Monday")|| dayName.equalsIgnoreCase("Tuesday")|| dayName.equalsIgnoreCase("Wednesday")|| dayName.equalsIgnoreCase("Thursday")|| dayName.equalsIgnoreCase("Friday")) {
			System.out.println("Weekday");
		} 
		else if(dayName.equalsIgnoreCase("Saturday")|| dayName.equalsIgnoreCase("Sunday")){
			System.out.println("Weekend");
		} else {
			System.out.println(" User enter a day name!!!");
		}
		scan.close();

	}

}
