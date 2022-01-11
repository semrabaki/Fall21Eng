package day27exceptions;

public class Exception01 {

	public static void main(String[] args) {
		
		String s="Aliye Can";
		String t="Ali";
		divideLengths5(s,t);//3
		
		String s1="";
		String t1="Ali";
		divideLengths5(s1,t1);//0
		
		String s2="Aliye Can";
		String t2="";
		divideLengths5(s2,t2);//ArithmeticException
		
		String s3=null;//NullPointerException: If you use length() method with null object you will get "NullPointerException"
		String t3="Ali";
		divideLengths5(s3,t3);//ArithmeticException
		
		String s4="Aliye Can";
		String t4="Ali";
		divideLengths5(s4.substring(9),t4);//0 -Substring() method can use "the length" as argument, it returns empty String

		String s5="Aliye CanXXX";
		String t5="";
		divideLengths5(s5,t5);//StringIndexOutOfBoundsException: If you use non -existing index for Strings, you get that exception
	
	
	}
	
	
	///Create a method to divide the lengths of 2 given Strings
	
	public static void divideLengths(String s, String t)
	{
		int result;
		try
		{
			if(s.equals("Aliye CanXXX")) {				
				result = s.substring(13).length() / t.length();				
			}else {				
				result = s.length() / t.length();
			}
				
			System.out.println(result);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("Do not divide by zero--"+ e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.out.println("Do not try to count the number of characters for null object"+ e.getMessage());
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Do not use indexes greater than length"+ e.getMessage());
		}
		
		
	}
	//Instead of many catch blocks can we catch all exceptions by using just a single catch block?
		public static void divideLengths2(String s, String t) {		
			int result;		
			try {
				
				if(s.equals("Aliye CanXXX")) {				
					result = s.substring(13).length() / t.length();				
				}else {				
					result = s.length() / t.length();
				}			
				System.out.println(result);	
				
			}catch(RuntimeException e) {
				
				System.out.println("There is an issue in the try block.... - " + e.getMessage());
				
			}
		}
		
		
		//Create different logic for every Exception
		public static void divideLengths3(String s, String t) {		
			int result;
			
			try {			
				if(s.equals("Aliye CanXXX")) {				
					result = s.substring(13).length() / t.length();				
				}else {				
					result = s.length() / t.length();
				}			
				System.out.println(result);	
				
			}catch(ArithmeticException e) {
				
				result = 1;
				System.out.println(result);	
				
			}catch(NullPointerException e) {
				
				result = 0;
				System.out.println(result);	
				
			}catch(StringIndexOutOfBoundsException e) {
				
				result = -1;
				System.out.println(result);	
				
			}				
		}
		//If ArithmeticException occurs make the result 11, for the other Exceptions make the result 0
		//Note: if you use multiple catch blocks which have parent-child relationship
		//put the child at the top. Otherwise you will get Compile Time Error
		public static void divideLengths4(String s, String t) {		
			int result;
			
			try {			
				if(s.equals("Aliye CanXXX")) {				
					result = s.substring(13).length() / t.length();				
				}else {				
					result = s.length() / t.length();
				}			
				System.out.println(result);	
				
			}catch(ArithmeticException e) {
				
				result = 11;
				System.out.println(result);	
				
			}catch(Exception e) {
				
				result = 0;
				System.out.println(result);	
						
		}

}
		//Even you get Exception or not, I want to see "Mission is completed" message on the console
		//Note: try-block usage:
		//1)try + single catch  2)try + multiple catch  3)try + single catch + finally  4)try + multiple catch + finally  5)try + finally

		public static void divideLengths5(String s, String t)
		{
			int result;
			try
			{
				if(s.equals("Aliye CanXXX")) {				
					result = s.substring(13).length() / t.length();				
				}else {				
					result = s.length() / t.length();
				}
					
				System.out.println(result);	
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("Do not divide by zero--"+ e.getMessage());
				
			}
			catch(NullPointerException e)
			{
				System.out.println("Do not try to count the number of characters for null object"+ e.getMessage());
			
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("Do not use indexes greater than length"+ e.getMessage());
				
			}
			finally//If we want to execute the code in every condition we type it in finally block and java executes it in every condition
			{
				System.out.println("Mission is completed...");
			}
			
			
		}
}

