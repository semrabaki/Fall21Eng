package day06NestedTernaryswitchstringmanipulation;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string...");
		String str = scan.nextLine();
		
		//Print the first and last character of the given String on the console. "Java is easy" ==>Jy
        
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length()-1);
		
		System.out.println(firstChar+lastChar);//this give number since it will count it as integer
		
//		if(str.length()==1)
//		{
//			System.out.println(firstChar);
//		} else {
//			System.out.println(""+firstChar+lastChar);
//		}
//		
//		//Print the index of first occurrence of 'a' if 'a ' exits. Otherwise print no 'a'.
//		
//		//str.indexOf(); * Returns the index within this string of the first occurrence of the
//	    // specified substring
//		
//		int idx= str.indexOf("arn"); //Windows Ctrl+Hower //MAC Ctrl+Hover
//		
//		if(idx==-1) {
//			System.out.println("No a");
//		}
//		else {
//			System.out.println(idx +" is the index");
//		}
//		
//		
//		//Note: If you use non-existing character in indexOf() method, you will get -1 every time.
//		//Note: indexOf() method works with char and works with String
//		//Note: If you use multiple characters in indexOf(), it returns the index of first character
//		//Note: indexOf() method works with first occurrences every time.
//		
//		
//		//Print the index of last occurrence of a specific character
		
		
		
		int lastIdx = str.lastIndexOf("ar");
		
		System.out.println(lastIdx);
		
		//Note: If you use non-existing character in lastIndexOf() method, you will get -1 every time.
		//Note: lastIndexOf() method works with char and works with String
		//Note: If you use multiple characters in lastIndexOf(), it returns the index of first character
//		//Note: indexOf() method works with last occurrences every time.
		
		
		//Check if a given character is unique in a String or not?
//		
//		char c = 'a';
//		
//		int firstOccurrenceIdx = str.indexOf(c);
//		int lastOccurrenceIndex = str.lastIndexOf(c);
//		
//		
//		if(firstOccurrenceIdx==-1)
//		{
//			
//			System.out.println(c +" does not exist inside the String");
//			
//			
//		}if(firstOccurrenceIdx==lastOccurrenceIndex)
//		{
//			System.out.println(c + " is unique");
//		}
//		else
//		{
//			System.out.println(c + " is not unique");
//		}
//		
//		
//		}
		
		
		//Get the initials of first name and last name of the user. Ali Can ==>AC
	
	    char initialOfFirstName = str.charAt(0);
	    char initialOfLastName = str.charAt(str.indexOf(" ")+1);
	    System.out.println(""+ initialOfFirstName + initialOfLastName);
	    
	    
//	    //Get the character from index 3 to index y from a String
//	    String sub=str.substring(3,8);// In substring() method first index is inclusive, second index is exclusive
//	    System.out.println(sub);
	
	    //Get the character from index 3 to end from String
	    
	    String sub2=str.substring(3,str.length());// In substring() method first index is inclusive, second index is exclusive
	    System.out.println(sub2);
	    
	    //Note: There are two substring() methods. First one has 2 parameters, it is used to get a part 
	    //of a String from starting index(inclusive) to the ending index (exclusive)
	    //Second one  has a single parameter, it is used to get a part of a string from startung index(inclusive) to end
	/*
	 * String shirtPrice = $12.99
	 * String shirtPrice = $25.99
	 * Type code to calculate the sum of the shirt and the touser prices.
	 */
	String shirtPrice = "$12.99";
	String trouserPrice ="$25.99";
	String updatedShirtPrice = shirtPrice.replace("$", "").replace(".", "");
	System.out.println(updatedShirtPrice);
	
	String updatedTrouserPrice = trouserPrice.replace("$", "").replace(".", "");
	System.out.println(updatedTrouserPrice);
	
	
	System.out.println((Integer.valueOf(updatedShirtPrice) + Integer.valueOf(updatedTrouserPrice))/100.0);
	
	
	}
	

}
