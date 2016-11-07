//Brandon Isensee

import java.util.Scanner;
public class GetTheBugsOutTWO

{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = scan.nextLine();
		
		for(int i = 1; i <=10; i++)
		{
			System.out.println(str);
		}
	}
}