package multiThreading;

public class MyTable1 extends Thread{
	
	Tables t;
	
	public MyTable1(Tables t) {
	super();
	this.t = t;
}
	public void run()
	{
		t.printing(6);
	}
	

}
