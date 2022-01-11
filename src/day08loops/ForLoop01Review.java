package day08loops;

import java.util.Scanner;

public class ForLoop01Review {

	public static void main(String[] args) {
		//Type all integers from 11 to 44 in the same line with a space between consecutive integersb
		
		for( int i= 11; i <45; i++)
		{
			System.out.print(i + " ");
		}
		
		System.out.println("===========================================================");
		
		//Type all even integers from 11 to 120 in the same line with a space between consecutive integers
		
		for( int i= 11; i <121; i++)
		{
			if (i%2==0)
			{
			System.out.print(i + " ");
			}
		}
		
		System.out.println("===========================================================");
		//Type all odd integers 120 to 11
		
		for( int i= 120; i >10; i--)
		{
			if (i%2!=0)
			{
			System.out.print(i + " ");
			}
		}
		
		System.out.println("===========================================================");
		
		//Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line with a space between consecutibe integers
		
		for( int i= 120; i >10; i--)
		{
			if (i%4==0 && i%6==0)
			{
			System.out.print(i + " ");
			}
		}
		
		System.out.println("===========================================================");
		
		//Convert "Java" to "J*a*v*a"
		
		String s = "Java";
		
		for( int i=0; i< s.length(); i++)
		{
			System.out.print(s.charAt(i) + "*");
		}
		
		// Type code to print all unique characters on the console from given String
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a String...");
		
		String str = scan.nextLine();
		
		for (int i = 0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			
			if(str.indexOf(c)==str.lastIndexOf(c))
			{
				System.out.println(c);
			}
		}
		
	}

}
