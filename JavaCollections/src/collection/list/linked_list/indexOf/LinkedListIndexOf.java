package collection.list.linked_list.indexOf;

import java.util.ArrayList;
import java.util.List;

public class LinkedListIndexOf {
    public static void main(String[] args) {
    	// 16 elements
        List<String> names = new ArrayList<>(1000);
        names.add("Alice");
        names.add("Bob");
        names.add("Carol");
        names.add("Mallory"); 
 
        List<Student> students=new ArrayList<>();
        Student student1 = new Student("1","ram","9999");
        Student student2 = new Student("2","david","124");
        Student student3 = new Student("3","ragu","43212");
        Student student4 = new Student("4","peter","0900");
        
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        for(Student student:students)
        {
        	System.out.println("name is "+ student.getName());
        	
        }
        //
        // Search for Carol using the indexOf method. This method
        // returns the index of the object when found. If not found
        // -1 will be returned.
        //
        int index = names.indexOf("Carol");
       
        System.out.println("Index = " + index);
 
        	int studentIndex = students.indexOf(student2);
        	System.out.println("student 2  index"  + studentIndex);
        //
        // We can check to see if the index returned is in the range
        // of the LinkedList element size.
        //
        if (index > 0 && index < names.size()) {
            String name = names.get(index);
            System.out.println("Name  = " + name);
        }
    }
}