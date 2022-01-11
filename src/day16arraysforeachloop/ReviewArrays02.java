package day16arraysforeachloop;

import java.util.Arrays;

public class ReviewArrays02 {

	//Check is array elements are sorted or not
	public static void main(String[] args) {
		
		String s1[] = {"A", "C", "T"};
		
		System.out.println("BEfore sorting: "+ Arrays.toString(s1));
		
		String s2[]= Arrays.copyOf(s1, s1.length);
		
		Arrays.sort(s1);
		
		System.out.println("BEfore sorting: "+ Arrays.toString(s2));
		
		System.out.println("After sorting: "+ Arrays.toString(s1));
		
		if(Arrays.equals(s1, s2))
		{
			System.out.println("Array is sorted");
			
		}else
		{
			System.out.println("Array is not sorted");
		}
		
		
		
		

	}

}
