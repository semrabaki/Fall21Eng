package day13statickeyword;


public class CarsReview {

	public String make;
	public String model;
	public int price;
	public int year;
	
	public static int numOfCars=0;
	public String vin;
	
	public CarsReview()
	{
		
	}
	
	public CarsReview(String make, String model, int price, int year)
	{
		this.make=make;
		this.model= model;
		this.price= price;
		this.year=year;
		numOfCars++;
		
	}
	public void drive()
	{
		System.out.println("I am driving a car...");
	}
	
	public static String engine()
	{
		return "Engine exists...";
		//System.out.println("Engine exists");
		
	}
	
	public static String createVin(CarsReview c)
	{
		String vin= c.make.substring(0,3)+c.model.charAt(0)+c.year+ numOfCars;
	    return vin;
		
	}

}
