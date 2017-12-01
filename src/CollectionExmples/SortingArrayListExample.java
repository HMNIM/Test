package CollectionExmples;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("India");
		list.add("China");
		list.add("America");
		list.add("Denmark");
		System.out.println("List of countries with out sorting ");
		for(String i:list)
		{
			System.out.println(i);
		}
		Collections.sort(list);
		System.out.println("after sorting ");
		for(String i:list)
		{
			System.out.println(i);
		}
	}

}
