package CollectionExmples;

import java.util.ArrayList;

public class LastIndexofExample {
	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(7);
		list.add(1);
		list.add(5);
		list.add(19);
		list.add(7);
		list.add(19);
		list.add(3);
		list.add(10);
		System.out.println("last index of the element " +list.lastIndexOf(7));
		System.out.println("last index of the element " +list.lastIndexOf(2));
		System.out.println("last index of the element " +list.lastIndexOf(19));
		System.out.println("last index of the element " +list.lastIndexOf(10));
	}

}
