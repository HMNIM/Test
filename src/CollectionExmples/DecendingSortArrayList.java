package CollectionExmples;

import java.util.ArrayList;
import java.util.Collections;

import javax.sound.midi.SysexMessage;

public class DecendingSortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list  = new ArrayList<>();
		list.add(8);
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(20);
		System.out.println("without sorting list");
		for(int i =0; i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		//
		System.out.println("Sorting in Ascending order");
		Collections.sort(list);
		for(int i :list)
		{
			System.out.println(i);
		}
		System.out.println("Sorting in Descending  order");
		//Collections.sort(list);
	//	Collections.reverse(list);
		Collections.sort(list, Collections.reverseOrder());
		for(int i : list)
		{
			System.out.println(i);
		}
	
	}

}
