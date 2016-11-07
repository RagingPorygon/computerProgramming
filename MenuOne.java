//Brandon Isensee

import java.util.Scanner;

public class MenuOne

{
	public static void main(String [] arg)
	{
		Scanner num = new Scanner(System.in);
		System.out.println("      Menu");
		System.out.println("     ======");
		System.out.println("");
		System.out.println(" 1. Option A");
		System.out.println(" 2. Option B");
		System.out.println(" 3. Option C");
		System.out.println(" 4. Option D");
		System.out.println(" 5. Option E");
		System.out.println("");		
		System.out.println("");		
		System.out.print(" Selection: ");
		int selection = num.nextInt();
		System.out.println("");
		System.out.println("");
		
		switch(selection)
		{
			case 1:
				System.out.println("You have chosen Option A");
				break;
			case 2:
				System.out.println("You have chosen Option B");
				break;
			case 3:
				System.out.println("You have chosen Option C");
				break;
			case 4:
				System.out.println("You have chosen Option D");
				break;
			case 5:
				System.out.println("You have chosen Option E");
				break;
			default:
				System.out.println("Invalid Selection!");
				break;
		}
		System.out.println("");	
	}
}