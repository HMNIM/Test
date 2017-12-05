package CollectionExmples;

import java.util.ArrayList;
import java.util.List;
public class SubList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Haritha");
		list.add("Venky");
		list.add("Makkena");
		list.add("Charan");
		list.add("Nimmaturi");
		System.out.println("Total elements" +list);
		ArrayList<String> list1 = new ArrayList<String>(list.subList(1, 4));
		System.out.println("Sublist of elements" +list1);
		List<String> list2 = list.subList(1, 3);
		System.out.println(list2);
	}

}
