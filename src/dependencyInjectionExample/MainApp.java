package dependencyInjectionExample;

public class MainApp {
	
	public static void main(String args[])
	{
		Vehicle v = new Vehicle(new LargeEngine(600));
		Vehicle v1 = new Vehicle(new SmallEngine(200));
		v.running();
		v1.running();
	}
}
