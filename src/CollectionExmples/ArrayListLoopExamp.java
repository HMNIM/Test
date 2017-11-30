package CollectionExmples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLoopExamp {
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(30);
		al.add(40);
		//For loop
		System.out.println("For Loop");
		for(int i =0 ; i<al.size(); i++ )
		{
			System.out.println(al.get(i));
		}
		//Advance for loop
		System.out.println("Advance For Loop");
		for(int i : al)
		{
			System.out.println(i);
		}
		//While Loop
		System.out.println(" While Loop");
		int i =0;
		while(al.size() >i)
		{
			System.out.println(al.get(i));
			i++;
		}
		//Iterator loop
		System.out.println(" Iterator loop");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
