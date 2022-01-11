package day25interfaceencapsualtion;

public abstract class ElectiralVehicles implements AirCondition {

	@Override
	public void climateAC() {
		System.out.println("The electrical vehicle climate AC...");
		
	}

	@Override
	public void run() {
		System.out.println("Electrical vehicle is the best....");
		
	}


	
}
