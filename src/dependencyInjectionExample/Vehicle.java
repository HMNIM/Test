package dependencyInjectionExample;

public class Vehicle{

	Engine myEngine;
	// fpr dependency Injecttion we need to creATE 	CONSTRUCTOR
	 
	public Vehicle(Engine anEngine) {

		myEngine = anEngine;
	}
	 
	public void running()
	{
		myEngine.StartEngine();
		System.out.println("Vehicle is running");
	}
	

}
