package collection.legacy;

public class DictionaryDemo {
	Dictionary  cities = new Hashtable();
	
	cities.put("New York", "USA");
	
	cities.put("Toronto", "Canada");
	
	cities.put("Manchester", "UK");
	
	cities.put("Berlin", "Germany");
	
	for (Enumeration city = cities.keys(); city.hasMoreElements();) {
	
	String key = (String)city.nextElement();
	
	System.out.println("Key: "+key +" Value: " + cities.get(key)); }
}

