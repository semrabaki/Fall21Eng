package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class RA061 {
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(21);
		list1.add(32);
		list1.add(25);
		list1.add(90);
		list1.add(35);
		list1.add(22);
		list1.add(97);
		System.out.println(deleteOddsMultiplyEvens(list1));
		
}
	
	public static List<Integer> deleteOddsMultiplyEvens (List<Integer>list)
	{
		
		for (int i=0; i<list.size(); i++)
		{
			
			if(list.get(i)%2==0)
			{
				//list.set(i, list.get(i)*5);
				list.set(i, list.get(i)*100);
			}
			if(list.get(i)%2!=0)
			{
				list.remove(i);
			}
		}
		return list;
	}

}
