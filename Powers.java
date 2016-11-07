//Brandon Isensee

import java.util.Scanner;

public class Powers

{
	public static void main(String [] arg)
	{
		Scanner integer = new Scanner(System.in);
		System.out.print("Please enter an integer--> ");
		int num = integer.nextInt();
		int num2 = num * num;
		System.out.println("The Square = " + num2); //Copy this line with the others
		int num3 = num * num * num;
		System.out.println("The Cube = " + num3);
		int num4 = num * num * num * num;
		System.out.println("The Fourth Power = " + num4);
	}
}

