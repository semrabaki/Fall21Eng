package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class RA05 {

	//Increase the value of every element bby 3 except 7

	public static void main(String[] args) {
		
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(21);
		list1.add(7);
		list1.add(25);
		list1.add(9);
		
		System.out.println("Old list: "+ list1);
		
	for(int i=0; i<list1.size(); i++)
		{			
		if(list1.get(i)==7)
		 {
		      continue;
		 }
		else
		{
			list1.set(i, (list1.get(i)+3));
		}
	}
		
	System.out.println("New list " + list1);

	}

}
