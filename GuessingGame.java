//Brandon Isensee

import java.util.Scanner;

public class GuessingGame

{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int correct = (int)(Math.random() * 100) + 1;
		System.out.println("Guess a number between 1-100:");
		int num = scan.nextInt();
		count++;
		
		while(num != correct)
		{
			if(num > correct)
			{
				System.out.println("Too high, try again");
			}
			if(num < correct)
			{
				System.out.println("Too low, try again");
			}
			count++;
			num = scan.nextInt();
		}
		System.out.println("You found it in " + count + " tries.");
		System.out.println();
	}
}