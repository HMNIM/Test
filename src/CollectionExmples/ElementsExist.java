package CollectionExmples;

import java.util.ArrayList;

public class ElementsExist {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("pen");
		list.add("pencil");
		list.add("Note book");
		list.add("Hari");
		System.out.println("ArrayList contains it or not "+list.contains("book"));
		System.out.println(" *************************** " +list.contains("pen"));
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(5);
		al.add(9);
		al.add(7);
		System.out.println("************************** " +al.contains(4));
		System.out.println(" ********** ********* *** " +al.contains(7));
	}

}
