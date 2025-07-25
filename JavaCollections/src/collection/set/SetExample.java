package collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample 
{
	 public static void main(String[] args) 
	 {
		 Set<String> set = new HashSet<>();

		 set.add("Carrot");
		 set.add("carrot");
		 set.add("Beetroot");
		 set.add("Cauliflower");
		 set.add("Potato");
		 set.add("Beetroot");
		 // duplicate, not added
		 //insertion order will not be preserved
		 System.out.println(set);
		 
	 }
}