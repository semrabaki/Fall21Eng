package lambda_functional_programming;

import java.util.stream.IntStream;

public class Fp04Review {

	public static void main(String[] args) {
		
		System.out.println(getSumFromSevenToHundred01());
		System.out.println(getMultiplicationFromTwoToEleven());
		System.out.println(calculateFactorial01(6));
		
	}
	
	//1)Create a method to find the sum of integers from 7 to 100
		//1.way
		public static int getSumFromSevenToHundred01()
		{
			return IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);
		}

		//2)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
		
		public static int getMultiplicationFromTwoToEleven() {
			return IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
		}
		//3)Create a method to calculate the factorial of a given number.(5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)	
				//1.way
	    public static Object calculateFactorial01(int x) {
				   
			   return x>0? IntStream.rangeClosed(1, x).reduce(1,Math::multiplyExact):"Do not enter negatve number";
	    }
}
