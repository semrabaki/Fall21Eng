package day16arraysforeachloop;

import java.util.Arrays;

public class ReviewArrays03 {

	public static void main(String[] args) {
		//Check if a specific element exists in an array
		int arr[]= {12, 13, 34, 12};
		int expectedElement =12;
		int counter =0;
		
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i]==expectedElement)
			{
				counter++;
				break;
			}
		}
		
		if(counter!=0)
		{
			System.out.println(expectedElement+ "exist in the array");
		}
		else
		{
			System.out.println(expectedElement+ " not exist in the array");
		}

		
		Arrays.sort(arr);
		
		System.out.println("Binary search results " + Arrays.binarySearch(arr, expectedElement));
	}

}
