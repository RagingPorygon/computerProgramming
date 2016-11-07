//Brandon Isensee

import java.util.Scanner;

public class Money

{
	public static void main(String [] arg)
	{
		Scanner pennies = new Scanner(System.in);
		Scanner nickels = new Scanner(System.in);
		Scanner dimes = new Scanner(System.in);
		Scanner quarters = new Scanner(System.in);
		System.out.print("How many pennies do you have --> ");
		int num = pennies.nextInt();
		System.out.print("How many nickels do you have --> ");
		int num2 = nickels.nextInt();
		System.out.print("How many dimes do you have --> ");
		int num3 = dimes.nextInt();
		System.out.print("How many quarters do you have --> ");
		int num4 = quarters.nextInt();
		System.out.println("");
		double num5 = (num * .01) + (num2 * .05) + (num3 * .10) + (num4 * .25);
		double num6 = num5 - (int) num5;
		num6 *= 100;
		System.out.println("Total Value = " + (int) num5 + " dollars and " + (int) num6 + " cents");
		System.out.println("");
		System.out.println("");
	}
}