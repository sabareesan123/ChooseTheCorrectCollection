package collection.set;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set; 
class LinkedHashSetDemo
{ 
	public static void main(String args[])
	{ 
		// create A hash set 
		Set<String> hs = new LinkedHashSet<>(); 
		// add elements to the hash set 
		hs.add("Child"); 
		hs.add("Parent"); 
		hs.add("D"); 
		hs.add("E"); 
		hs.add("C"); 
		hs.add("F"); 
		
		//insertion order will be preserved
		System.out.println(hs); 
	} 
}