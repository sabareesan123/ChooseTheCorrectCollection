package collection.comparable_example;



public class Fruit implements Comparable<Fruit>{
 
	private String fruitName;
	private String fruitDesc;
	private int quantity;
	//private double price;
 
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
 
	








public int compareTo(Fruit compareFruit) {
 
		int compareQuantity =  compareFruit.getQuantity(); 
 
		//ascending order
		return this.quantity - compareQuantity;
   // 12  20
		//descending order
		//return compareQuantity - this.quantity;
 
	}	

public String toString()
{
	return "Fruit name " +fruitName + " quantity " + quantity;
}

}
