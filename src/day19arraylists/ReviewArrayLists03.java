package day19arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReviewArrayLists03 {

	public static void main(String[] args) {
		/*
	 	Ask user to enter a letter
	 	If the letter exists in list1 convert it to "Got it"
	 	otherwise add the element which user entered into the list
	    */
		List<String> list= new ArrayList<>();
		list.add("M");
		list.add("K");
		list.add("P");
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a letter...");
		
		String s= scan.next().toUpperCase();
		
		if(list.contains(s))
		{
			list.set(list.indexOf(s), "Got it");
		}
		else
		{
			list.add(s);
		}
		
		System.out.println(list);
		System.out.println(list.indexOf("Z"));
		
		

	}

}
