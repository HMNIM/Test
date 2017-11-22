package CollectionExmples;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection3 {

	public static void main(String[] args) {
		
		StudentCollection s1 = new StudentCollection("Daashvik",1, 4);
		StudentCollection s2 = new StudentCollection("hari",7, 5);
		StudentCollection s3 = new StudentCollection("siri",3, 6);
	
		ArrayList<StudentCollection> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Iterator itr =  list.iterator();
		while(itr.hasNext())
		{
			StudentCollection s = (StudentCollection)itr.next();
		System.out.println(s.name + " " + s.age + " 5" + s.rollnum);	
		}
		
	}

}
