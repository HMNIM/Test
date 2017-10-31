package abstractExample;

public class AbstractDemo {
	
	public static void main(String args[])
	{
		 Salary s = new Salary("Mohd Mohtashim", "Lincoln, NE", 3600.00);
	      EMployee e = new Salary("John Adams", "Boston, MA", 2400.00);
	      System.out.println("Call mailCheck using Salary reference --");
	  
	      System.out.println("\n Call mailCheck using Employee reference--");
	      e.name();
	}

}
