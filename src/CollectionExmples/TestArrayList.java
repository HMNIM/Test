package CollectionExmples;

import java.util.ArrayList;

public class TestArrayList {
	
	public static void main(String args[])
	{
		ArrayList<Car> list = new ArrayList<Car>();
		//creating list of cars
		Car c1 = new Car("Honda", 2014, 79);
		Car c2 = new Car("Dodge", 2017, 50);
		Car c3 = new Car("Bmw", 2018, 110);
		// add cars to list
		list.add(c1);
		list.add(c2);
		list.add(c3);
		for(Car c:list)
		{
System.out.println(c.carName  + " made "+ c.quantity + " cars in " + c.yearofMaking);
			
		}
	}

}
