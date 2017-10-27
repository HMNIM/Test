package Lesson4;

public class Nurse extends Employee{

	public Nurse(int id, String name, String department, boolean workingEmp) {
		super(id, name, department, workingEmp);
	
	}
	
	// Nurses
			private void basicVitalTest()
			{
				System.out.println("Nurse will do Vital tesst");
			}
			private void bloodTest()
			{
				System.out.println(" Nurses do blood test");
			}
			private void cleaningPatientArea()
			{
				System.out.println(" Nurses eill clean Patients");
			}

			@Override
			public void performDuties() {
				 basicVitalTest();
				 bloodTest();
				 cleaningPatientArea();
				
			}

}
