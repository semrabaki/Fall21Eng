package day07stringmanipulation;

public class StringManupulation01Review {
	
//	 * Regex (Regular Expression): Regex is used to ddeclare a group of characters
//	 * i)All lower case letters==> [a-z]
//	 * ii)All upper case letters==> [A-Z]
//	 * iii)All upper case and lower case letters==>[a-zA-Z]
//	 * iv)All characters different from space character ==> \\S
//	 * v)Space character ==> \\s
//	 //vi) All characters different from digits ==> \\D
//    vii) All digits ==>\\d
//	   viii)non alphabetical characters ==>[^a-zA-Z]
//	   ix)Characters from a to z. from A to Z, and from 0 to 9, and _==>"\\w"
//	   x)Characters different from a to z. from A to Z, and from 0 to 9, and _==>"\\W"

	public static void main(String[] args) {
		
		String s1= "Ali went to the school.";
		
		//1)Type code to find the number of space characters in a String
		//String updatedS1= s1.replaceAll("\\S","");
		//System.out.println(updatedS1.length());
		
		//2)Type code to find the number of characters different from space characters
		
//		String updatedS1 = s1.replaceAll("\\s", "");
//		System.out.println(updatedS1.length());
//		
		
		//3)Type code to find the number of digits, number of letters, and characters different from digits and numbers.
		
//		String s2 = "Ali Can: 1234567890 !!! ? .";
//		
//		String updatedS2 = s2.replaceAll("\\D", "");
//        System.out.println(updatedS2);
//        System.out.println(updatedS2.length());
//        
//        String updated2S2 = s2.replaceAll("[^a-zA-Z]", "");
//        System.out.println(updated2S2);
//        System.out.println(updated2S2.length());
//        
//        String updated3S2 = s2.replaceAll("\\w", "");
//        System.out.println(updated3S2);
//        System.out.println(updated3S2.length());
        
        
        
        /*
		4)Check the password according to the given rule
			a)No space character at the beginning and at the end
			b)It must contain at least 1 digit
			c)It must contain at least 1 lowercase letter
			d)It must contain at least 1 uppercase letter
			e)It must contain at least 1 character different from digits and letters
        */
		
		String pwd = "123Abc.";
		
		boolean isFirstCharSpace = pwd.startsWith(" ");
		boolean isLastCharSpace = pwd.endsWith(" ");
		int numberOfdigits = pwd.replaceAll("\\D","").length();
		int numberOfLowerCaseChars = pwd.replaceAll("[^a-z]","").length();
		int numberOfUpperCaseChars = pwd.replaceAll("[^A-Z]","").length();
		int numberOfCharsDiffFromDigitsAndLetters = pwd.replaceAll("\\w","").length();
		
		
		if (isFirstCharSpace==true)
		{
			System.out.println("Your password is invalid.Donot use space at the begining.");
		}
		
		if (isLastCharSpace==true)
		{
			System.out.println("Your password is invalid.Donot use space at the end.");
		}
		if (numberOfdigits==0)
		{
			System.out.println("Your password is invalid.Use at least 1 digit.");
		}
		if(numberOfLowerCaseChars==0)
		{
			System.out.println("Your password is invalid.Use at least one  lowercase letter.");
		}
		if(numberOfUpperCaseChars==0)
		{
			System.out.println("Your password is invalid.Use at least one uppercase letter.");
		}
		if(numberOfCharsDiffFromDigitsAndLetters==0)
		{
			System.out.println("Your password is invalid.Use at least 1 character different from letters and digits.");
		}
	}

}
