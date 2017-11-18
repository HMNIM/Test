package AbstractionExample22;

public class TestInterfaceExm2 {
	
	public static void main(String args[])
	{
		Banks b = new HDFCBank();
		Banks c = new SBIBank();
		System.out.println("theInterest rate of HDFC bank is " +b.getInterest());
		System.out.println("theInterest rate of SBI bank is " +c.getInterest());
	}

}
