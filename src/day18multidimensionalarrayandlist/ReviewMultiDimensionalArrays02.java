package day18multidimensionalarrayandlist;

import java.util.Arrays;

public class ReviewMultiDimensionalArrays02 {

	public static void main(String[] args) {
		//Find the maximum element in 2 dimensional array
		/*
		 * 1)Convert 2 dimensional array to 1 dimensional array then sort the elements in ascending order and get the last element
		 * 2)WE will get the lowest value then if a value is greater than the lowest value, I will assign the value to the lowest value
		 */
		
		int a[][]= {{11,21},{68, 34},{65,22,31}};
		int sum=0;
		
		for(int []w :a)
		{
			sum+=w.length;
			
		}
		
		int b[]= new int[sum];
		int idx=0;
		
		for(int []x:a)
		{
			for(int y:x)
			{
				b[idx]=y;
				idx++;
			}
		}
		
		Arrays.sort(b);
		
		System.out.println("The maximum value is: "+ b[sum-1]);
		
		
		//WE will get the lowest value then if a value is greater than the lowest value, I will assign the value to the lowest value
        int min= Integer.MIN_VALUE;
        
        for(int[]w:a)
        {
        	for(int t:w)
        	{
        		if(t>min)
        		{
        			min=t;
        		}
        	}
        	
        }
        System.out.println("The maximum value is "+ min);
        
        //The min value
        int max=Integer.MAX_VALUE;
        
        
        for(int []w:a)
        {
        	for(int x:w)
        	{
        		if(x<max)
        		{
        			max=x;
        		}
        	}
        }
        System.out.println("The minimum valie " + max);

	}

}
