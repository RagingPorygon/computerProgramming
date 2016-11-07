//Brandon Isensee

import java.util.Scanner;

public class MinMax

{
	public static void main(String [] arg)
	{
		Scanner finteger = new Scanner(System.in);
		Scanner sinteger = new Scanner(System.in);
		Scanner tinteger = new Scanner(System.in);
		System.out.print("Enter 1st Integer --> ");
		int num = finteger.nextInt();
		System.out.print("Enter 2nd Integer --> ");
		int num2 = sinteger.nextInt();
		System.out.print("Enter 3rd Integer --> ");
		int num3 = tinteger.nextInt();
		int num4 = Math.max(num, num2);
		int num5 = Math.max(num2, num3);
		int num6 = Math.min(num, num2);
		int num7 = Math.min(num2, num3);
		System.out.println("");
		System.out.println("Smallest = " + Math.min(num6, num7));
		System.out.println("Largest = " + Math.max(num4, num5));
		System.out.println("");
	}
}