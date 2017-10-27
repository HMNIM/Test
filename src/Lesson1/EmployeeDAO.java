package Lesson1;

public class EmployeeDAO {
	
	// this class is using for saving db
	
	public void saveEmp(Employee emp)
	{
		System.out.println("Savng EMployee to database ..."+ emp);
	}
	
	public void deleteEmp(Employee emp)
	{
		System.out.println("Deleting EMployee to database ..."+ emp);
	}

}
