package day21accessmodifiersstringbuilder;

public class Varargs01 {

	public static void main(String[] args) {
		
		System.out.println("The sum: "+ add());//0
		System.out.println("The sum: "+ add(7));//7
		System.out.println("The sum: "+ add(7,9));//16
		System.out.println("The sum: "+ add(7,9,10,11,12,13,14,15));//91
		
		System.out.println(join('a','l','i', 'y','e'));//ALIYE
		

	}
	//In a method, you can not use multiple varargs
	//In a method, after the varargs you cannot use any other parameter
	//so varargs must be the last parameter
	//Before the varargs you can put many parameters. no limittation
	public static int add(int ...a)
	{
		int sum=0;
		for(int w:a)
		{
			sum=sum+w;
		}
		return sum;
	}
	
	public static String join(char...c)
	{
		String name="";
		
		for(char w:c)
		{
			name=name+w;
			name=name.toUpperCase();
		}
		return name;
	}
}