//Brandon Isensee

import java.util.Scanner;

public class CompareNine

{
	public static void main(String [] arg)
	{
		Scanner num = new Scanner(System.in);
		System.out.print(" Enter Number 1 --> ");
		int num2 = num.nextInt();
		System.out.print(" Enter Number 2 --> ");
		int num3 = num.nextInt();
		System.out.println(" ");
		if (num2 < num3)
			System.out.println(" " + num2 + " is less than " + num3);
		else if (num2 > num3)
			System.out.println(" " + num2 + " is greater than " + num3);
		else
			System.out.println(" " + num2 + " is equal to " + num3);
	}
}