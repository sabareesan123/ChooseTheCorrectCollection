package collection.random_number_generator;

public class RandomNumberGenerator {

	public static int returnRandomInt(int min,int max)
	{
		//return 5 + (int)(Math.random() * ((10 - 5) + 1));
		return min + (int)(Math.random() * ((max - min) + 1));
	}
	public static void main(String[] args) {
		

	}

}
