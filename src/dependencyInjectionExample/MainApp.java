package dependencyInjectionExample;

public class MainApp {
	
	public static void main(String args[])
	{
		Vehicle v = new Vehicle(new LargeEngine(600), new LargeEngine("BIGG"));
		Vehicle v1 = new Vehicle(new SmallEngine(200), new SmallEngine("small"));
		v.running();
		v1.running();
	}
}
