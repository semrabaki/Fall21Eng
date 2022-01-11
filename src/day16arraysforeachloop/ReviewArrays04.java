package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class ReviewArrays04 {

	public static void main(String[] args) {
		
		//Type code to find the number of words in a String
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any String...");
		String s = scan.nextLine();
		
		String words[]= s.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		System.out.println("Number of words : "+ words.length);
		
		//Count how many words starts with "a"
		
		int counter=0;
		
		for(int i=0; i<words.length; i++)
		{
			if(words[i].startsWith("a"))
			{
				counter++;
			}
		}
		
		System.out.println(counter +" word starts with a");
		
		
		

	}

}
