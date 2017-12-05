package CollectionExmples;

import java.util.ArrayList;

public class RemovingArrayList {
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		list.add("GG");
		System.out.println("Current ArrayList are" +list);
		for(String temp :list)
		{
			System.out.println(temp);
		}
		 boolean b=list.remove("EE");
	       System.out.println("Element EE removed: "+b);
	       
		list.remove("CC");
		list.remove(1);
		System.out.println(list);
		
	}

}
