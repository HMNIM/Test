package multiThreading;

public class Tables {
	
	synchronized void printing(int n)
	{
	for(int i = 0; i<5; i++)
	{
		System.out.println(n*i);
	}
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
