package day07stringmanipulation;

public class StringManipulation01 {
	
//	 * Regex (Regular Expression): Regex is used to ddeclare a group of characters
//	 * i)All lower case letters==> [a-z]
//	 * ii)All upper case letters==> [A-Z]
//	 * iii)All upper case and lower case letters==>[a-zA-Z]
//	 * iv)All characters different from space character ==> \\S
//	 * v)Space character ==> \\s
//	 //vi) All characters different from digits ==> \\D
//     vii) All digits ==>\\d
//	   viii)non alphabetical characters ==>[^a-zA-Z]
//	   ix)Characters from a to z. from A to Z, and from 0 to 9, and _==>"\\w"
//	   x)Characters different from a to z. from A to Z, and from 0 to 9, and _==>"\\W"

	public static void main(String[] args) {
		
		//1)Type code to find the number of space characters in a String
		
		String s1= "Ali1 went2 to3 the school.";
		String updatedS1= s1.replaceAll("\\S", "");
//	System.out.println(updatedS1.length());
		
		//System.out.println(updatedS1.length());
		
		//2)Type code to find the number of characters different from space characters
		
		//1.Way:Number of all characters- Number of space characters= Number of characters different from space character
		
		int numfCharsDifferentFromSpace = s1.length() - updatedS1.length();
		
		System.out.println(numfCharsDifferentFromSpace);
		
//		//2.way:Find the characters different from space  directly
        String updatedS11 = s1.replaceAll("\\s", "");//Ali1went2to3theschool.
        System.out.println(updatedS11.length());
//		
//		//3)Type code to find the number of digits, number of letters, and characters different from digits and numbers.
//		
        String s2 = "Ali Can: 1234567890 !!! ? .";
//		
     	String updatedS2 = s2.replaceAll("\\D", ""); //1234567890  "\\D" and "[^0-9]" have the same meaning
		System.out.println(updatedS2.length());//10
//		
     	String updated2s2 = s2.replaceAll("[^a-zA-Z]","");//Ali Can
//		
		System.out.println(updated2s2.length()); //6
		
		String updated3s2 = s2.replaceAll("[a-zA-Z0-9]","");//:  !!! ? .  --> it replace a-zA-Z0-9 with nothing
		System.out.println(updated3s2.length()); //11
		
		/*
		4)Check the password according to the given rule
			a)No space character at the beginning and at the end
			b)It must contain at least 1 digit
			c)It must contain at least 1 lowercase letter
			d)It must contain at least 1 uppercase letter
			e)It must contain at least 1 character different from digits and letters
        */
		
		
		String pwd = "123Abc!";
		boolean isFirstCharSpace = pwd.startsWith(" ");
		System.out.println(isFirstCharSpace);
		
		boolean isLastCharSpace = pwd.endsWith(" ");
		System.out.println(isLastCharSpace);
		
		int numOfDigitChars = pwd.replaceAll("\\D","").length();
		
		int numOfLowerCaseChars = pwd.replaceAll("[^a-z]", "").length();
		
		int numOfUpperCaseChars = pwd.replaceAll("[^A-Z]", "").length();
		
		int numOfCharsDiffFromLetterAndDigit = pwd.replaceAll("[a-zA-Z0-9]",  "").length();
		if (isFirstCharSpace)
		{
			System.out.println("Your password is invalid.Donot use space at the begining.");
		}
		if (isLastCharSpace)
		{
			System.out.println("Your password is invalid.Donot use space at the end.");
		}
		if(numOfDigitChars==0)
		{
			System.out.println("Your password is invalid.Use at least 1 digit.");
		}
		if(numOfLowerCaseChars==0)
		{
			System.out.println("Your password is invalid.Use at least 1 lowercase letter.");
		}
		if(numOfUpperCaseChars==0)
		{
			System.out.println("Your password is invalid.Use at least 1 uppercase letter.");
		}
		if(numOfCharsDiffFromLetterAndDigit==0)
		{
			System.out.println("Your password is invalid.Use at least 1 character different from letters and digits.");
		}	

	}

}
