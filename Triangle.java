//Brandon Isensee

import java.util.Scanner;

public class Triangle

{
	public static void main(String [] arg)
	{
		Scanner hi = new Scanner(System.in);
		System.out.print(" Enter Side 1 --> ");
		int num1 = hi.nextInt();
		System.out.print(" Enter Side 2 --> ");
		int num2 = hi.nextInt();
		System.out.print(" Enter Side 3 --> ");
	    int num3 = hi.nextInt();
		System.out.println(" ");
		
		if (num1 == num2 && num2 == num3)
			System.out.println("This triangle is an equilateral");
		else if (num1 == num2 || num1 == num3 || num2 == num1 || num3 == num2 || num3 == num1 || num1 == num3)
			System.out.println("This triangle is an isosceles");
		else if (num1 != num2 && num2 != num3 && num1 != num3)
			System.out.println("This triangle is a scalene");
	}
}