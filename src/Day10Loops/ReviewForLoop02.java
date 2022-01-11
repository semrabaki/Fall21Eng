package Day10Loops;

import java.util.Scanner;

public class ReviewForLoop02 {
	
	/*
	   Get the number of rows from user then draw a right triangle by using asterixes
	   Number of rows = 4  ==>  *
	                            * *
	                            * * *
	                            * * * *
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of rows...");
		int numOfRows = scan.nextInt();
		
		
		for(int i=1; i<=numOfRows; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print("* ");
				
			}    
			
			
			System.out.println();
					
		}
	}

}
