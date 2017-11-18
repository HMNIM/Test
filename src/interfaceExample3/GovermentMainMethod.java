package interfaceExample3;

public class GovermentMainMethod implements School, College{

	@Override
	public void departments() {
		System.out.println("5 departments in college");
		
	}

	@Override
	public int strength() {
		// TODO Auto-generated method stub
		return 777;
	}

	public static void main(String args[])
	{
		GovermentMainMethod g = new GovermentMainMethod();
		g.departments();
		System.out.println("School students Strength is " + g.strength());
	}
}
