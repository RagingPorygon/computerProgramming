//Brandon Isensee

import java.util.Scanner;

public class Reverse

{
	public static void main(String [] arg)
	{
		System.out.println(" Enter 20 integers.");
		System.out.println();
		int num [] = new int[20];
		
		Scanner thing = new Scanner(System.in);
		
		for(int i = 0; i < 20; i++)
		{
			System.out.print(" Num " + i + " --> ");
			num[i] = thing.nextInt();
		}
		System.out.println();
		System.out.println();
			
		for(int i = 0; i < 20; i++)
		{
			System.out.print(" " + num[i]);
		}
		System.out.println();
		System.out.println();
		
		for(int i = 19; i >= 0; i--)
		{
			System.out.print(" " + num[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}
}