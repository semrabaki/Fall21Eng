package day13statickeyword;

public class CarsRunnerReview {

	public static void main(String[] args) {
		
		System.out.println(CarsReview.numOfCars);
		
		CarsReview c1= new CarsReview();
		System.out.println(c1.make);
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.vin);
		System.out.println(c1.year);
		
		c1.drive();
		
		System.out.println(CarsReview.engine());
		
		
		CarsReview c2= new CarsReview("Honda", "Civic", 20000, 2021);
		String vinC2=CarsReview.createVin(c2);
		System.out.println(vinC2);
		
		CarsReview c3 = new CarsReview("Audi", "R8", 57000, 2021);
		
		System.out.println(CarsReview.createVin(c3));
		
		
		
		
		
		
		
		
		
		

	}

}
