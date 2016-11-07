//Brandon Isensee

import java.util.Scanner;
public class GetTheBugsOutTHREE

{
	public static void main(String [] args)
	{
		int count = -1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter as many numbers as you like, and type -1 when done:");
		int num = scan.nextInt();
		count++;
		
		while(num > -1)
		{
			num = scan.nextInt();
			count++;
		}
		
		System.out.println("You typed in " + count + " (positive) numbers.");
	}
}