package Lesson5;

import org.omg.CosNaming.NamingContextPackage.NotEmpty;

public abstract class AppleCompany {
	
	private String processName;
	
	public AppleCompany(String processName) {
		super();
		this.processName = processName;
	}
	
	// if we convert from public to protect ..here cleint doeenot need to kknow all methods
//	they just need know how to process the device phone or laptop
	protected abstract void assembleDevice();
	protected abstract void testDevice();
	protected abstract void saleDevice();
	
	public void launchProcess()
	{// template design pattern 
		if(processName != null)
		{
		assembleDevice();
		testDevice();
		saleDevice();
		}
		else
		{
			System.out.println(" no process of company");
		}
	}

}
