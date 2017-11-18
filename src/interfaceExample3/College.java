package interfaceExample3;

public interface College {
	
	public void departments();
	// we can have method body in interface. But we need to make it default method
	default void msg()
	{
		System.out.println(" calling default method");
	}

}
