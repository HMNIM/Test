package abstractExample;

public abstract class EMployee {
	
	String name;
	double salary;
	String address;
	
	 public EMployee(String name, String address, int number) {
	      System.out.println("Constructing an Employee");
	      this.name = name;
	      this.address = address;
	      
	   }
	 
	 public void name() {
		 System.out.println(" name is " + name);
	}
	  
	 
	   
	}