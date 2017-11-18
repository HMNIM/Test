package InheritanceInterface;

public class TestInterfaceExm4 implements Showable{


	public void print() {
		System.out.println(" printing");
		
	}

	public void show() {
		System.out.println("Showing");
		
	}
	public static void main(String args[])
	{
		TestInterfaceExm4  t = new TestInterfaceExm4();
		t.print();
		t.show();
	}

}
