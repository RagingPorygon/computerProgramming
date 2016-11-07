//Brandon Isensee

import java.util.Scanner;

public class TableThingy

{
	public static void main(String [] arg)
	{
		int ctr = 1;
		Scanner thingy = new Scanner(System.in);
		System.out.print(" Enter a number --> ");
		int num = thingy.nextInt();
		System.out.println("");
		System.out.println("  N   10*N   100*N   1000*N");
		System.out.println("-------------------------------");
		
		do
		{
			System.out.println("  " + ctr + "   " + ctr * 10 + "     " + ctr * 100 + "     " + ctr * 1000);
			ctr++;
		}
		while(ctr <= num);
		
		System.out.println("");
	}
}