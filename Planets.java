//Brandon Isensee

import java.util.Scanner;

public class Planets

{
	public static void main(String [] arg)
	{
		Scanner thing = new Scanner(System.in);
		System.out.println("     Menu");
		System.out.println("    ======");
		System.out.println(" 1. Mercury");
		System.out.println(" 2. Venus");
		System.out.println(" 3. Earth");
		System.out.println(" 4. Mars");
		System.out.println(" 5. Jupiter");
		System.out.println(" 6. Saturn");
		System.out.println(" 7. Uranus");
		System.out.println(" 8. Neptune");
		System.out.println(" 9. Pluto");
		System.out.println("");
		System.out.println("");
		System.out.print(" Select Planet : ");
		int planet = thing.nextInt();
		System.out.println("");
		System.out.println("");
		System.out.print(" Enter your weight--> ");
		int weight = thing.nextInt();
		System.out.println("");
		System.out.println("");
		double secondweight;
		
		switch(planet)
		{
			case 1:
				secondweight = 0.38 * weight;
				int finalw = (int)Math.round(secondweight);
				System.out.println(" Your weight on Mercury is " + finalw + " pounds.");
				break;
			case 2:
				secondweight = 0.78 * weight;
				int finalw2 = (int)Math.round(secondweight);
				System.out.println(" Your weight on Venus is " + finalw2 + " pounds.");
				break;
			case 3:
				secondweight = 1 * weight;
				int finalw3 = (int)Math.round(secondweight);
				System.out.println(" Your weight on Earth is " + finalw3 + "pounds.");
				break;
			case 4:
				secondweight = 0.39 * weight;
				int finalw4 = (int)Math.round(secondweight);
				System.out.println(" Your weight on Mars is " + finalw4 + " pounds.");
				break;
			case 5:
				secondweight = 2.65 * weight;
				int finalw5 = (int)Math.round(secondweight);
				System.out.println(" Your weight on Jupiter is " + finalw5 + " pounds.");
				break;
			case 6:
				secondweight = 1.17 * weight;
				int finalw6 = (int)Math.round(secondweight);
				System.out.println(" Your weight on Saturn is " + finalw6 + " pounds.");
				break;
			case 7:
				secondweight = 1.05 * weight;
				int finalw7 = (int)Math.round(secondweight);
				System.out.println(" Your weight on Uranus is " + finalw7 + " pounds.");
				break;
			case 8:
				secondweight = 1.23 * weight;
				int finalw8 = (int)Math.round(secondweight);
				System.out.println(" Your weight on Neptune is " + finalw8 + " pounds.");
				break;
			case 9:
				secondweight = 0.05 * weight;
				int finalw9 = (int)Math.round(secondweight);
				System.out.println(" Your weight on Pluto is " + finalw9 + " pounds.");
				break;
			default:
				System.out.println("You are in a different solar system, I believe.");
		}
			System.out.println("");	
	}
}