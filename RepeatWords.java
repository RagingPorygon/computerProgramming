//Brandon Isensee

import java.util.Scanner;

public class RepeatWords

{
	public static void main(String [] arg)
	{
		Scanner thing1 = new Scanner(System.in);
		System.out.println(" Enter words, type (stop or exit) to stop");
		System.out.println("");
		String whatever = "";
		int thing2 = -1;
		
		while(!whatever.equalsIgnoreCase("exit") && !whatever.equalsIgnoreCase("stop"))
		{
				System.out.print(" ");
				whatever = thing1.nextLine();
				thing2++;
		}
		System.out.println("");
		System.out.println("You entered " + thing2 + " words.");
		System.out.println("");
	}
}