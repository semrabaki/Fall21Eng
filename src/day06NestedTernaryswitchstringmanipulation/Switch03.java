package day06NestedTernaryswitchstringmanipulation;

import java.util.Scanner;

public class Switch03 {
	
	/*
	 * Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
	 * Type code to print abbreviation of the countries. "US, UK, DE, TR, IN,PE, ES, BG, AL, FR"
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println(" Enter any counrty name from the list;{America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France\"");
		String country = scan.next().toLowerCase();
		
		switch(country) {
		case "america":
		    System.out.println("US");
		    break;
		case "england":
		    System.out.println("UK");
		    break;
		case "germany":
		    System.out.println("DE");
		    break;
		case "turkey":
		    System.out.println("TR");
		    break;
		case "india":
		    System.out.println("In");
		    break;
		case "peru":
		    System.out.println("Pe");
		    break;
		case "spain":
		    System.out.println("ES");
		    break;
		case "bulgaria":
		    System.out.println("BG");
		    break;
		case "albenia":
		    System.out.println("AL");
		    break;
		}
		    
		    
		
		

	}

}
