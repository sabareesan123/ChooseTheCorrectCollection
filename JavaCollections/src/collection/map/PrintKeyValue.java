package collection.map;



import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;



public class PrintKeyValue 
{


	public static void main( String [] args )
	{
		
		// HashMap LinkedHashMap TreeMap Hashtable
				//ConcurrentHashMap
				Map<String,String> hashMap = new TreeMap<>();
				hashMap.put( "delhi", "India" );
				hashMap.put( "delhi", "us" );
				hashMap.put( "washington", "US" );
				/*hashMap.put( 44 , "UK" );
				hashMap.put( 61 , "Australia" );
				hashMap.put( 64 , " New Zealand" );*/
				//hashMap.put(null, "france");
				hashMap.put("adelaide", "australia");
				hashMap.put("parris", "france");
				
				//hashMap.put( null , "Russia" );
				Set<Entry<String,String>> entries = hashMap.entrySet();
				for(Entry<String,String> entry:entries)
				{
					System.out.println(entry.getKey() + " " + entry.getValue());
				}
		
	}

}