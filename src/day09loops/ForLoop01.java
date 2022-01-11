package day09loops;

public class ForLoop01 {

	public static void main(String[] args) {
		String s1 = "Arda";
		
		
		
		for (int i=0; i<s1.length(); i++)
		{
			char c= s1.charAt(i);
			
			
			if(s1.indexOf(c)==s1.lastIndexOf(c))
			{
				System.out.println(c);
			}
		}

		
		//2)Type code to print a String in reverse after removing spaces
		//example ://naCilA
		
		String s2= "Ali Can";
		String reversed = "";
		
//		//1.way
//		
////		for(int i= s2.length()-1; i>=0; i--)
////		{
////			String c = s2.substring(i,i+1);
////			if(c.equals(" "))
////			{
////				s2=s2.replace(" ", "");
////			}else
////			{
////				reversed = reversed + c;
////			}
////		}
////		 System.out.println(reversed);
//		
//		//2.Way--- this solution is easier!!
//		
//		for (int i=s2.length()-1; i>=0; i--)
//		{
//			char c = s2.charAt(i);
//			if(c!=' ')
//			{
//				reversed = reversed +c;
//			}
//		}
//		System.out.println(reversed);
//		
//		 
//		 //3) Type code to find the sum of the integers from 12 to 231
//		 
//		 int sum = 0;
//		 
//		 for(int i=12; i<15; i++)
//		 {
//			 sum = sum + i;
//		 }
//		 
//		 System.out.println(sum);
//		 
//		 
//		 ////3) Type code to find the multipication of the integers from 3 to 7
//		 
//		 int multipication = 1;
//		 
//		 for(int i=3; i<8; i++)
//		 {
//			 multipication = multipication * i;
//		 }
//		 
//		 System.out.println(multipication);
//		 
//		 
//		 //5)Type code to check if a given String is Palindrome
//		 //String: anna Reversed String : anna
//		 //Integer: 12321 Reversed Integer:12321
//		 
//		 String s3= "anna";
//		 String rev3= "";
//		 
//		 for(int i=s3.length()-1; i>=0; i--)
//		 {
//			 rev3 = rev3 + s3.charAt(i);
//				 
//				 
//		 }
//		 System.out.println(rev3);
//		 if(s3.equals(rev3))
//		 {
//			 System.out.println(s3 +" is palindrome");
//		 }else
//		 {
//			 System.out.println(s3+ " is not palindrome");
//		 }
//		 
//		 //6)Type code to find the sum of the digits of an integer
//		 
//		 
//		 int sumOfDigits = 0;
//		 
//		 for (int n = 1243234; n>0; n=n/10)
//		 {
//			 sumOfDigits = sumOfDigits + n%10;
//		 }
//		 System.out.println(sumOfDigits);
		 
		 //6) Type code to find the sum of the unique digits of an integer
		 
		 String number = "2523";
		 int sumOfUniqueDigits =0;
		 
		 for ( int i=0; i< number.length(); i++)
			 
		 {
			 char c = number.charAt(i);
			 
			 
			 if(number.indexOf(c)==number.lastIndexOf(c))
			 {
				String cs = ""+ c;
				
				 sumOfUniqueDigits= sumOfUniqueDigits + Integer.valueOf(cs);
			 }
		 }
		 System.out.println("sum of digits: " +sumOfUniqueDigits);
	}

}
 