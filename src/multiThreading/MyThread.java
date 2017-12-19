package multiThreading;

public class MyThread extends Thread{
	Table t;
	public MyThread(Table t) {
		this.t= t;}
	
	public void run()
	{
		t.print(5);
	}
	
		public static void main(String args[])
		{  
		Table t = new Table();//only one object  
		MyThread t1=new MyThread(t);  
		MyThread1 t2 = new MyThread1(t);
		 t2.start();
		t1.start();  
		}
}
