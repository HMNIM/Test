package CollectionExmples;

import java.util.ArrayList;

public class AddIndexinArrayList {
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Haritha");
		list.add("is a");
		list.add("good");
		list.add("girl");
		System.out.println("Starting elements in ArrayList are" +list);
		// after adding index
		list.add(2 , "very");
		System.out.println("After adding index to existing elements" +list);
		list.add(0, "*****");
		System.out.println("" +list);
	}

}
