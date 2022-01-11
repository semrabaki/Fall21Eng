package day16arraysforeachloop;

public class Arrays01Review {

	public static void main(String[] args) {
		
		int arr1[]= {5,12,32,11};
		int arr2[]= {5,12,32,11};
		//1.way: I typed my code to check if the arrays are some or not
		
		int counter=0;
		
		if(arr1.length==arr2.length)
		{
			for(int i=0; i<arr1.length; i++)
			{
				if(arr1[i]==arr2[2])
				{
					counter++;
					break;
				}
			}
			if(counter!=0)
			{
				System.out.println("Arrays are not the same");
			}
			else
			{
				System.out.println("Arrays are the same!!");
			}
		}
		else
		{
			System.out.println("Arrays are not teh same");
		}
		
		

	}

}
