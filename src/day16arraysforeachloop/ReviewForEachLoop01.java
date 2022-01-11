package day16arraysforeachloop;

public class ReviewForEachLoop01 {

	public static void main(String[] args) {
		//Get the total number of characters in the elements
		
       String s[]= {"Ali Can", "Veli Han", "Mary Star"};
		
		//Do it by using for - loop
		int sum=0;
		
		for(int i=0; i<s.length; i++)
		{
			sum=sum+s[i].length();
		}
		
		System.out.println(sum);
		
		int sum1=0;
		for(String w:s)
		{
			sum1=sum1+ w.length();
		}
		
		System.out.println("Sum from for each loop: " + sum1);
		
		//Print all elements in the given array if the elements has more than 6 characters
		
		String t[]= {"Miami", "United States", "Jacksonville", "Samsun"};
		
		for(String x:t)
		{
			if(x.length()>=6)
			{
				System.out.println(x+ " ");
			}
		}
		
		//print the comman elements for 2 arrays
		
				int arr1[]= {11, 21, 33};
				int arr2[]= {33, 34, 11};
				
				for(int z:arr1)
				{
					for(int p:arr2)
					{
						if(z==p)
						{System.out.print(z+ " ");
					}
				}
				}
	}
}
	

