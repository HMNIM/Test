package CollectionExmples;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection1 {
	
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("Haritha");
		list.add("venky");
		list.add("prasanna");
		list.add("Anusha");
	
	//using iterator interface.. we can use  for loop
	Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}
}
