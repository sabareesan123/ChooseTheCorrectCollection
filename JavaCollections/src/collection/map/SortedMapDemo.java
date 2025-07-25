package collection.map;

import java.util.*;
 
public class SortedMapDemo {
    public static void main(String[] args) {
        //
        // Copies all of the mappings from 'countryCapitals' to this
        // 'sorted'
        //
        SortedMap<String, String> sortedMap = new TreeMap<>();
        sortedMap.put("United States", "New York");
        sortedMap.put("United Kingdom", "London");
        sortedMap.put("Netherlands", "Amsterdam");
        sortedMap.put("Japan", "Tokyo");
        sortedMap.put("France", "Paris");
 
        System.out.println("the map is :\n" + sortedMap);
        //
        // Gets the first(lowest) key currently in this map
        //
        String firstKey = sortedMap.firstKey();
 
        //
        // Gets the last (highest) key currently in this map
        //
        String lastKey = sortedMap.lastKey();
 
        System.out.println("First key: " + firstKey);
        System.out.println("Last key : " + lastKey);
 
        //
        // Gets A view of the portion of this map whose keys range
        // from fromKey(Japan), inclusive, to toKey(United Kingdom),
        // exclusive. (If fromKey and toKey are equal, the returned
        // map is empty.)
        //
        SortedMap<String, String> sub = sortedMap.subMap("Japan","United Kingdom");
        Set<String> subKeys = sub.keySet();
        System.out.println("\nSub Map: ");
        System.out.println("============");
        
        for (String key : subKeys) 
        {
            System.out.println(key);
        }
 
        //
        // Gets A view of the portion of this map whose keys are
        // strictly less than toKey(in this example is Netherlands)
        //
       
        SortedMap<String, String> head = sortedMap.headMap("Netherlands");
        Set<String> headKeys = head.keySet();
        System.out.println("\nHead Map:");
        System.out.println("============");
        for (String key : headKeys) {
            System.out.println(key);
        }
 
        //
        // Gets A view of the portion of this map whose keys are
        // strictly greater than or equal fromKey(in this example
        // is Netherlands)
        //
      
        SortedMap<String, String> tail = sortedMap.tailMap("Netherlands");
        Set<String> tailKeys = tail.keySet();
        System.out.println("\nTail Map:");
        System.out.println("============");
        for (String key : tailKeys) {
            System.out.println(key);
        }
    }
}