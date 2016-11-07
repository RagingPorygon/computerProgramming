//Brandon Isensee

import java.util.Scanner;

public class ChristmasThingy

{
	public static void main(String [] arg)
	{
		Scanner thingy = new Scanner(System.in);
		int num = 1;
		int num2 = 1;
		
		for(num = 1; num <= 12; num++)
		{
			switch(num)
			{
				case 1:
					System.out.println("On the first day of Christmas my true love gave to me");
					break;
				case 2:
					System.out.println("On the second day of Christmas my true love gave to me");
					break;
			}
			for(num2 = 1; num2 <= num; num2++)
			{
				switch(num2)
				{
					case 1:
						System.out.println("A partridge in a pear tree");
						break;
					case 2:
						System.out.println("two turtledoves,");
						break;
				}
			}
			String pause = thingy.nextLine();
		}
	}
}