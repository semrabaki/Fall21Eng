package day19arraylists;

public class ArrayPair {

	public static void main(String[] args) {
		
		/*
		 * from a given array find all pairs whose sum is a given number
		 * {4,6,5,-10,8,5,10}===> 10
		 */
		
		
		findPairs (new int [] {4,2,5,-10,6,5,10,8,20}, 10);
		
	

	}
	
	public static void findPairs (int arr[], int num)
	{
		for (int i=0; i<arr.length; i++)	
		{
			
			for( int j=i+1; j<arr.length; j++)
			{
				if (arr[i]+arr[j]==10)
				{
					System.out.println("Array elements: "+ arr[i]+ " " + arr[j]);
				}
			}
			
		}
	}

}
