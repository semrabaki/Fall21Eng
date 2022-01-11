package day15arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		//Create a String array and print the elements in alpabetical order on the console in different line
		
//		String sArr[]= new String[5];
//		System.out.println(Arrays.toString(sArr));
//		
//		sArr[0]= "Ali";
//		sArr[1]= "Bekir";
//		sArr[2]= "Zehra";
//		sArr[3]= "Yasin";
//		sArr[4]= "Mary";
		
		//How to create an array in a short way
		String sArr[]= {"Ali", "Bekir", "Zehra","Yasin", "Mary"};
		
		System.out.println(Arrays.toString(sArr));// [Ali, Bekir, Zehra, Yasin, Mary]
		
		//How to sort array elements
		
		Arrays.sort(sArr);
		
		System.out.println(Arrays.toString(sArr));//[Ali, Bekir, Mary, Yasin, Zehra]
		
		
		//How to print array elements one by one
		
		for(int i=0; i<sArr.length; i++)
		{
			System.out.println(sArr[i]);
		}
		
		//How to print array elements in reverse alphetical order==>[Zehra,Yasin, Mary, Bekir, Ali]
		
		for (int i=sArr.length-1; i>=0; i--)
		{
			System.out.println(sArr[i]);
		}

	}

}
