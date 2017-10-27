
public class Animal {
	
	String gender;
	int WeightInPounds;
	int height;
	String eyeColor;
	
	
	public void features()
	{
		System.out.println("I am " + gender);
		System.out.println("I weigh " + WeightInPounds + " POunds");
		System.out.println("I am " + height  + " inches  tall ");
		System.out.println("My eyes are " + eyeColor + " in  color ");
	}
	
/*	
	public Animal()
	{
		eyeColor = "white";
		gender = "Female";
		height = 4 ;
		WeightInPounds = 300 ;
	}*/

		public void eat()
	{
		System.out.println("Eating");
	}
	
	public Animal(String gender, int weightInPounds, int height, String eyeColor) {

	this.gender = gender;
	this.WeightInPounds = weightInPounds;
	this.height = height;
	this.eyeColor = eyeColor;
}

	public void sleep()
	{
		System.out.println("Sleeping");
	}
	

}
