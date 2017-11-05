package dependencyInjectionExample;

public class LargeEngine implements Engine{
	int horsepower;

	public LargeEngine(int horsepower) {
		super();
		this.horsepower = horsepower;
	}

	@Override
	public void StartEngine() {
		System.out.println("Large Engine starts with the horsepower of" +horsepower);
		
	}
	
	
	
	

}
