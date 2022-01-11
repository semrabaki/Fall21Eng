package day19arraylists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReviewArrayLists02 {
	
	//How to check if multiple elements exist in a list
		//["A", "M","C","K","B"] ==> If "A", and "C, and "K" exist in the list
	
	public static void main(String[] args) {
		
        List<String> list1= new ArrayList<>();
		
		list1.add("A");
		list1.add("M");
		list1.add("C");
		list1.add("K");
		list1.add("B");
		
		//1.way
		
		List<String> list2= new ArrayList<>();
		
		list2.add("A");
		list2.add("C");
		list2.add("K");
		
		if(list1.containsAll(list2))
		{
			System.out.println("A, C, K exists in the list");
		}
		
		//2.way
		
		if(list1.containsAll(Arrays.asList("A","C","K")))
				{
			System.out.println("A, C, K exists in the list");
				}
		
		
		
	}

}
