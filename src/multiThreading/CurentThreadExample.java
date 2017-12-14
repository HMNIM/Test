package multiThreading;

public class CurentThreadExample extends Thread{

	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		CurentThreadExample c = new CurentThreadExample();
		CurentThreadExample c1 = new CurentThreadExample();
		c.setName("Haritha");
		c1.setName("Makkena");
		c.start();
		c1.start();
	}

}
