public class FarmAnimalsTest
{
	public static void main(String[] args)
	{
		// Instantiate FarmAnimal object using default constructor
		FarmAnimals animals1 = new FarmAnimals();
		System.out.println(animals1);    // the println method calls the object's toString method
		System.out.println();
		
		// Instantiate FarmAnimal object using the second constructor
		FarmAnimals animals2 = new FarmAnimals("Jim", 10, 2, 5, 12);
		System.out.println(animals2);    // the println method calls the object's toString method
		System.out.println();
	}
}