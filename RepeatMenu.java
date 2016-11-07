//Brandon Isensee

import java.util.Scanner;

public class RepeatMenu

{
	public static void main(String [] arg)
	{
		Scanner thing = new Scanner(System.in);
		int num = 0;
		do
		{
			System.out.println(" ");
			System.out.println("      Menu");
			System.out.println("================");
			System.out.println(" 1.  Dr. Pepper");
			System.out.println(" 2.  Coke");
			System.out.println(" 3.  Sprite");
			System.out.println(" 4.  7-UP");
			System.out.println(" 5.  Diet Coke");
			System.out.println(" ");
			System.out.println(" ");
			System.out.print(" Selection: ");
			num = thing.nextInt();
		}
		while(num != 1 && num != 2 && num != 3 && num != 4 && num != 5);
		
		System.out.println("");
		
		if(num == 1)
		{
			System.out.println(" You have chosen Dr. Pepper");
		}
		else if(num == 2)
		{
			System.out.println(" You have chosen Coke");
		}
		else if(num == 3)
		{
			System.out.println(" You have chosen Sprite");
		}
		else if(num == 4)
		{
			System.out.println(" You have chosen 7-UP");
		}
		else if(num == 5)
		{
			System.out.println(" You have chosen Diet Coke");
		}
		System.out.println("");
	}
}