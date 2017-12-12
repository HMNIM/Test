package multiThreading;

public class Multi extends Thread {

	public void run()
	{
		System.out.println(" Thread is running by extending class");
	}
	public static void main(String[] args) {
		Multi m = new Multi();
		m.start();

	}

}
