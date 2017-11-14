package dependencyInjectionExample;

public class SmallEngine implements Engine, Tires{
	
	int horsePower;
	String size;
	
	

	public SmallEngine(int horsePower) {
		super();
		this.horsePower = horsePower;
		
	}
	

	public SmallEngine(String size) {
		super();
		this.size = size;
	}


	@Override
	public void StartEngine() {

		System.out.println(" Small Engine starts with Horse Power of" + horsePower);
		
	}

	@Override
	public void TireSize() {
		System.out.println(" my car has small Tires");
		
	}

}
