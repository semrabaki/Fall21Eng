package day18multidimensionalarrayandlist;

import java.util.Arrays;

public class ReviewMultiDimensionalArrays01 {

	public static void main(String[] args) {
        int arr2[][]= {{1,2},{3,4,5},{6,7,9,10}};
		
		//int arr[]= {1,2,3,4,5,6,7,8,9,10};
        
        int elements=0;
        
        for(int[] w:arr2)
        {
        	elements+=w.length;
        }
        
        int arr[]= new int [elements];
        
        int idx=0;
        
        for(int[]x:arr2)
        {
        	for(int y:x)
        	{
        		arr[idx]=y;
        		idx++;
        	}
        }
        System.out.println();
        System.out.println(Arrays.deepToString(arr2));
        System.out.println(Arrays.toString(arr));

	}

}
