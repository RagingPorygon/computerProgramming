//Brandon Isensee

import java.util.Scanner;

public class PythagoreanTheorem

{
	public static void main(String [] args)
	{
		Scanner sideone = new Scanner(System.in);
		Scanner sidetwo = new Scanner(System.in);
		System.out.print("Enter side 1 --> ");
		int num = sideone.nextInt();
		System.out.print("Enter side 2--> ");
		int num2 = sidetwo.nextInt();
		num = (int)Math.pow(num,2);
		num2 = (int)Math.pow(num2,2);
		double num3 = num + num2;
		num3 = Math.sqrt(num3);
		int num4 = (int)Math.round(num3);
		System.out.println("");
		System.out.println("The hypotenuse of the triangle = " + num4);
		System.out.println("");
	}
}
