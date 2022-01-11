package Day10Loops;

import java.util.Scanner;

public class ReviewWhileLoop03 {
	

	/* Type java code by using while loop, 
    Write a program that prompts the user to input an integer. 
    It should then find the sum of the digits of that number. 
    123 ==> 1+2+3 = 6
*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer to find the sum of the d-54igits...");
		int num = scan.nextInt();
		
		int sum=0;
		
		while(num>0)
		{
			sum=sum+num%10;
			num/=10;
		}
		
		System.out.println(sum);

	}

}
