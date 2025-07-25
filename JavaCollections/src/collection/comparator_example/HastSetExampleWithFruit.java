package collection.comparator_example;

import java.util.HashSet;
import java.util.Set;

public class HastSetExampleWithFruit {

	public static void main(String[] args) {
		Set<Fruit> set=new HashSet<>();
		Fruit fruits0=new Fruit("Orange","From Kerala",20); 
		Fruit fruits1=new Fruit("Avacado","From Rajasthan",7); 
		Fruit fruits2=new Fruit("Apple","From AP",10); 
		Fruit fruits3=new Fruit("Pineapple","From TN",13);
		Fruit fruits4=new Fruit("Cucumber","From KA",5);
		set.add(fruits0);
		set.add(fruits1);
		set.add(fruits2);
		set.add(fruits3);
		set.add(fruits4);
		System.out.println(set);
		

	}

}
