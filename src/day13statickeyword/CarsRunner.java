package day13statickeyword;

public class CarsRunner {

	public static void main(String[] args) {
		
		//Inside the Cars class, we have 6 variables
		// but by using class name you can access just
		//static variable
		
		System.out.println(Cars.numOfCars);
		Cars c1= new Cars();
		

		
		//To access instance variables you have to 
		//create object
		System.out.println(c1.make);
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.vin);
		System.out.println(c1.year);
		
		//static variables can be accessed by using 
		//objects as well but it is not recommended
		//because static varibale is not related 
		// with the object.Therefore, you are getting 
		//yellow underline
//		System.out.println(c1.numOfCars);
//		
//		//engine() method is static method because of/
//		 //that we can access to it by using just class
//		 //name
		System.out.println(Cars.engine());
//		
//		//drive() methos is non-static method because of
//		//that to access drive () method, I used c1 object
		c1.drive();
		
		//static methods can be accessed by using 
		//objcts as well but it is not recommended
		//because static methods are not related
		//with the objects.Therefore, you are getting
		//yellow underline
		
		System.out.println(c1.engine());
	
		Cars c2= new Cars("Honda", "Civic", 0, 0);
		String vinC2= Cars.createVin(c2);
		System.out.println(vinC2);
		
		Cars c3= new Cars("Audi", "R8", 57000, 2021);
		String vinC3= Cars.createVin(c3);
		System.out.println(vinC3);
	
		
		
		
	}

}
