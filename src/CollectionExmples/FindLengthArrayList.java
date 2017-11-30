package CollectionExmples;
import java.util.ArrayList;
public class FindLengthArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Starting or Initial size " +list.size());
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println("Adding list to size " +list.size());
		list.remove(2);
		list.remove(3);
		System.out.println(" removing some list " +list.size());
		System.out.println(" Final list " +list.size());
		for(int i : list)
		{
			System.out.println(i);
		}
		
	}

}
