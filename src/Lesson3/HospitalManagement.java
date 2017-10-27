package Lesson3;

public class HospitalManagement {
	
		// to perfom duties 
	public void callForDuties(Employee emp)
	{
		if(emp instanceof Nurse)
		{
			basicTest();
			bloodTest();
		}
		else if(emp instanceof Doctor)
		{
			diaogniseDis();
			prescribeMed();
		}
	
			
	}
	

	// Nurses
	private void basicTest()
	{
		System.out.println("Nurse will do Basic test");
	}
	private void bloodTest()
	{
		System.out.println(" Nurses do blood test");
	}
	// Dcotor
	
	private void diaogniseDis()
	{
		System.out.println("Doctors will diagnoise diseases");
	}
	private void prescribeMed()
	{
		System.out.println(" Doctors Prescribes medicine");
	}
	
}
