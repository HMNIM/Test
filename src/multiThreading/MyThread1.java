package multiThreading;

public class MyThread1 extends Thread{
	Table t;

	public MyThread1(Table t) {
		super();
		this.t = t;
	}
	public void run()
	{
		t.print(7);
	}
	
	

}
