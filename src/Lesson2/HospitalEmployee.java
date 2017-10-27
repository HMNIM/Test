package Lesson2;

public class HospitalEmployee {
	
	private int id ;
	private String name;
	private String department;
	private boolean working;
	
	public HospitalEmployee(int id, String name, String department, boolean working) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.working = working;
	}

	@Override
	public String toString() {
		return "HospitalEmployees [id=" + id + ", name=" + name + ", department=" + department + ", working=" + working
				+ "]";
	}

	
	
}
