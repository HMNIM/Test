package abstractExample;

public class Salary extends EMployee{

	 private double salary;   // Annual salary
	   
	   public Salary(String name, String address, double salary) {
	      super(name, address, 0);
	      setSalary(salary);
	   }
	   
	 
	   public double getSalary() {
	      return salary;
	   }
	   
	   public void setSalary(double newSalary) {
	      if(newSalary >= 0.0) {
	         salary = newSalary;
	      }
	   }
	   
	   
	

}
