package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays04 {

	public static void main(String[] args) {
		// Sort the String array elements in ascending order according to their lengths
		
		String sArr[]= {"Jacksonville","Miami","Keywe", "Tampa","Virginia"};
		System.out.println(Arrays.toString(sArr));
		
		//Sort in ascending by using the number of characters
		
		Arrays.sort(sArr, Comparator.comparingInt(String::length));//::==> Go to the class, find the method and use it
		System.out.println(Arrays.toString(sArr));
		
		//Sort in decending by using the number of characters
		
		Arrays.sort(sArr,Comparator.comparingInt(String::length).reversed());
		System.out.println(Arrays.toString(sArr));
		
		//Sort in decending order if there is multiple elements in same length put tehm in alphabetical order
		
		Arrays.sort(sArr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
		
		
		
		

	}

}
