package collection.list.copy_on_write;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest
{
	public static void main(String... args)
	{
		List<String> list = new CopyOnWriteArrayList<>();
		
		list.add("Parent");
		list.add("Child");
		list.add("C");
		list.add("D");
		list.add("E");
		
		
		
		list.remove("Child");
		
		ListIterator<String> listIterator = list.listIterator();
		list.remove("D");
		System.out.println("old");
		
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		listIterator = list.listIterator();
		System.out.println("new");
		
		while( listIterator.hasNext() ) 
		{
			System.out.println(listIterator.next());
		}
	}

}