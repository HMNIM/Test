package multiThreading;
//
public class TestJoinMethodEXamp extends Thread{
	
	public void run()
	{
		for(int i = 1; i<4 ;i++)
		{
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(+i);
		}
	}
	public static void main(String[] args) {
		TestJoinMethodEXamp t1 = new TestJoinMethodEXamp();
		TestJoinMethodEXamp t2 = new TestJoinMethodEXamp();
		TestJoinMethodEXamp t3 = new TestJoinMethodEXamp();
		t1.start();
		try {
			t1.join(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		
		
	}

}
