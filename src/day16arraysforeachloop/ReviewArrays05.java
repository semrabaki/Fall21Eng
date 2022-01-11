package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class ReviewArrays05 {

	public static void main(String[] args) {
//		//Find the longest word in a String
//		
//		String s ="Ali Can went to school to learn";
//		
//		String words[]=s.split(" ");
//		System.out.println(Arrays.toString(words));
//		
//		Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
//		System.out.println(Arrays.toString(words));
//		System.out.println(words[0]);
//		
//		//Get just the year from the date in "mm/dd//yyyy" format
//		
//		String date="10/05/2021";
//		String year[]= date.split("/");
//		
//		System.out.println(year[2]);
		
		//Get the initials of the student names
		
		String t= "Ali Can, Veli Han, Mary Start went to school by bus";
		
		String u[]= t.split(", ");
		System.out.println(Arrays.toString(u));
		
		String initials="";

		int idx=0;
		
		for (int i=0; i<u.length; i++)
		{
			idx= u[i].indexOf(" ");
			initials = u[i].substring(0,1)+u[i].substring(idx+1, idx+2);
			
			System.out.println("Initials:" + initials);
		}
		
		
		
		
		
	}

}
