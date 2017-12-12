package multiThreading;

public class Multi3 implements Runnable {
	Thread t;
	public void run()
	{ 
		System.out.println("Thread is running by implementing interface");
		
	}
	public static void main(String[] args) {
		
		Multi3 m = new Multi3();
		Thread t = new Thread(m);
		t.start();
	}

}
