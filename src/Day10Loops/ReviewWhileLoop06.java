package Day10Loops;

import java.util.Scanner;

public class ReviewWhileLoop06 {
	
	//Get String from user and print just vowels (aeiou) inside String on the console

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s = scan.nextLine();
		
		//1.way
		
//		int i=0;
//	
//		
//		while(i<s.length())
//		{
//			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='U'||s.charAt(i)=='O')
//			{
//				System.out.print(s.charAt(i));
//			}
//			
//			i++;
//			
//		}
		
		//2/way
		
		String s1 =s.replaceAll("[^aeuoAEUO]", "");
		
		System.out.println(s1);
		
		
		

	}
	
	



}
