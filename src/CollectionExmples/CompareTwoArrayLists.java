package CollectionExmples;

import java.util.ArrayList;

public class CompareTwoArrayLists {
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("hi");
		list.add("How are you");
		list.add("bye");
		list.add("good night");
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("hi");
		list1.add("How are you doing");
		list1.add("bye");
		list1.add("good night all");
		ArrayList<String> list2 = new ArrayList<String>();
		for(String temp: list)
		{
			list2.add(list1.contains(temp) ? "Yes" : "No");
			System.out.println(list2);
		}
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		for(String temp1 : list)
		{
			list3.add(list1.contains(temp1) ?  1 : 0);
			System.out.println(list3);
		}
	}

}
