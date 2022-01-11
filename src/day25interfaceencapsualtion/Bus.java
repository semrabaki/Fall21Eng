package day25interfaceencapsualtion;

public class Bus implements AirCondition{

	@Override
	public void electronicAc() {
		System.out.println("The Bus AC is semi-electrnic..");
		
	}

	@Override
	public void climateAC() {
		System.out.println("The Bus AC is not  climate AC..");
		
	}

	@Override
	public void bacteriaKiller() {
		System.out.println("The Bus AC kills %85 bacteria.....")
		
	}

	@Override
	public void run() {
		System.out.println("The bus AC works perfetcly...");
		
	}

}
