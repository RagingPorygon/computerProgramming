//Brandon Isensee

import java.util.Scanner;

public class Rectangle

{
	public static void main(String []arg)
	{
		Scanner length = new Scanner(System.in);
		Scanner width = new Scanner(System.in);
		System.out.print("Enter the length --> ");
		int num = length.nextInt();
		System.out.print("Enter the width --> ");
		int num2 = width.nextInt();
		System.out.println("");
		int perimeter = (2 * num2) + (2 * num);
		int area = num * num2;
		System.out.println("Perimeter = " +perimeter);
		System.out.println("Area = " + area);
	}
}

