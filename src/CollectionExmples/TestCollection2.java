package CollectionExmples;

import java.util.ArrayList;

public class TestCollection2 {
	public static void  main(String args[])
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hari");
		al.add("Venny");
		
		for(String obj:al)
		{
			System.out.println(obj);
		}
	}
}
