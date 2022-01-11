package day02variablesscanner;

public class Day02Memory {

	public static void main(String[] args) {
				/*
        Data Types in Java
        Note: In Java, there are 2 main data types
        
              1)Primitive Data Types: 
                    a)boolean: It has 2 different values which are "true" and "false"
                               Every boolean variable uses a single "bit" in memory
                               booleans have "false" as default value
                    b)char: It is used for single characters
                            Value must be put between single quotes like 'S'
                            Every char uses 16 bits in the memory
                    c)byte: Is used for "whole numbers" between -128 and 127
                            It uses 8 bits from the memory
                            If you are not sure the value between -128 and 127, do not use byte data type
                    d)short: It is used for whole number between -32768 to 32767
                             It uses 16 bits from the memory
                             If you are not sure the value between -32768 to 32767, do not use short data type
                    e)int: It is used for "whole numbers" between -2,147,483, 648 to 2, 147, 483, 647
                           It uses 32 bits from the memory
                    f)long: It is sued for "Whole numbers" between  9,223,372,036,854,775,807 to -9,223,372,036,854,775,808.
                            It uses 64 bits from the memory
                            Note: Every whole number is "int" for java as default. When you create "long" variable, you have to put 
                            "L" or "l" to the end to infrom jave the number is not "int" it is "long". Otherwise you will get error. 
                            
                    g)float: is used for "Decimal Numbers"
                             it uses 32 bits from the memory
                             Note: Every decimal number is "Double" for java as default. When you create " float" variable, you have to put 
                            "F" or "f" to the end to infrom jave the  number is not "Double" it is "Float". Otherwise you will get error. 
                            You can have 7 digits in the decimal part at most. 
                    h)double:It is used for Decimal numbers. 
                             It uses 64 bits from the memory.
                             You can have 16 digits in the decimal part at most. 
                               
                    
              Note: "=" is used to assign value to a variable
                    "==" is used to compare 2 values if they are equal to each other
                    "!=" means "not equal to"
                    
              Note: If all values in an operation is integer the result will be integer in Java
                    If the result is decimal in Math, Java converts the decimal to integer just by removing decimal part.
                    Java do not do "rounding" operation
                    
              Note: Every whole number is int for java as default. When you create "long" variable, you have to put 
                    "L" or "l" to the end to infrom jave the number is not int it is long. 
              
              2)Non-Primitive Data Type
                    
                    String: It is used for "Multiple Characters"
              
              Note: Stack memory is small and contains primitive data and address of non primitive data (references of non primitive data)
                    Heap memory is huge and contains non primitive data
                    
              Note: What is the differences between Primitive and Non Primitive data types:
                   a) Primitive data types are typed just by using lower cases but the non primitive data types use upper case in the first letter
                   b) Primitive data types are just 8, but non primitive ones are unlimited. 
                   c) Primitive data types were created by Java, we cannot create primitive data type.
                      But non primitive data types can be created by java and developers. 
                   d) Primitive data types are stored in "Stack Memory". Non primitive data types stored in "Heap Memory". 
                   *****e) Primitive data types have just "values" in them. 
                      But non primitive ones have "values" and "methods" in them.
                  
     */ 
		
		byte age = 12;
		System.out.println("Age:" + age); //12
		
		
		short populationOfVillage = 2000;
		System.out.println("Population:" + populationOfVillage);
		
		int profits= 2000000000;
		System.out.println("The Profits: $" + profits); // The Profits: $ 200000000
		
		long numberOfCellsInHuman= 4370327040374034L;
		System.out.println("The number of celss in Human : " + numberOfCellsInHuman);
		
		float f = 1.2F;
		System.out.println("Value:" + f);
		
		double d = 1.2;
		System.out.println("The value:" + d);
		
		String stdName = "Ali Can";
		System.out.println("Student Name: " + stdName);
		System.out.println(stdName.toUpperCase()); //ALI CAN
		System.out.println(stdName.toLowerCase());// ali can
		System.out.println(stdName.contains("i"));// True
		System.out.println(stdName.contains("x"));//False
	}

}
