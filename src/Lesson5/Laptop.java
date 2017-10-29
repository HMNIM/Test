package Lesson5;

public class Laptop extends AppleCompany{

	public Laptop(String processName) {
		super(processName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void assembleDevice() {
		System.out.println(" Laptop is assembling now");
		
	}

	@Override
	public void testDevice() {
		System.out.println(" Laptop is in testing stage");
		
	}

	@Override
	public void saleDevice() {
		System.out.println(" Laptop is for sale");
		
	}
	
	

}
