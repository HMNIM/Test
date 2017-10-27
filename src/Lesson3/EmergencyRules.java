package Lesson3;

public class EmergencyRules {
	
	public static void main(String args[])
	{
		HospitalManagement ER = new HospitalManagement();
		Employee Jesscia = new Nurse(007, "Jess", "Nursing", true);
		ER.callForDuties(Jesscia);
		Employee Venny = new Nurse(007, "Venny", "Dcotorrr", true);
		ER.callForDuties(Venny);
	}

}
