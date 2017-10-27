
public class Zoo {

	public static void main(String[] args) {
		
		
		
	/*	Animal A1 = new Animal();
		Animal A2 = new Animal();
		A1.features();
		A2.features();*/
		
		Animal A1 = new Animal("Male", 20, 100, "Blue");
		Animal A2 = new Animal("Female", 15, 50, "Green");
	
		/*A1.eat();
		A1.sleep();
		A1.eyeColor = "white";
		A1.gender = "Female";
		A1.height = 4 ;
		A1.WeightInPounds = 300 ;*/
	/*	A1.features();
		A2.features();*/
		
		Bird B = new Bird("Male", 4, 1, "White");
		B.eat();
		B.sleep();
		B.Fly();
		Fish F = new Fish("Female", 3, 1, "Brown");
		F.Swim();
		F.eat();
		F.sleep();
	}

}
