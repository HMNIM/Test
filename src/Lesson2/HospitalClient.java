package Lesson2;
import Lesson2.HospitalEmployee;
import Lesson2.HospitalDAO;

public class HospitalClient {
	
	public static void main(String args[])
	{
		HospitalEmployee Emp =  new HospitalEmployee(07, "VENNY", "CARDIOLOFY", true);
		HospitalClient.hireEmployee(Emp); 
		HospitalClient.department(Emp);
	}
	
	public static void hireEmployee(HospitalEmployee HS)
	{
		// calling DAO  to save employee
		HospitalDAO HD = new HospitalDAO();
		HD.addEmployee(HS);
	}
	public static void terminateEmployee(HospitalEmployee HS)
	{
		HospitalDAO HD = new HospitalDAO();
		HD.deleteEmployee(HS);
	}
	public static void department(HospitalEmployee HS)
	{
		HospitalDAO HD = new HospitalDAO();
		HD.departmentEmployee(HS);
	}

}
