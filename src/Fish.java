
public class Fish extends Animal{
	
	//Implicit super constructor Animal() is undefined for default constructor. Must define an explicit constructor
	public Fish(String gender, int weightInPounds, int height, String eyeColor) {
		
		super(gender, weightInPounds, height, eyeColor);
		 
	}

	public void Swim()
	{
		System.out.println("I can Swim");
	}
}
