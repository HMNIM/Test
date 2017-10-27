//INheritance
public class Bird extends Animal{
	
	

	//Implicit super constructor Animal() is undefined for default constructor. Must define an explicit constructor
	
	public Bird(String gender, int weightInPounds, int height, String eyeColor) {
		super(gender, weightInPounds, height, eyeColor);
		
	}

	
	
	public void Fly()
	{
		System.out.println("I can Fly");
	}

}
