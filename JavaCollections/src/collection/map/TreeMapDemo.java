package collection.map;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap; 
class TreeMapDemo
{ 
		public static void main(String args[])
		
		{ 
			// Create A tree map 
			TreeMap<String,Double> treeMap = new TreeMap<>(); 
			// Put elements to the map 
			treeMap.put("John Doe", 3434.34); 
			treeMap.put("Tom Smith", 123.22); 
			treeMap.put("Jane Baker", 1378.00); 
			treeMap.put("Todd Hall", 99.22); 
			treeMap.put("Ralph Smith", -19.08); 
			// Get A set of the entries 
			Set<Entry<String,Double>> setOfEntries = treeMap.entrySet(); 
			// Get an iterator 
			Iterator<Entry<String,Double>> iterator = setOfEntries.iterator(); 
			// Display elements 
			while(iterator.hasNext()) 
			{ 
				Entry<String,Double> entry = iterator.next();
				System.out.print(entry.getKey() + ": "); 
				System.out.println(entry.getValue()); 
			} 
			System.out.println(); 
			// Deposit 1000 into John Doe's account 
			double balance = treeMap.get("John Doe"); 
			treeMap.put("John Doe", balance + 1000); 
			System.out.println("John Doe's new balance: " + treeMap.get("John Doe")); 
		} 
}