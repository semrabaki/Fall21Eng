package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReviewArrays02 {

	public static void main(String[] args) {
		//Get the array elements from user and create an array
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the length of the array...");
		int length= scan.nextInt();
		
		String sArr[]= new String [length];
		
		for(int i=0; i<length; i++)
		{
			System.out.println(" Enter the " +(i+1)+ ". element");
			sArr[i]= scan.next();
			
			
		}
		
		System.out.println(Arrays.toString(sArr));
		
		////Make the second element first, first element last, last element second
		
		String s2Arr[]= new String [length];
		
		for (int i= 0; i<length; i++) {
			
			if(i==0||i==1||i==(length-1))
			{
				continue;
			}
			
		s2Arr[i]= sArr[i];
		
		}
		
		s2Arr[0]=sArr[length-1];
		s2Arr[1]= sArr[0];
		s2Arr[length-1]= sArr[1];
		System.out.println("Yeni array :"+  Arrays.toString(s2Arr));
		
		
		
	}

}
