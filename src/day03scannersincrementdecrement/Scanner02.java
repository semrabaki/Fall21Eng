package day03scannersincrementdecrement;

import java.util.Scanner;

public class Scanner02 {
	
	/*
 	Type a program which calculates the area and the perimeter of a rectangle whose length and width are entered by user. 
	Hint 1: Area of a rectangle is width x length
	Hint 2: Perimeter of a rectangle is 2x (width + length)
 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
        
		System.out.println("Please enter the lenght of the side...");
		
		double sideLength = scan.nextDouble();
		
        System.out.println("Please enter the width of the side...");
		
		double sideWidth = scan.nextDouble();
		
		System.out.println("The area of the rectangle : " + (sideWidth*sideLength));
		
		System.out.println("The perimeter of the rectangle : " + (2*(sideWidth+sideLength)));
		scan.close();

	}

}
