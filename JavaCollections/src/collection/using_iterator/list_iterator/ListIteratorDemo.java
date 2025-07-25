package collection.using_iterator.list_iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
 
public class ListIteratorDemo 
{
    public static void main(String[] args)
    {
        List<String> grades = new LinkedList<>();
        grades.add("Parent");
        grades.add("Child");
        grades.add("C");
        grades.add("D");
        grades.add("E");
 
        //
        // Retrieves object from LinkedList using the ListIterator
        // interface.
        //
        ListIterator<String> listIterator = grades.listIterator();
        listIterator.add("F");
        System.out.println("iteration 1");
        String grade;
        while (listIterator.hasNext()) 
        {
        	
            
           // if(grade.equals("C"))
            listIterator.add("GrandChild");
            grades.remove(2);
            System.out.println("    hasPrevious  : " + listIterator.hasPrevious());
            System.out.println("    hasNext      : " + listIterator.hasNext());
            System.out.println("    previousIndex: " + listIterator.previousIndex());
            System.out.println("    nextIndex    : " + listIterator.nextIndex());
            grade=listIterator.next();
            System.out.println("Grades: " + grade);
        }
        
        System.out.println("iteration 2");
        
        ListIterator<String> li2=grades.listIterator();
        while (li2.hasNext()) 
        {
            System.out.println("Grades: " + li2.next());
            System.out.println("    hasPrevious  : " + li2.hasPrevious());
            System.out.println("    hasNext      : " + li2.hasNext());
            System.out.println("    previousIndex: " + li2.previousIndex());
            System.out.println("    nextIndex    : " + li2.nextIndex());
        }
        
    }
}