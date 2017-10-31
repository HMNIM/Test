package inerfaceExample;

public class Bird implements Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(" Bird eats worms");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(" Bird sleeps at night");
	}

	
	public static void main(String args[])

	{
		 Bird b = new Bird();
		 b.sleep();
		 b.eat();
	}
	

}
