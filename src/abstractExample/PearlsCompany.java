package abstractExample;

public class PearlsCompany extends Beads{

	public PearlsCompany(String nameOfbeads) {
		super(nameOfbeads);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Rubies() {
	System.out.println(" i have Rubies ");
		
	}

	@Override
	public void Emaralds() {
		System.out.println("");
		
	}
	
	public static void main(String args[])
	
	
	{
		PearlsCompany p = new PearlsCompany("Rubies");
				p.Rubies();
	}
	
	

}
