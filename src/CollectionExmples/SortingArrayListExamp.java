package CollectionExmples;
import java.util.ArrayList;
import java.util.Collections;


public class SortingArrayListExamp {

	public static void main(String[] args) {
		ArrayList<StudentSorting> list1 = new ArrayList<StudentSorting>();
		list1.add(new StudentSorting("Haritha", 27, 7));
		list1.add(new StudentSorting("Venny", 26, 007));
		list1.add(new StudentSorting("Makkena", 28, 777));
		
		Collections.sort(list1);
		for(StudentSorting str : list1)
		{
			System.out.println(str);
		}

	}

}
