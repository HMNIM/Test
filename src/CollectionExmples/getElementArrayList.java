package CollectionExmples;

import java.util.ArrayList;

public class getElementArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("pen");
		list.add("Book");
		list.add("pencil");
		list.add("ink");
		list.add("paper");
		System.out.println("First element is " +list.get(3));
		System.out.println("Second element is " +  list.get(1));
		System.out.println("Thirs element is " + list.get(0));
	}

}
