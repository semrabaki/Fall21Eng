package day12variabletypesmethodoverloadingconstructors;

public class VariableTypes01Runner {

	public static void main(String[] args) {
		
		VariableTypes01 obj1 = new VariableTypes01(); //in here you are creating an object from the VariableTypes01 class
		System.out.println(obj1.name);//AliCan
		
		obj1.name = "Veli Han";
		System.out.println(obj1.name);//VeliHan
		
		
		System.out.println(obj1.id);//null Note: "id" has " yellow underline" because  you created an object to access static variable
		                            // no need to do it, because class name is enough to access
		obj1.id= "New id";
		System.out.println(obj1.id);//New i
		
		
		VariableTypes01 obj2 = new VariableTypes01();
		System.out.println(obj2.name);//Ali Can
		System.out.println(obj2.id); //New id

	}

}
