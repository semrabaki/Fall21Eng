package day17foreachloopmultidimentionalarray;

public class MultidimentionalArrays02 {

	public static void main(String[] args) {
	//Print the elements which have a from a 2 dimensional String array
		
		String arr1[][]= {{"learn", "java", "it"},{"is", "easy"}};
		
		for(String[] w: arr1)
		{
			for(String x:w)
			{
				if(x.contains("a"))
				{
					System.out.println(x+ " ");
				}
				
			}
		}
		//Convert a 2 dimentional array to 1 dimensional array
		
		int arr2[][]= {{1,2},{3,4,5},{6,7,9,10}};
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		
			
		
		
		
		
		
				
	}

}
