package Day10Loops;

import java.util.Scanner;

public class WhileLoop04 {
	
	/*
	 Type java code by using while loop, 
    Write a program to count the factors of an integer which is entered by user.
    Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
    Factors of 8  = 1, 2, 4, 8 ==> 4
*/

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to find the factors...");
		int num = Math.abs(scan.nextInt());
		
		
		int i=1;
		
		int counter=0;//Flag
		
		while(i<=num) {
			
			if(num%i==0) {
				
				counter++;
				
				System.out.print(i+" ");
				
			}
			i++;
		}
		
		System.out.println("Number of positive factors: "+counter);
		System.out.println("Number of negative factors: "+counter);
		System.out.println("Number of all factors: "+2*counter);
            scan.close();
            
	}

}
