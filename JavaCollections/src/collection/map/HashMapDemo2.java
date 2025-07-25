package collection.map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;



public class HashMapDemo2 
{

	public Map<Integer,String> buildHashTable()
	{ 
		Map<Integer,String> hashMap = new HashMap<>();
		String country = hashMap.put( 91 , "India" );
		hashMap.put( 1 , "US" );
		hashMap.put( 44 , "UK" );
		hashMap.put( 61 , "Australia" );
		hashMap.put( 64 , " New Zealand" );
		country = hashMap.put( 91 , "Bharath" );
		
		//hashMap.put( null , "Russia" );
		return hashMap; 
	}

	public void prinHashMap( Map<Integer,String> hashMap )
	{
		Set<Entry<Integer,String>> entries = hashMap.entrySet();
		for(Entry<Integer,String> entry:entries)
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
			
    }

	public static void main( String [] args )
	{
		HashMapDemo2 hashMapDemo = new HashMapDemo2( );
		Map<Integer,String> hashMap = hashMapDemo.buildHashTable();
		hashMapDemo.prinHashMap( hashMap );
	}

}