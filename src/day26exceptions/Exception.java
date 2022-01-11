package day26exceptions;

/*
  1)Exception is " unexcepted issues"
  2) If there is any Exception
      i)Stops execution
      ii)Throws Exception
  3)Try-block cannot be used alone
  4)After try-block we can use multiple catch-block
  5)When you use multiple catch block, if there is parent-child relationship between the Exception Classes
  child classes must be at the top.
   But if there is no parent -child relationship order is not important.
 */

public class Exception {

	public static void main(String[] args) {
		
		System.out.println(division(12,3));
		System.out.println(division(10,10));
		System.out.println(division(0,10));
		System.out.println(division(10,0));//ArithmeticException
		
		int arr[]= {2,3,7,1,5};
		System.out.println(addTwoConsecutiveArrayElements(arr,0));
		System.out.println(addTwoConsecutiveArrayElements(arr,1));
		System.out.println(addTwoConsecutiveArrayElements(arr,2));
		System.out.println(addTwoConsecutiveArrayElements(arr,3));
		System.out.println(addTwoConsecutiveArrayElements(arr,4));//ArrayIndexOutOfBoundsException
		
		int brr[]= {12,6,3,0,1};
		System.out.println(divideTwoConsecutiveArrayElements(brr, 0));//2
		System.out.println(divideTwoConsecutiveArrayElements(brr, 1));//Exception will be handled
		System.out.println(divideTwoConsecutiveArrayElements(brr, 2));//3
		System.out.println(divideTwoConsecutiveArrayElements(brr, 3));//1
		System.out.println(divideTwoConsecutiveArrayElements(brr, 4));//Exception will be handled





	}
	
	public static double division(int a, int b)
	{
	
//		if(b==0)
//		{
//			System.out.println("Do not try to divide by 0");
//			return 0;
//		}
//		else
//		{
//			return a/b;
//		}
		
		int result=0;
		try
		{
			result= a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Do not divide by zero..."+e.getMessage());
		}
		
		return result;
	}
	
	public static int addTwoConsecutiveArrayElements(int arr[], int index)
	{
		int result=0;
		try
		{
		result= arr[index]+arr[index+1];
		}
		catch(ArrayIndexOutOfBoundsException e)
	
		{
			
			System.out.println("Do not use the non-existing  indexes-" +e.getMessage());
		}
		
		return result;

}
	public static double divideTwoConsecutiveArrayElements(int arr[], int index)
	{ 
		double result=0;
		try {
			result= arr[index]/arr[index+1];
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Do not use non exisiting indexes-"+e.getMessage());
		}catch(ArithmeticException e)
		{System.out.println("Do not try to divide by zero-"+e.getMessage());
			
		}
		
		return result;
	}
	
	
}
