package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
	
	//Check if a specific element exists in an array

	public static void main(String[] args) {
		
		int arr[]= {12, 13, 34, 12};
		
		//1.way
		int expectedElement =12;
		int counter =0;
		
		for(int i=0; i<arr.length; i++)
			
		{
			if(expectedElement==arr[i])
			{
				counter++;
				break;
			}
		}
		
		if(counter==0)
		{
			System.out.println(expectedElement +"does not exist in the array.");
		}
		else
		{
			System.out.println(expectedElement +" exist in the array.");
		}
		
		//2.way
		//a)binarySearch() returns  the index of the expected element if the elements exists
		//b)binarySearch() returns negative integers for non-existing elements. The value represents the order number
		//if the element exists
		//c)Before using binarySearch() method you have to use sort() otherwise the output you got does not
		//have  any meaning
		//d) binarySeacrh() does not give stable outputs for repeated values
		
		Arrays.sort(arr);
		System.out.println("Binary Search Results:" + Arrays.binarySearch(arr,expectedElement));

	}

}
