package methodOverloadingTest;

public class Subtraction {

	public  void sub(int a, int b)
	{
		System.out.println(" subtraction of two numbers " + (a-b));
		
	}
	public  void sub(int a, int b, int c)
	{
		System.out.println(" subtraction of three numbers " + (a-b-c));
	}
	public static void main(String args[])
	{
		Subtraction s = new Subtraction();
		s.sub(9, 4);
		s.sub(15, 10, 5);
		
	}
}
