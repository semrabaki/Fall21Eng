package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ReviewArrayLists01 {

	public static void main(String[] args) {
		//How to remove duplicates from ArrayList
		
		/*
		 * Logic:
		 * Create a new list, then transfer the elements
		 * i)if they are not repeated
		 * ii)if an element is repeated transfer it just once
		 * [2,3,2,2,5]==> [2,3,5]
		 */
		
         List<Integer>list1= new ArrayList<>();
		
		  list1.add(2);
		  list1.add(3);
		  list1.add(2);
		  list1.add(2);
		  list1.add(5);
		  list1.add(4);
		  list1.add(9);
		  list1.add(9);
		  
		  List<Integer>list2= new ArrayList<>();
		  
		  for(int w: list1)
		  {
			  if(!list2.contains(w))
			  {
				  list2.add(w);
			  }
		  }
		  
		  System.out.println(list2);

	}

}
