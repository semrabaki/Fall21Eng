package day02variablesscanner;

public class Day02TypeCasting {
	/*
	     Type Casting: We want to convert a number primitive type to an other number primitive type.
	     Number Primitive Data Types: byte < short < int < long < float < double
	 */

	public static void main(String[] args) {
		
		//Auto Widening Type Casting : If you change small data type to larger it is called Auto Widening Type Casting
		byte b1 = 12;
		short s1 = b1; //it is easy to put small one into larger one. Java can do it automatically
		
		int i1 = 123;
		float f1 = i1;
		
		
		
		//Expilict Narrawing: If you change large pritimitive data type to small it is called Axplicit Narrowing.
		
		double d1 = 2.34;
		float f2 = (float) d1;
		
		
		long l1 = 234;
		
		byte b2 = (byte)l1;
		
		System.out.println(l1);// 234
		System.out.println(b2);//-22
		
		
		//How to convert Primitive data type to Wrapper class
		// int ===> Integer     Integer===>int
		
		
		//if you convert primiitive to wrapper it called " Auto Boxing"
		int i2 = 123;
		
		Integer i2Wrapper = i2;
		
		
		//if you wrapper  to primiitiveit called " Unboxing"
		Integer i3Wrapper= 234;
		
		int i3 = i3Wrapper;
		
		
		
		
		
		
		

	}

}
