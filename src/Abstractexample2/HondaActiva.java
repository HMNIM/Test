package Abstractexample2;

public class HondaActiva extends Bike{

	public void run() {
		System.out.println(" Activa running nicley");
	}
	
	public static void main(String args[])
	{
		Bike b = new HondaActiva();
		b.gearChanged();
		b.run();
		
	
	}


}
