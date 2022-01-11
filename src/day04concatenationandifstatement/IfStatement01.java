package day04concatenationandifstatement;

import java.util.Scanner;

public class IfStatement01 {
	
	/*
	 * "If it rains, I will cancel the picnic." in English.
	 *  If (it rains) {I will cancel the picnic};
	 *  
	 *  Note:The code to check if the number is even or not ==> number%2==0
	 */

	public static void main(String[] args) {
		
        Scanner scan = new Scanner (System.in);
		
        System.out.println("Hey user enter a number");
		int number = scan.nextInt();
		
		System.out.println("Hey user enter an other number");
		int number2 = scan.nextInt();
		
		//1.Exmaple:Get a number from the user. If the number is even print even.
		
		if(number%2==0){
			System.out.println(number + " is even");
		}
		
		//2.Exmaple:Get a number from the user. If the number is odd print odd.
		
		if(number%2!=0){
			System.out.println(" is odd");
		}

		//3.Exmaple:Get two numbers from the user. If the numbers are equal print "square" on the console
		
		if(number == number2){
			System.out.println("Square, because" + number+ " is equal to " + number2);
		}
		 
		scan.close();
		
	}

}
