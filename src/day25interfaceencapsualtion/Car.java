package day25interfaceencapsualtion;

public class Car implements AirCondition, HybridEngine {

	@Override
	public void electronicAc() {
		System.out.println("The Car AC is electrnic..");
		
	}

	@Override
	public void climateAC() {
		System.out.println("The Car AC is climate..");
		
	}

	@Override
	public void bacteriaKiller() {
		System.out.println("The Car AC kills %99.9 bacteria.....");
		
	}

	@Override
	public void havingHybridEngine() {
		System.out.println("The Car engine is hybrid.....");
		
	}

	@Override
	public void run() {
		System.out.println("the can AC runs perfectly");
		
	}

}
