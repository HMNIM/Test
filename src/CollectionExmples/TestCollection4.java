package CollectionExmples;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection4 {
	
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("E");
		list2.add("F");
		list2.add("G");
		
		list.addAll(list2);// adding two lists in to single 
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
