package day17foreachloopmultidimentionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachLoop01 {

	public static void main(String[] args) {
		//1.Example:Find the vowels in a String by using arrays
		
		String s="Learn Java, earn! money";
		
		String chars[]= s.split("");
		System.out.println(Arrays.toString(chars));
		
		for(String w:chars)
		{
			if(w.equalsIgnoreCase("a")||w.equalsIgnoreCase("e")||w.equalsIgnoreCase("i")||w.equalsIgnoreCase("u")||w.equalsIgnoreCase("o"))
			{
				System.out.print(w+ " ");
			}
			
		}
		
		//2.Example: Print the words ending with "n"
		
		//First remaove all punctuation marks to get just words
		s=s.replaceAll("\\p{Punct}", "");
		
		String words[]= s.split(" ");
		System.out.println(Arrays.toString(words));
		for(String x:words)
		{
			 if (x.endsWith("n")|| x.endsWith("N"))
			 {
			 System.out.println(x+ " ");
				
		}
		

	}
		//3.Example :Find the sum of the digits of an integer given by user by using array
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter an integrr...");
		String n =scan.next();
		
		String digits[]= n.split("");
		
		System.out.println(Arrays.toString(digits));
		int sum=0;
		for(String w: digits)
		{
			sum=sum+Integer.valueOf(w);
		}
		
		System.out.println(sum);

}
}
