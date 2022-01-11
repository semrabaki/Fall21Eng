package day28exceptions;

public class Exception01 {

	public static void main(String[] args) {
		
		Object obj1= 12;//Object is the parent of all classes and data type can be selected from parent class. 
		                // 12 is integer but object is parent of all classes that is why we can select object as a data type
		
		convert(obj1);//ClassCastException: If some data types cannot be converted to another data types, Java throws that exception
                      //Object class can not be converted to String!!!
		
		
		String s1="139";
		convertStringToInteger(s1);//This is integer:139
		
        String s2="1a39b";
        convertStringToInteger(s2);//NumberFormatException:If you try to convert String which has characters different 
		                           //from digits you will get that exception
		
		String s3="";
		convertStringToInteger(s3);//NumberFormatException
		
	}
	
	public static void convert(Object obj)
	{
		try {
		String convertedString=(String)obj;
		System.out.println(convertedString);
	}
		catch(ClassCastException e)
		{
			System.out.println("Some data types cannot be converted to other data types-"+ e.getMessage());
			
		}
	}
	public static void convertStringToInteger(String str)
	{
		try {
		int parsedString = Integer.parseInt(str);
		System.out.println("This is integer: " +parsedString);
	}
		catch(NumberFormatException e)
		{
			System.out.println(str+ " could not be parsed to integer, because it has different characters from digitd"+e.getMessage());
		}

}
}