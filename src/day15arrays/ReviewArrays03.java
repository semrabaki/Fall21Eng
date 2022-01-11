package day15arrays;

import java.util.Arrays;

public class ReviewArrays03 {

	public static void main(String[] args) {
		//[0,2,3,0,12,0] put the zeros at the end
		
		int arr[]= {0,2,3,0,12,0};
		int barr[]= new int [arr.length];
		int idx=0;
		
		for(int i=0; i< arr.length; i++)
		{
			if(arr[i]!=0)
			{
				barr[idx]= arr[i];
				idx++;
				
			}
				
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(barr));

	}

}
