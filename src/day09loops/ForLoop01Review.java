package day09loops;

public class ForLoop01Review {
	
	//Show the unique characters of given text
	
	public static void main(String[] args) {
	
	  //String s ="anna";
	  
	  
//	  for ( int i= 0; i<s.length(); i++ )
//	  {
//		  char c = s.charAt(i);
//		 
//		  if(s.indexOf(c) == s.lastIndexOf(c))
//		  {
//			  System.out.print(c);
//		  }
//		  
//	  }

	//2)Type code to print a String in reverse after removing spaces
			//example ://naCilA
//	  String updatedS= s.replaceAll("\\s", "");
//	  String reverse = "";
//	  
//	  System.out.println(updatedS);
//	  
//	  for (int i= updatedS.length()-1; i>-1; i--)
//	  {
//		  
//		  char c= updatedS.charAt(i);
//		  
//		  reverse = reverse+ c;
//		  
//		
//		  
//	  }
//	  System.out.println("Reversed" + reverse);
	  
	  
	  //3) Type code to find the sum of the integers from 12 to 231
//	  int sum= 0;
//	  
//	  for (int i=1; i<6; i++)
//	  {
//		  sum = sum + i;
//	  }
//	  
//	  System.out.println(sum + " the sum of given numbers");
//	  
//	////3) Type code to find the multipication of the integers from 3 to 7
//	  
//     int multiply= 1;
//	  
//	  for (int i=1; i<3; i++)
//	  {
//		  multiply = multiply *i;
//	  }
//	  
//	  System.out.println(multiply + " the sum of given numbers");
	  
	  ////5)Type code to check if a given String is Palindrome
//		 //String: anna Reversed String : anna
//		 //Integer: 12321 Reversed Integer:12321
//	  
//	  String reversed = "";
//	  
//	  for(int i=s.length()-1; i>-1; i--)
//	  {
//		  char c = s.charAt(i);
//		  reversed = reversed + c;
//		  
//	  }
//	  
//	  if (s.equals(reversed))
//	  {
//		 System.out.println(" a given String is Palindrome "); 
//	  }else
//	  {
//		  System.out.println(" it is not palindrome");
//	  }
	  
	  // //6)Type code to find the sum of the digits of an integer
	  
	  String num = "12234";
	  int sum = 0;
	  for(int i=0; i<num.length(); i++)
	  {
		  char c= num.charAt(i);
	   if (num.indexOf(c)== num.lastIndexOf(c))
	   {
		  
		   String cs = "" + c;
	 
	  
		   sum = sum + Integer.valueOf(cs);
	  }
	  }
	  
	  System.out.println(" sum of digits : " + sum);
	  
//	  for (int n = 1243234; n>0; n=n/10)
//			 {
//				 sum = sum + n%10;
//			 }
//			 System.out.println(sum);
	  
	}
}
