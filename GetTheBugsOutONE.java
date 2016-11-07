//Brandon Isensee

import java.util.Scanner;
public class GetTheBugsOutONE

{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		String str;
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		if(num <= 100)
		{
			System.out.println("Small");
		}
		else if(num > 100 && num < 200)
		{
			System.out.println("Medium");
		}
		else if(num >= 200)
		{
			System.out.println("Large");
		}
	}
}