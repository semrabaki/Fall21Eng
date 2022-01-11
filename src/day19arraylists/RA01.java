package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class RA01 {

	public static void main(String[] args) {
		//How to remove duplicates from ArrayList
		
		/*
		 * Logic:
		 * Create a new list, then transfer the elements
		 * i)if they are not repeated
		 * ii)if an element is repeated transfer it just once
		 * [2,3,2,2,5]==> [2,3,5]
		 */
		
		List<Integer> list1= new ArrayList<>();
		
		List<Integer> listNew= new ArrayList<>();
		
		list1.add(2);
		list1.add(3);
		list1.add(2);
		list1.add(2);
		list1.add(5);
		
		for(Integer w: list1)
		{
			if(!listNew.contains(w))
			{
				listNew.add(w);
			}
		}
		
		System.out.println("New list"+ listNew);

	}

}
