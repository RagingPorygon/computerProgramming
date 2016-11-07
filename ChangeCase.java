//Brandon Isensee

import java.util.Scanner;

public class ChangeCase
{
	public static void main(String[] arg)
	{
		Scanner thing = new Scanner(System.in);
		String whatever = "";
		int phys = 100;
		int log = 0;
		
		String total[] = new String[phys];
		
		while(!whatever.equalsIgnoreCase("stop"))
		{
			whatever = thing.nextLine();
			total[log] = whatever;
			log++;
		}
		
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < log - 1; i++)
		{
			String thingy = total[i];
			System.out.printf("%-12s%-12s%-12s%n", thingy, thingy.toUpperCase(), thingy.toLowerCase());
		}
		
		System.out.println();
		System.out.println();
		
	}
}