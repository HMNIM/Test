package multiThreading;

public class TestJoinExample extends Thread{
	
	public void run()
	{
		for(int i = 1; i<6 ; i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("" + i);
		}
	}

	public static void main(String[] args) {
		
		TestJoinExample t1 = new TestJoinExample();
		TestJoinExample t2 = new TestJoinExample();
		TestJoinExample t3 = new TestJoinExample();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		
	}

}
