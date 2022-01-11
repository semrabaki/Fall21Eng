package day05nestedifandternary;

public class Ternary01 {
	//If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"
	public static void main(String[] args) {
		
		int num = 0;
		
		if(num>0) {
			System.out.println(" Integer is positive");
		} else {
			System.out.println("Integer is not positive");
		}
		
		//Solve by using ternary
		String result= num > 0 ? " Integer is positive": "Integer is not positive";
		System.out.println(result);
		
		
		//Write a program to print the minimum of 2 integers on the console. Use ternary...
		
		int n1= 200;
		int n2= 200;
		
		int min = n1>n2 ? n2: n1;
		
		System.out.println( min +" is the minumum");
		
		//Write a program to print absolute value of an integer entered by user. 
		//abs(-2)=2, abs(5)=5, abs(0)=0
	    //To make a negative number positive multiply it by -1	
		
		int n3 = -7;
		
		int absoluteValue = n3>= 0 ? n3 : (-1*n3);
		System.out.println("The absolute value of the number is " +absoluteValue);
		 
		
		
		
				
		
	}

}
