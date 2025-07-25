package collection.comparable_example;

public class Money implements Comparable<Money>{
	
	
	private int cents;
	
	Money(int dollars,int cents)
	{
		this.cents=dollars*100+cents;
	}

	@Override
	public int compareTo(Money other) {
		if( this.cents == other.cents ) {
		      return 0;
		    }// 10000  < 5050
		    else if( this.cents < other.cents ) {
		      return -1;
		    }
		    else {
		      return 1;
		    }

	}
	
	
	
	

}
