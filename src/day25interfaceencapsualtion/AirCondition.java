package day25interfaceencapsualtion;

/*
 * 1)Interface is not a class, interface is interface
 * 2)WE need interface to be able to create " multiple interface parents" for a class
 * 3) All methods must be "abstract" in interface. because of that "interfaces are used for "full abstraction".
 * Note: We can use "abstract" and "concrete" method together in "abstract classes" because of that using " abstract class is called.
 * 4)Do not use "abstract" keyword when you create interface.Because Java knows 
 * interfaces are abstract.
 * 5)All methods are " abstract" as default in an interface, bacause of that using 
 * "abstract" keyword is optional in interfaces.
 * I mean " public abstract void electronicAC(); and " public void electronicAC(); are completely same for Java
 
 *6) All methods are "public" as default in an interface. Because of that using access modifier is optional for methods in an
 *interface. "public void climateAc();" and "void climateAc();" are completely same.
 *7)If you make an "interface" parent of a class, do not use extends use implements
 *8) In different parent interfaces you can use methods with the same name
 *But be careful about return types. If the method names are same you cannot use different return types.
 *9)All variables in an interface are "public", "static(class variable", "final" as default
 *
 *Note: you can not create object by using " interfaces" because interfaces are "fully abstract" and they do not have "constructors"
 *Note 2:"abstract classes" have constructors but the constructors are not used to create objects.
 * WE cannot create objects from abstract classes. 
 * 10)Java knows all variables an  interface are public static final as a default because of that  declaring 
 * public static final for variables is optional.
 * 11)In different parent interfaces, you can create variables with the same name, it will not be problem because everythime
 * when you call a variable you have to use interface name
 * 12)For abstract classes it is not must to override the methods from interfaces, it is optional, if you want to can
 
 *13)Concrete class must overridde all abstract methods from all parents, otherwise you will get Compile Time Error. 
 *Note: If any abstract method is overridden by any parent class, it will not be must to override it
 *by concrete child class. 
 *
 *14)Concrete Class==>Interface: Implements
 *   Abstract Class ==> Interface :Implements
 *   Interface==>Interface: extends
 *    *** interface==>concrete class:This is not allowed in Java, class cannot be parent of an interface
 *   ***interface==abstract:extends:This is not allowed in Java, class cannot be parent of an interface
 *   Concrete==>Concrete:extends
 *   Abstract==>ConcreteClass:extends
 *   Concrete==>Abstract:extends
 *   abstract==>abstract:extends
 */

public interface AirCondition extends Vehicle{
	
	String MAKE="Samsung";
	
	public abstract void electronicAc();
	
	public void climateAC();
	
    void run();
	
	void bacteriaKiller();
	

}
