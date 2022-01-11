package day01variables;

public class Variables02 {
	
	/*
	    Data Types in Java
	    Note: In Java there are two main data types:
	          1)Primitive Data Types 
	          a) boolean: It has 2 different values which are "true" or "false" 
	                      Every boolean has "false" as a default value
	                      Every boolean uses single "bit" in a memory
	          b) char: It is used for single characters
	                   values must be but between single quotes like 'S'
	                   Every char uses 16 bits in the memory
	          
	          c)byte 
	          d)short 
	          e)
	          
	       NOTE: "=" is used to assign value to a variable
	             "==" is used to compare 2 values if they are equal to each other
	             "!=" means not equal to
	        
	       NOTE: If all valueas in operation is integer the result will be integer in JAva
	             If the result in decimal in Math, Java converts the decimal to Integer just by removing the decimal part
	             Java do not "rounding" operations
	        * 
	          2)Non primitive Data Types
	          
	  
	 */
	public static void main(String[] args) {
		
		boolean isExpensive = true;
		boolean isOld = false;
		
		char initialOfFirstName = 'S';
		char initialOfLastName = 'A';
		System.out.println(initialOfFirstName);//S
		System.out.println(initialOfFirstName + 5);//88
		System.out.println(initialOfFirstName > 5);//True
		System.out.println(initialOfFirstName < 5);//False
		System.out.println(initialOfFirstName == 5);//False
		System.out.println(initialOfFirstName != 5); //False
		System.out.println(initialOfFirstName > initialOfLastName); //True
		System.out.println(initialOfFirstName + initialOfLastName); //148 (In mathematical operations java uses ASCII table)
		System.out.println(initialOfFirstName / initialOfLastName); //1 (it is integer)
		System.out.println(29 / 10); //2.9 ==> 2
		
		
		
	}

}
