package Lesson4;

public class Doctor extends Employee{
	
	public Doctor(int id, String name, String department, boolean workingEmp) {
		super(id, name, department, workingEmp);
	
	}
	@Override
	public void performDuties() {
		diaogniseDis();
		prescribeMed();
		operations();
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
			
			private void operations()
			{
				System.out.println(" Doctors will perform Operations");
			}

		


}
