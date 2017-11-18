package StaticInterfaceexample;

public class Square implements Calculate{

	@Override
	public void length() {
		System.out.println(" length of Square is 4 sides");
	}
	public static void main(String args[])
	{
		Calculate s = new Square();
		s.length();
		System.out.println("Calculating cube lenghth is "+ Calculate.cube(4));
		
	}

}
