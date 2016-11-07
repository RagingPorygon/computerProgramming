//Brandon Isensee

import java.util.Scanner;

public class LargestThingy

{
	public static void main(String [] arg)
	{
		Scanner thingy = new Scanner(System.in);
		int counter = 1, num = 0, largest = 0;
		System.out.println(" Enter 10 numbers:");
		
		do
		{
			num = thingy.nextInt();
			counter++;
		} 
		while(counter != 10);
	}
}