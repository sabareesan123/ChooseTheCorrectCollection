package collection.using_iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
 
public class CollectionIteratorDemo {
    public static void main(String[] args) {
        List<String> gradesList = new LinkedList<>();
        
	        gradesList.add("Parent");
	        gradesList.add("Child");
	        gradesList.add("C");
	        gradesList.add("D");
	        gradesList.add("E");
	 
        //
        // Retrieve objects in LinkedList using Iterator.
        //
        HashSet<String>   set = new HashSet<>();
        set.add("Parent");
        set.add("Child");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");
        
        iterateTheCollection(gradesList);
        
        iterateTheCollection(set);
    }
    
    
    static void iterateTheCollection(Collection<String> collection)
    {
    	
    	Iterator<String> iterator = collection.iterator();
        String grade;
        
        while (iterator.hasNext()) 
        {
        	grade = iterator.next();
        	
            System.out.println("Grade: " + grade);
        	if(grade.equals("C"))
        		iterator.remove();
            
        }
    }
}