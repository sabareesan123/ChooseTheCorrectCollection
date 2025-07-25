package collection.list.array_list;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest {
	public static void main(String... args){
		CopyOnWriteArrayList<String> ob= new CopyOnWriteArrayList<>();
		
		ob.add("Parent");
		ob.add("Child");
		ob.add("C");
		ob.add("D");
		ob.add("E");
		
		ob.addIfAbsent("Parent");
		
		ob.remove("Child");
		ListIterator itr= ob.listIterator();
		ob.remove("D");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		itr=ob.listIterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}