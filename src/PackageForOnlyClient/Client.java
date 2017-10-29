package PackageForOnlyClient;

import Lesson5.AppleCompany;
import Lesson5.Iphone;
import Lesson5.Laptop;

public class Client {
	
	public static void main(String args[])
	{
	
	AppleCompany device = new Iphone("SmartPhone");
	// Client just need to know whther it is phone or laptop
	device.launchProcess();
	
	AppleCompany device2 = new Laptop("MacBook PRO");
	device2.launchProcess();
	
	
	}

}
