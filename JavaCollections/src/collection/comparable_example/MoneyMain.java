package collection.comparable_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MoneyMain {

	public static void main(String[] args) {
		Money money1=new Money(100,0);
		Money money2=new Money(50,50);

		List<Money> list=new ArrayList<Money>();
		list.add(money1);
		list.add(money2);
		
		Collections.sort(list);
		System.out.println(list);
		

	}

}
