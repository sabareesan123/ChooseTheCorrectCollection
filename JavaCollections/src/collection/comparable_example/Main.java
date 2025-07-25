package collection.comparable_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//import collection.comparator_example.FruitNameComparator;

public class Main {

	public static void main(String[] args) 
	{
		

				Fruit [] fruits=new Fruit[5];
				
				Fruit fruitOrange = new Fruit("Orange","From Kerala",20); 
				Fruit fruitbanana = new Fruit("Banana","From Rajasthan",7); 
				Fruit fruitApple=new Fruit("Apple","From AP",10); 
				Fruit fruitPine=new Fruit("Pineapple","From TN",13);
				Fruit fruitCucumber=new Fruit("Cucumber","From KA",5);

				fruits[ 0 ] = fruitOrange;
				fruits[ 1 ] = fruitbanana;		
				fruits[ 2 ] = fruitApple;
				fruits[ 3 ] = fruitPine;
				fruits[ 4 ] = fruitCucumber;
				// 4   89   0  34  23
				
				
//					ArrayList<Fruit> list=new ArrayList<Fruit>();
//					list.add(fruitOrange);
//					
//					list.add(fruitbanana);
//					list.add(fruitApple);
//					list.add(fruitPine);
//					list.add(fruitCucumber);
//					
//					Collections.sort(list);
				
				Arrays.sort(fruits);
				for(Fruit fruit:fruits)
				{
			
					System.out.println(fruit.getFruitName()+ " quantity " +fruit.getQuantity());
			
				}

				

	
	}

}
