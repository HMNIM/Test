import Lesson1.Employee;
import Lesson1.EmployeeDAO;

public class ClientModule {
	
	public static void main(String args[])
	{
		Employee E = new Employee(07, "VENNY", "CARDIOLOFY", true);
		ClientModule.hireNewEmp(E);	
	}
	
	
	public static void hireNewEmp(Employee emp)
	{
		EmployeeDAO empDAO = new EmployeeDAO();
		empDAO.saveEmp(emp);
	
	}
	
	public static void terminateEmp(Employee emp)
	{
		EmployeeDAO empDAO = new EmployeeDAO();
		empDAO.deleteEmp(emp);
	
	}

}
