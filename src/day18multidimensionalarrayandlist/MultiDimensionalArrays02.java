package day18multidimensionalarrayandlist;

import java.util.Arrays;

public class MultiDimensionalArrays02 {
	
	//Find the maximum element in 2 dimensional array
	/*
	 * 1)Convert 2 dimensional array to 1 dimensional array then sort the elements in ascending order and get the last element
	 * 2)WE will get the lowest value then if a value is greater than the lowest value, I will assign the value to the lowest value
	 */

	public static void main(String[] args) {
		
		int a[][]= {{11,21},{-5, 34},{65,22,31}};
		
		//1)Convert 2 dimensional array to 1 dimensional array then sort the elements in ascending order and get the last element
		int sum=0;
		for(int[] w:a)
		{
			sum=sum+w.length;
		}
		
		int b[]= new int[sum];
		
		int idx=0;
		
		for(int[]w:a)
		{
			for(int x:w)
			{
				b[idx]=x;
				idx++;
			}
		}
		
		System.out.println(Arrays.toString(b));
		
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		System.out.println();
		System.out.println("Maximum Element: " +b[sum-1]);
		
		 //2)WE will get the lowest value then if a value is greater than the lowest value, I will assign the value to the lowest value
		 int x= Integer.MIN_VALUE;
		 for(int []w:a)
		 {
			 for(int y:w)
			 {
				 if(x<y)
				 {
					 x=y;
				 }
				 
			 }
		 }
		 System.out.println("Maximum value: "+ x);
		 
		
	
	

	}

}
