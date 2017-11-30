package CollectionExmples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLoopListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//For loop iterating list
		System.out.println(" For loop is ");
		for(int i = 0; i < list.size() ;i++)
		{
		System.out.println(list.get(i));	
		//System.out.println(+i);
		}
		// advance for loop
		System.out.println(" Advance For loop");
		for(int i : list)
		{
			System.out.println(+i);
		}
		// While loop
		System.out.println(" while loop");
		int count =0;
		while(list.size() > count)
		{
			System.out.println(list.get(count));
			count++;
		}
		System.out.println("Iterator loop");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
