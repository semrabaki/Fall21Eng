package day06NestedTernaryswitchstringmanipulation;

import java.util.Scanner;

public class StringManipulationReview {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		
		
		////Print the first and last character of the given String on the console. "Java is easy" ==>Jy
		
		System.out.println("Please enter a string");
		
		String str = scan.nextLine();
		
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length()-1);
		
//		//System.out.println(""+firstChar+lastChar);
////		if(str.length()==1)
////		{
////			System.out.println(firstChar);
////		} else {
////			System.out.println(""+firstChar+lastChar);
////		}
//
//		
//		//Print the index of first occurrence of 'a' if 'a ' exits. Otherwise print no 'a'.
//		//str.indexOf(); * Returns the index within this string of the first occurrence of the
////	    // specified substring
//		
//		int indexOf = str.indexOf("ar");
//		
////		if(indexOf!=-1)
////		{
////			System.out.println("index of a is " + indexOf);
////			
////		} else {
////			System.out.println(" No a");
////		}
//		
//		int lastIndexOf =str.lastIndexOf('r');
//		
//		if(lastIndexOf!=-1)
//			{
//				System.out.println("index of a is " + lastIndexOf);
//				
//			} else {
//				System.out.println(" No r ");
//			}
//		
		
//		//Check if a given character is unique in a String or not?
//		
//		System.out.println("Enter a character that you want to search");
//		
//		String c = scan.next();
//		
//		int firstOccuranceIndex = str.indexOf(c);
//		int lastOccuranceIndex = str.lastIndexOf(c);
//		
//		if (firstOccuranceIndex==-1)
//		{
//			System.out.println(""+ c+ "does not exits in the text");
//		}
//		else if (firstOccuranceIndex==lastOccuranceIndex)
//		{
//			System.out.println("The" + c+" is unique in the text");
//		}else
//		{
//			System.out.println("There are multiple "+ c+ "in the text");
//		}
//		
		
		////Get the initials of first name and last name of the user. Ali Can ==>AC
		
		char initialOfFirstName = str.charAt(0);
		
		char initialOfLastName = str.charAt(str.indexOf(" ")+1);
		
		System.out.println(""+initialOfFirstName+initialOfLastName);
		/*
		 * String shirtPrice = $12.99
		 * String shirtPrice = $25.99
		 * Type code to calculate the sum of the shirt and the touser prices.
		 */
		
		String shirtPrice = "$12.99";
		String trouserPrice ="$25.99";
		
		String updatedShirtPrice = shirtPrice.replace("$", "").replace(".", "");
		String updatedTrouserPrice = trouserPrice.replace("$","").replace(".","");
		
		System.out.println((Integer.valueOf(updatedShirtPrice)+Integer.valueOf(updatedTrouserPrice ))/100.0);
	}

}
