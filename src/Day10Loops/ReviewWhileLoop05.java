package Day10Loops;

import java.util.Scanner;

public class ReviewWhileLoop05 {
	
	/*
	 * Ask user to enter the number of rows to create following image;
	 * if user gives you 4;
	 *                A1
	 *                AB2
	 *                ABC3
	 *                ABCD4
	 */


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer ...");
		int num = Math.abs(scan.nextInt());
		
		int i=0;
		
		
		while(i<=num)
		{
			char c= 'A';
			
			for (int j=1; j<=i; j++)
			{
				System.out.print(c);
				c++;
				
			}
			
			System.out.println(i);
			i++;
		}

	}

}
