package day33maps;

import java.util.Arrays;
import java.util.Scanner;

/*
 /*
	 	Get a String and a character from user 
	 	Count the number of characters between the first occurrence and the last occurence of the given character in the String
	 	Do not count the space characters
	 	If the character which user selected is displayed just once in the String return -1
	 	If the character which user selected does not exist in the String return -1
	 	For example; "Java is easy" - 'a' ==> 5
	 	             "Java is easy" - 'w' ==> -1
	 	             "Java is easy" - 'e' ==> -1
	 */ 

public class InterviewQuestion01 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter a character");
		String c=scan.next();
		String str="Java is easy";
		System.out.println(str);
		
		str=str.replaceAll("\\s", "");
		System.out.println(str);
		
		int ch=0;
		
		//String[] strArr= str.split("");
		//System.out.println(Arrays.toString(strArr));
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.contains(c))
			{
			if(str.indexOf(c)==str.lastIndexOf(c))
			{
				System.out.println(c+ " ==>"+-1);
				break;
			}
			else
			{ 
				//System.out.println(str.lastIndexOf(c));
				ch=str.lastIndexOf(c)- str.indexOf(c)-1;
				System.out.println(ch);
				
			}
		    }else
		    {
		    	System.out.println(c+ " ==>"+-1);
		    	break;
		    }
		}
		
		
		String s = "Java is easy";
		System.out.println(s);
		
		s = s.replaceAll("\\s", "");		
		System.out.println(s);
		
		char c1 = 'w';
		int counter = 0;
		int idxOfFirstOccurence = s.indexOf(c1);
		int idxOfLastOccurence = s.lastIndexOf(c1);
		
		if(idxOfFirstOccurence==idxOfLastOccurence) {
			
			System.out.println(-1);
			
		}else {
			
			for(int i=idxOfFirstOccurence+1; i<idxOfLastOccurence; i++) {
				counter++;
			}			
			System.out.println("The number of characters different from space: " + counter);
		}
		
	}

}
