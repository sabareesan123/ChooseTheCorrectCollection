package collection.set;

import java.util.Set;
import java.util.TreeSet;

import section2.oops.singly_rooted_hierarchy.finalize.example1.Fruit;



public class FruitsTreeSetExample {

	public static void main(String[] args) {
		Fruit []fruits=new Fruit[5];
		
		fruits[0] = new Fruit("Orange","From Kerala",20); 
		fruits[1] = new Fruit("Avacado","From Rajasthan",7); 
		fruits[2] = new Fruit("Apple","From AP",10); 
		fruits[3] = new Fruit("Pineapple","From TN",13);
		fruits[4] = new Fruit("Cucumber","From KA",5);
		FruitNameComparator fruitNameComparator = new FruitNameComparator();
		Set<Fruit> set = new TreeSet<>(fruitNameComparator);
		 
		set.add(fruits[0]);
		set.add(fruits[1]);
		set.add(fruits[2]);
		set.add(fruits[3]);
		set.add(fruits[4]);
		
		for(Fruit fruit:set)
		{
			System.out.println(fruit);
		}

	}

}
