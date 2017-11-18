package interfaceExample2;

public class TestInterfaceExample2 {
	
	public static void main(String args[])
	{
		Bank b = new AndhraBank();
		System.out.println("Interest rate of AndhraBank is " +b.interestRate());
		Bank c = new ICICIBANK();
		System.out.println("Interest rate of ICICI bank is " +c.interestRate());
	}

}
