package collection.map;

import java.util.HashMap;

public class PrintingTheMapExample
{
     public static void main(String args[])
     {
         HashMap<Integer,String> map = new HashMap<>();
         map.put(1,"Robert");
         map.put(2,"Sameer");
         map.put(3,"Ajay");
        // map.put("second", 2);
        // map.put("third","3rd");
         // Overwrites the previous assignment
         //map.put("third","III");
         // Returns set view of keys
        // Set set1 = map.keySet();
        // Returns Collecti)on view of values
        //Collection collection = map.values();
        // Returns set view of key value mappings
        //Set set2 = map.entrySet();
      // System.out.println(set1 + "\data" + collection + "\data" + set2);
        //System.out.println(map);
        //System.out.println(set2);
        System.out.println(map);
     }
}