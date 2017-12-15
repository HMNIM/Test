package multiThreading;

public class Simple2 extends Thread{
	
	public void run()
	{
		System.out.println(" running second thread");
	}

	public static void main(String[] args) {

		Simple2 s = new Simple2();
		s.start();
		Simple1 s1 = new Simple1();
		s1.start();
	}

}
