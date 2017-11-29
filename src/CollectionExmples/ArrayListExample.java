package CollectionExmples;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String args[])
	{
		ArrayList<String> obj = new ArrayList<>();
		obj.add("C");
		obj.add("D");
		obj.add("E");
		System.out.println(" current array list " + obj);
		// adding elements to Index
		obj.add(0, "A");
		obj.add(1, "B");
		System.out.println(" AFter adding elemnts" + obj);
		// Removing elements from Index
		obj.remove("C");
		obj.remove(3);
		System.out.println("Removing elements" +obj);
	}

}
