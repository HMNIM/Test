package CollectionExmples;

import java.util.ArrayList;

public class CopyingArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("text1");
		al.add("text2");
		al.add("text3");
		al.add("text4");
		System.out.println("Current list is" +al);
		ArrayList<String> list = new ArrayList<String>();
		list.add("text5");
		list.add("text6");
		list.add("text7");
		al.addAll(list);
		System.out.println("Total elements" +al);
		}

}
