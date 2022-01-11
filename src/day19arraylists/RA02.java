package day19arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RA02 {

	public static void main(String[] args) {
		//How to check if multiple elements exist in a list
		//["A", "M","C","K","B"] ==> If "A", and "C, and "K" exist in the list
		
        List<String> list1= new ArrayList<>();
		
		list1.add("A");
		list1.add("M");
		list1.add("C");
		list1.add("K");
		list1.add("B");
		
		if(list1.containsAll(Arrays.asList("A","P","K")))
		{
			System.out.println("A,C, K eixst in the list");
		}
		else
		{
			System.out.println("A,C, K not eixst in the list");
		}
        
		System.out.println(list1.containsAll(Arrays.asList("A","C","K")));
		
	    list1.remove(0);
		
		//Remove M and put  S in  the place of M
				//[A,M, C, K, B]==>[A,S, C, K, B]
		
		 list1.set(list1.indexOf("M"), "S");
		 
		 System.out.println(list1);
		 
	}

}
