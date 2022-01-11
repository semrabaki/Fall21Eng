package day17foreachloopmultidimentionalarray;

import java.util.Arrays;

public class MultiDimentionalArray01 {

	public static void main(String[] args) {
		// How to create multidimensional Arrays
		//If you use following syntex to create multidimensional array
		//inner arrays must be have same number of elements
		
		int arr1 [][]= new int [3][2];
		
		//How to assign values for specific indexes
		arr1[0][0]=2;
		arr1[0][1]=3;
		
		arr1[1][0]=10;
		arr1[1][1]=11;
		
		arr1[2][0]=7;
		arr1[2][1]=-2;
		
		System.out.println(Arrays.deepToString(arr1));
		
		int arr2[][]= {{2,11}, {5,-3,10,21,-8,5}};
		
		//If you use Arrays.ToStirng () for multidimentional arrays
		//you cannot see the elements, you will see the references on the console
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.deepToString(arr2));
		
		//Find the sume of all elements in an integer 2 dimensional array
		
		int arr3[][]= {{5,-2,3}, {7}, {11,45}};
		
		int sum=0;
		
		for(int [] w: arr3)
		{
			for(int x: w)
			{
				sum=sum+x;
			}
		}
		System.out.println(sum);
		

	}

}
