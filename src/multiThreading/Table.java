package multiThreading;

public class Table{
	
	public void print(int n)
	{
		for(int i = 0 ; i<5;i++)
		{
		System.out.println(n * i);
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
