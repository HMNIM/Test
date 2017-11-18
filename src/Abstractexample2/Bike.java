package Abstractexample2;

public abstract class Bike {
	
	// abstract class can have constructor,data member, abstract method, method body
   String Company;
	
	// constructor
	public  Bike()
	{
		System.out.println("Bike created");
	}
	// method body
	public void gearChanged()
	{
		System.out.println(" Bike gear changed");
	}
	// abstract method
	public abstract void run();
	
	
}
