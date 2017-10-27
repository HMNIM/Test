package Lesson3;


//EMployee of the hospital
public class Employee {

	private int id;
	private String name;
	private String department;
	private boolean workingEmp;
	
	public Employee(int id, String name, String department, boolean workingEmp) {
		
		this.id = id;
		this.name = name;
		this.department = department;
		this.workingEmp = workingEmp;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", workingEmp=" + workingEmp
				+ "]";
	}

	
	
}
