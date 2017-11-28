package CollectionExmples;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String args[])
	{
		LinkedList<String> list = new LinkedList<>();
		list.add("Test");
		list.add("Linked");
		list.add("Listt");
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(String obj:list)
		{
			System.out.println(obj);
		}
	}

}
