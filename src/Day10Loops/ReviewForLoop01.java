package Day10Loops;

import java.util.Scanner;

public class ReviewForLoop01 {

	public static void main(String[] args) {
		/*
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */
		

        Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of rows...");
		int numOfRows = scan.nextInt();
		
		System.out.println("Enter the number of columns...");
		int numOfColumns = scan.nextInt();
		
		for(int i=1; i<=numOfRows; i++)
		{
			for (int j=1; j<=numOfColumns; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
			

	}

}
