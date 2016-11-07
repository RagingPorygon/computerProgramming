//Brandon Isensee

import java.util.Scanner;

public class Mixup

{
	public static void main(String [] arg)
	{
		Scanner keyboard = new Scanner(System.in);
		String string;
		System.out.print(" Enter a string --> ");
		string = keyboard.next();
		System.out.println("");
		System.out.println(" " + string.substring((int)string.length() / 2, string.length()) + string.substring(0, (int)string.length() / 2));
	}
}