package CollectionExmples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIntializationExamples {
	
	public static void main(String args[])
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Starting added list is" +list);
		// for loop
		System.out.println("For Loop is");
		for(int i =0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		//advance for loop
		System.out.println("Advance For loop ");
		for(int i : list)
		{
			System.out.println(i);
		}
		// while loop
		System.out.println(" While Loop is");
		int i = 0;
		while(list.size() > i)
		{
			System.out.println(list.get(i));
			i++;
		}
		// iterator loop
		System.out.println("Iterator loop is");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
