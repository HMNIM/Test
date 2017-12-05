package CollectionExmples;

import java.util.ArrayList;

public class AddingIndexArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("test 1");
		list.add("test 2");
		list.add("test 3");
		System.out.println("Elements are "+list);
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("test 7");
		list1.add("test 8");
		System.out.println("Elements in second list are" +list1);
		list.addAll(2, list1);
		System.out.println("After adding full list " +list);
	}

}
