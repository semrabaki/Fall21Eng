package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ReviewArrayLists06 {

	public static void main(String[] args) {
		
		//Create a method to delete odd elements and increase the even elements by multiplying 5

		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(21);
		list1.add(32);
		list1.add(25);
		list1.add(90);
		
		System.out.println(deleteOddsIncreaseEvens(list1));
	
	}
	
	public static List<Integer> deleteOddsIncreaseEvens(List <Integer> list)
	{
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i)%2==0)
			{
				list.set(i, list.get(i)*5);
			}
			else
			{
				list.remove(i);
			}
		
	}
		return list;
	
	}

}