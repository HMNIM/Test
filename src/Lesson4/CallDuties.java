package Lesson4;


public class CallDuties {

	
	public static void main(String args[])
	{
		HospitalManage ER = new HospitalManage();
		Employee Jesscia = new Nurse(007, "Jess", "Nursing", true);
		ER.callForDuties(Jesscia);
		Employee Venny = new Nurse(007, "Venny", "Dcotorrr", true);
		ER.callForDuties(Venny);
	}
}
