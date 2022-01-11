package day16arraysforeachloop;

import java.util.Arrays;

public class ReviewArrays01 {

	public static void main(String[] args) {

		//Check if 2 arrays are same or not
		//If 2 arrays are same ; same elements must be in the same index
		
		int arr1[]= {5,12,32,11};
		int arr2[]= {5,12,11};
		
//		int counter=0;
//		if(arr1.length==arr2.length)
//		{
//		for(int i=0; i<arr1.length; i++)
//		{
//			if(arr1[i]!=arr2[i])
//			{
//				counter++;
//				break;
//			}
//		}
//		if(counter>0)
//		{
//			System.out.println("Arrays are not the same");
//		}
//		else
//		{
//			System.out.println("Arrays are the same");
//		}
//		}else {
//			System.out.println("Arrays are not the same");
//		}
//		
		
		//2.way
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Arrays are the same");
		}
		else {
			System.out.println("Arrays are not the same");
		}
	}
}


