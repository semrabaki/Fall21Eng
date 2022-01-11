package day17foreachloopmultidimentionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class ReviewForEachLoop01 {

	public static void main(String[] args) {
		//1.Example:Find the vowels in a String by using arrays
		
		String s="Learn Java, earn! money";
		String letters[]= s.split("");
		
		System.out.println(Arrays.toString(letters));
		
		for(String w:letters)
		{
			if(w.equalsIgnoreCase("a")||w.equalsIgnoreCase("e")||w.equals("i")|| w.equalsIgnoreCase("o")||w.equalsIgnoreCase("u"))
			{
				System.out.print(w +" ");
			}
		}
		System.out.println();
		
		////2.Example: Print the words ending with "n"
		
		s=s.replaceAll("\\p{Punct}", "");
		System.out.println(s);
		
		String words[]= s.split(" ");
		
		for(String w: words)
		{
			if(w.endsWith("n"))
			{
				System.out.print(w+ " ");
			}
		}
		
		////3.Example :Find the sum of the digits of an integer given by user by using array
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter an integrr...");
		String n =scan.next();
		
		String digits[]= n.split("");
		System.out.println(Arrays.toString(digits));
		
		int sum=0;
		
		for(String w:digits)
		{
			sum= sum+Integer.valueOf(w);
			
		}
		
		System.out.println("Sum of the digits: " +sum);
		
		

	}

}
