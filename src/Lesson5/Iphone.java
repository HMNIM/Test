package Lesson5;

public  class Iphone extends AppleCompany{

	public Iphone(String processName) {
		super(processName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void assembleDevice() {
		
		System.out.println(" phone is Assmebling");
	}

	@Override
	public void testDevice() {
		
		System.out.println(" phone is in testing stage");
	}

	@Override
	public void saleDevice() {
	
		System.out.println(" phone is for sale");
	}
	


}
