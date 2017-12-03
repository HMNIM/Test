import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArrays {
	
	
	public static void main(String args[])
 {
	    /*
	     * Integer class implements Comparable
	     * Interface so we can use the sort method
	     */
	    int[] arr = {11,55,22,0,89};
	    Arrays.sort(arr);
	    System.out.print("Sorted Int Array: ");
	    System.out.println(Arrays.toString(arr));
	        
	    /*
	     * String class implements Comparable
	     * Interface so we can use the sort method
	     */
	    System.out.print("Sorted String Array: ");
	    String[] names = {"Steve", "Ajeet", "Kyle"};
	    Arrays.sort(names);
	    System.out.println(Arrays.toString(names));
	        
	     /*
	      * String class implements Comparable
	      * Interface so we can use the sort method
	      */
	     System.out.print("Sorted List: ");
	     ArrayList<String> fruits3 = new ArrayList();
	     fruits3.add("Orange");
	     fruits3.add("Banana");
	     fruits3.add("Apple");
	     fruits3.add("Guava");
	     fruits3.add("Grapes");
	     Collections.sort(fruits3);
	     for(String s: fruits3)
	    	 {
	    	 System.out.print(s+", ");
	    	 }
	    	 }
	  
	
}