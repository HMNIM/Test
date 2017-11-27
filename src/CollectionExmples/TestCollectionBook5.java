package CollectionExmples;
import java.util.ArrayList;
import java.util.List;
//test
public class TestCollectionBook5 {
	public static void main(String args[])
	{
		// creating  list of Books
		List<Book> list = new ArrayList<Book>();
		// creating books
		Book b1 = new Book("Java", "Eenadu", 100);
		Book b2 = new Book("C++" , "ABN", 50);
		Book b3 = new Book("JDBC", "TV9", 25);
		//adding books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		for(Book b:list)
		{
System.out.println(b.publisher +  " " +"published " + b.quantity + " books  of " + b.name);
		}
	}

}
