//Brandon Isensee

import java.util.Scanner;

public class RichterScale

{
	public static void main(String [] arg)
	{
		Scanner richter = new Scanner(System.in);
		System.out.print(" Enter a magnitiude on the Richter scale ==>> ");
		double num = richter.nextDouble();
		System.out.println(" ");
		System.out.print(" Damage = ");
		if (num <= 3.5)
			System.out.println("Generally not felt by people");
		else if (num <= 4.5)
			System.out.println("Felt by many people, no destruction");
	    else if (num <= 6.0)
			System.out.println("Damage to poorly constructed buildings");
		else if (num <= 7.0)
			System.out.println("Many buildings considerably damaged; some collapse");
		else if (num <= 8.0)
			System.out.println("Most buildings destroyed");
		else if (num <= 10.0)
			System.out.println("Most structures fall");
		System.out.println(" ");
		System.out.println(" ");
	}
}