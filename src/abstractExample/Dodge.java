package abstractExample;

public class Dodge extends FourWheeler {
	
	public static void main(String args[])
	{
		FourWheeler d = new Dodge();
		d.run();
	}
 //we have to add umimplemented methods as in abstract class
	public void run() {
		
		System.out.println("Car is running or moving fast");
	}

}
