package day03scannersincrementdecrement;

import java.util.Scanner;

public class ModulusOperator {
	
	//When do we need the remainder in division operation we use "modulus operator". 
		//The symbol of "modulus operator" is "%"
		
		/*
		 	Ask user to enter two integer values, the first will be greater than the second.
			The remainder when you divide the first by the second will be the width, and 
			the sum of the two numbers will be the length of a rectangle. 
			Then calculate the area and the perimeter of the rectangle, and print them on the console.
		 */

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println(" Hey user give me two number, make the first greater");
		
		int bigInt = scan.nextInt();
		int smallInt= scan.nextInt();
		
		int width = bigInt % smallInt;
		int length = bigInt + smallInt;
		
		System.out.println("The area is : " +(width * length));//44
		System.out.println("The premiter is : " + 2*(width + length));//48
		
		scan.close(); // When you complete your task with Scanner class, you should close it. 
		
		
		
		
	}

}
