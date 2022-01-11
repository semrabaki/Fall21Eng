package day05nestedifandternary;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		/*
	 	Ask user to enter a password 
		
		If the initial of the password is uppercase then check if it is ‘A’ or not. 
		If it is ‘A’ the output will be “Valid Password” 
		otherwise the output will be “Invalid Password”
		For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid
		
		If the initial of the password is lowercase then check if it is ‘z’ or not. 
		If it is ‘z’ the output will be “Valid Password” 
		otherwise the output will be “Invalid Password”
		For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid
	 */

	/*
	 	Note: Every character in a String has index. 
	 	      Indexes start from zero so the index of first character is zero.
	 	      Index of last character in a String equals "the number of characters - 1"
	 */

			
			Scanner scan = new Scanner (System.in);
			
			System.out.println(" Please enter the password ...");
			String pwd = scan.next();
			
			if(pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z')
			{
				if(pwd.charAt(0) == 'A')
				{
					System.out.println(pwd + ": Valid Password");
				} 
				else
				{
					System.out.println(pwd + ": Invalid Password");
				}
			}
			else if(pwd.charAt(0) >= 'a' && pwd.charAt(0) <= 'z')
			{
				if(pwd.charAt(0) == 'z')
				{
					System.out.println(pwd + ": Valid Password");
				}
				else
				{
					System.out.println(pwd + ": Invalid Password");
				}
			}
			else 
			{
				System.out.println("First character should be letter...");
			}
			
			

	}

}
