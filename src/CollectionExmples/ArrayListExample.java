package CollectionExmples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {
	public static void main(String args[])
	{
		ArrayList<String> obj1 = new ArrayList<String>(
				Arrays.asList("one","two","three","four"));
		System.out.println("Numbers are" +obj1);
		
		ArrayList<Integer> a1 = new ArrayList<Integer>(
				Arrays.asList(1,2,3,4,5));
		System.out.println("Numbers" +a1);
		
	ArrayList<Integer> intList = new ArrayList<Integer>(Collections.nCopies(10, 5));
	System.out.println(" Collections are" +intList) ;			
		ArrayList<String> obj = new ArrayList<String>();
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
		obj.set(2, "Z");
		System.out.println("Removing elements" +obj);
	}

}
