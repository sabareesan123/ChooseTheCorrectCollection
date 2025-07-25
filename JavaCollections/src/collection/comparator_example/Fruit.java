package collection.comparator_example;



public class Fruit implements Comparable<Fruit>{
 
	private String fruitName;
	private String fruitDesc;
	private int quantity;
 
	public Fruit(String fruitName, String fruitDesc, int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}
 
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitDesc() {
		return fruitDesc;
	}
	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
 
	








@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fruitName == null) ? 0 : fruitName.hashCode());
		result = prime * result + quantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (fruitName == null) {
			if (other.fruitName != null)
				return false;
		} else if (!fruitName.equals(other.fruitName))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

public int compareTo(Fruit compareFruit) {
 
		int compareQuantity = ((Fruit) compareFruit).getQuantity(); 
 
		//ascending order
		return this.quantity - compareQuantity;
 
		//descending order
		//return compareQuantity - this.quantity;
 
	}	

public String toString()
{
	return "Fruit name " +fruitName + " quantity " + quantity;
}

}
