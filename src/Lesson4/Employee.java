package Lesson4;

abstract public class  Employee {
	
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
	public abstract void performDuties();



}
