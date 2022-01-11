package day29exceptions;

public class Exception02 {

	public static void main(String[] args) {
		
		divide(5,2);
		divide(5,1);
	}
	public static void divide (int a, int b)
	{
		try {
			if(b==1)
			{
				throw new DivideByOneException("No need to divide a number by 1");
			}
			else
			{
				System.out.println("Result is " +a/b);
			}
		}catch(DivideByOneException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}

//Create Custom Runtime EXception

/*
     1)To create a RuntimeException follow the same steps in Compile Time Exception creation.
     Just change the extend class name from "Exception" to "RuntimeException"
     
     2)When you call a method which throws Compile Time EXception, you will get red underline bu
     When you call a method which throws RunTimeEXception, you will not. 
 */
class DivideByOneException extends RuntimeException
{
	public DivideByOneException (String message)
	{
		super(message);
	}
}