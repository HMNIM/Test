package dependencyInjectionExample;

public class Vehicle{

	Engine myEngine;
	Tires myTires;
	// fpr dependency Injecttion we need to creATE 	CONSTRUCTOR
	 
	public Vehicle(Engine anEngine, Tires etires) {

		myEngine = anEngine;
		myTires = etires;
	}
	 
	public void running()
	{
		myEngine.StartEngine();
		myTires.TireSize();
		System.out.println("Vehicle is running");
	}
	

}
