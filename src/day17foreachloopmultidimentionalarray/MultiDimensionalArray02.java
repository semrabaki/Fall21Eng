package day17foreachloopmultidimentionalarray;

import java.util.Arrays;

public class MultiDimensionalArray02 {

	public static void main(String[] args) {
		//Print the elements which have a from a 2 dimensional String array
		
		String arr1[][]= {{"learn", "java", "it"},{"is", "easy"}};
		
		for(String []w:arr1)
		{
			for(String x:w)
			{
				System.out.print(x+ " ");
				
				
			}
		}
		
		////Convert a 2 dimentional array to 1 dimensional array
		
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
