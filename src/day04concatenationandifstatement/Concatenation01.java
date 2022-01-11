package day04concatenationandifstatement;

public class Concatenation01 {
	
	/*
	 * If you join two or more string you can use "+" or "concat()"
	 * Note: If you are sure  the data types of S3 and S4 are the same
	   you can use the followinf syntax;
	   String S3= "Ali", S4= "Can"; 
	 */

	public static void main(String[] args) {
		
		String S1 = "Java";
		String S2 = "is easy";
		
		//1.Way:
		System.out.println(S1 +S2);//Javais easy
		System.out.println(S1 + " " +S2);//Java is easy
		
		//2.Way:
		System.out.println(S1.concat(S2));//Javais easy
		System.out.println(S1.concat("").concat(S2));//Java is easy
		
		String s3 = "Java";
		int i1 = 5;
		int i2 = 3;
		
		System.out.println(s3 + i1 + i2); //Java53
		
		System.out.println(i1 + i2+ s3); //8Java
		
		System.out.println(s3 + (i1 + i2)); //Java8
		
		
		
		
	

	}

}
