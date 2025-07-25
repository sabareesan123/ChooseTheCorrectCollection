package collection.comparator_example;

import java.util.Arrays;



public class Main {

	
	public static void main(String[] args)
	{
		Fruit []fruits=new Fruit[5];
		
		fruits[0]=new Fruit("Orange","From Kerala",20); 
		fruits[1]=new Fruit("Avacado","From Rajasthan",7); 
		fruits[2]=new Fruit("Apple","From AP",10); 
		fruits[3]=new Fruit("Pineapple","From TN",13);
		fruits[4]=new Fruit("Cucumber","From KA",5);


//		Arrays.sort(fruits);
//
//
//		for(Fruit fruit:fruits)
//		{
//	
//			System.out.println(fruit.getFruitName()+ " quantity" +fruit.getQuantity());
//	
//		}

		Arrays.sort(fruits, new FruitNameComparator());
	
		for(Fruit fruit:fruits)
		{
	
			System.out.println(fruit.getFruitName());
	
		}
	}

}
