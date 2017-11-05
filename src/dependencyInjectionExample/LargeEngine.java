package dependencyInjectionExample;

public class LargeEngine implements Engine, Tires{
	int horsepower;
	String size;



	public LargeEngine(int horsepower) {
		super();
		this.horsepower = horsepower;
		
	}

	public LargeEngine(String size) {
		super();
		this.size = size;
	}

	@Override
	public void StartEngine() {
		System.out.println("Large Engine starts with the horsepower of" +horsepower);
		
	}

	@Override
	public void TireSize() {
		System.out.println(" My car has Large Tires");
		
	}
	
	
	
	

}
