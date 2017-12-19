package multiThreading;

public class MyTable extends Thread {
	Tables t;

	public MyTable(Tables t) {
		super();
		this.t = t;
	}
	public void run()
	{
		t.printing(7);
	}
	public static void main(String[] args) {
	
	Tables t = new Tables();//only one object  
	MyTable t1=new MyTable(t);  
	MyTable1 t2 = new MyTable1(t);
	 t2.start();
	t1.start();  
	}
}
