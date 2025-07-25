package collection.map;

import java.util.LinkedHashMap;  
  
class LastAccessOrder {  
  

  
  public static void main(String[] args){  
	  LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);  
	    linkedHashMap.put(1, "Ant");  
	    linkedHashMap.put(2, "Buffalo");  
	    linkedHashMap.put(3, "Cat");  
	    linkedHashMap.put(4, "Dog");  
	    linkedHashMap.get(3);


	    for (String value : linkedHashMap.values()) {    
	        System.out.println(value);    
	      }    
	    
	    
	    //access A value out of turn  
	    String value = linkedHashMap.get(2);  
  }  
  
  
}  