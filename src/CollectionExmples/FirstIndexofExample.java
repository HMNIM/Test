package CollectionExmples;

import java.util.ArrayList;

public class FirstIndexofExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		list.add("FF");
		System.out.println("First element " +list.indexOf("CC"));
		System.out.println("Second element " +list.indexOf("FF"));
		System.out.println("Third Element " +list.indexOf("AA"));
	}

}
