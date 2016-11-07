//Brandon Isensee

public class TacoBueno
{
	public static void main(String [] arg)
	{
		final double TAXRATE= 0.0875;
		double taco  = .99, burrito = 1.29, muchaco = 1.99, cinnamonChips = .99, largeDrink = 1.89, tax = 0, subTotal = 0, grandTotal = 0;
		System.out.printf("%-18s%3.2f%n", "taco", taco);
		System.out.printf("%-18s%3s%n", "burrito", burrito);
		System.out.printf("%-18s%3s%n", "muchaco", muchaco);
		System.out.printf("%-18s%3.2f%n", "cinnamon chips", cinnamonChips);
		System.out.printf("%-18s%3s%n", "large drink", largeDrink);
		System.out.println("--------------------------");
		System.out.printf("%-18s%4.2f%n", "subtotal", subTotal = taco + burrito + muchaco + cinnamonChips + largeDrink);
		System.out.printf("%-18s%3.2f%n", "tax", tax = (TAXRATE * subTotal));
		System.out.println("--------------------------");
		System.out.printf("%-18s%4.2f%n", "grandtotal", grandTotal = tax + subTotal);
		System.out.println();
	}
}

//trunkate first zero on taco, cinnamon, and tax