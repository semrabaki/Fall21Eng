package day03scannersincrementdecrement;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		/*
	 	Type a program which calculates the area and the perimeter of a square whose side length is entered by user. 
		Hint 1: Area of a square is length x length
		Hint 2: Perimeter of a square is 4 x length
	 */
		
		
		//Get data from user
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter the lenght of the side...");
		
		double sideLength = scan.nextDouble();
		
		System.out.println("The area of the square : " + (sideLength*sideLength));
		
		System.out.println("The premiter of the square : " + (sideLength*4));
		scan.close();
	}

}
