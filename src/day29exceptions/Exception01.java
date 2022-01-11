package day29exceptions;

public class Exception01 {

	public static void main(String[] args) {
		
		try {
			checkGrade(105);
		} catch (IllegalGradeException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
	}
	
	public static void checkGrade(int grade) throws IllegalGradeException
	{
		if(grade<0||grade>100)
		{
			throw new IllegalGradeException("Do not make the grade less than 0 or greater than 100");
		}
		else
		{
			System.out.println("Your grade is:" +grade);
		}
	}

}
//Create Custom Compile Time Exception
/*
  1)You have to extend to "Exception"class like"extends Exception"
  2)To be able to put "exception message" on the console, you should create constructor with
  String parameter like "public IllegalGradeEXception(String message)"
  3)Inside the constructor call parent constructor with message argument like "super(message)"
  4)After creating your own exception class you can use it in any method body whenever you need by
  typing like "Throw new IlliegalGradeException("Do not make the grade less than0 or greater than 100)
 */
 class IllegalGradeException extends Exception
{
	public IllegalGradeException(String message)
	{
		super(message); //This code helps to create my message line the ready exception messages similar to :/by zero
	}
}
