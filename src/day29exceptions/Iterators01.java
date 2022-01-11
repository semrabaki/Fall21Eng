package day29exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<>(); //I created an "ArrayList" object in "List" data type
		list1.add("Ali");
		list1.add("Can");
		list1.add("Ali Can");
		
		System.out.println(list1);//[Ali, Can, Ali Can]
		
		//By using loops we cannot update lists(collections)
		for(String w:list1)
		{
			w=w+"!";
		}
		System.out.println(list1);//[Ali, Can, Ali Can]
		
		//loops cannot update collections because of that Java created a new structure which "iterator", by using
		//iterator we can do update on collections
		
		ListIterator list1Itr=list1.listIterator(); //list1Itr object is an ListIterator data type. 
		
		ListIterator list2Itr=list1.listIterator(); 
		
		while(list1Itr.hasNext())
		{
			Object el= list1Itr.next();
			list1Itr.set(el+"$$$$");//[Ali$$$$, Can$$$$, Ali Can$$$$]
		}
		System.out.println(list1);
		
		//How to remove all elements from list1 by using list Iterator
		while(list2Itr.hasNext())
		{
			list2Itr.next();
			list2Itr.remove();
		}
		System.out.println("==>"+ list1);	
		
		List<String> list2 = new ArrayList<>(); //I created an "ArrayList" object in "List" data type
		list2.add("A");
		list2.add("C");
		list2.add("B");
		
		System.out.println(list2);
		
		//How to print the elements one by one in reverse order by using list iterator
				ListIterator itr1 = list2.listIterator();
				
				//To move pointer to the end type the following code
				while(itr1.hasNext()) {
					itr1.next();
				}
				
				//Get the elements from the end
				while(itr1.hasPrevious()) {
					
					Object el = itr1.previous();
					
					System.out.print(el + " ");
				}
		
		//Add X, Y, X to the end of the list2 by using iterator
				while(itr1.hasNext()) {
					itr1.next();
				}
				
				list2.add("X");
				list2.add("Y");
				list2.add("Z");
				
				System.out.println(list2);
				
				//We have just "Iterator" as well
				
				/*
				  1)When you use "Iterator" you will not have i)hasPrevious() ii)previous() iii)set() methods
				  2)ListIterator can be used just with "lists bu iterator can be use with all collections
				 */
				Iterator itr2=list2.iterator();
				
				while(itr2.hasNext())
				{
					Object el= itr2.next();
					itr2.remove();
				}
		     System.out.println(list2);
	}

}
