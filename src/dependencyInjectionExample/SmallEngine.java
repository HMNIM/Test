package dependencyInjectionExample;

public class SmallEngine implements Engine{
	
	int horsePower;
	
	public SmallEngine(int horsePower) {
		super();
		this.horsePower = horsePower;
	}

	@Override
	public void StartEngine() {

		System.out.println(" Small Engine starts with Horse Power of" + horsePower);
		
	}

}
