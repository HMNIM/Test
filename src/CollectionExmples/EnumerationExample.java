package CollectionExmples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class EnumerationExample {
	public static void main(String args[])
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("C");
		list.add("C++");
		list.add("JAVA");
		list.add("ORACLE");
		Enumeration<String> e = Collections.enumeration(list);
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
