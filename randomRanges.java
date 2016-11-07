//Brandon Isensee

public class randomRanges

{
	public static void main(String [] args)
	{
		int n = (int)(Math.random() * 25);
		int n2 = (int)(Math.random() * 50 + 50);
		int n3 = (int)(Math.random() * 200 - 100);
		double n4 = (int)(Math.random() * 1000);
		Math.round(n4);
		n4 /= 1000;
		int n5 = (int)(Math.random() * 26 + 65);
		int n6 = (int)(Math.random() * 10);
		n6 *= 1000;
		System.out.println(" Random Ranges");
		System.out.println(" ================");
		System.out.println(" 1. Range: 0 to 25 = " + n);
		System.out.println(" 2. Range: 50 to 100 = " + n2);
		System.out.println(" 3. Range: -100 to 100 = " + n3);
		System.out.println(" 4. Range: 0.1 to 1 = " + n4);
		System.out.println(" 5. Range: A to Z = " + (char)n5);
		System.out.println(" 6. Range: 1000 to 10000 = " + n6);
		System.out.println(" ");
	}
}