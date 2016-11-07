//Brandon Isensee

import java.util.Scanner;

public class Substrings

{
	public static void main(String [] arg) 
	{
		// f l a s h l i g h t
		//0 1 2 3 4 5 6 7 8 9 10
		//flashlight
		//0123456789
		Scanner keyboard = new Scanner(System.in);
		String flashlight;
		System.out.println(" ");
		System.out.print(" Enter the word flashlight --> ");
		flashlight = keyboard.next();
		System.out.println(" ");
		System.out.println(" Part 1");
		System.out.println(" ================");
		System.out.println(" " + flashlight.substring(0,5));
		System.out.println(" " + flashlight.substring(5,10));
		System.out.println(" " + flashlight.substring(2,5));
		System.out.println(" " + flashlight.charAt(0) + flashlight.substring(5,10));
		System.out.println(" " + flashlight.substring(0,3) + flashlight.charAt(7));
		System.out.println(" " + flashlight.charAt(0) + flashlight.charAt(6) + flashlight.charAt(9));
		System.out.println(" " + flashlight.charAt(4) + flashlight.substring(6,9));
		System.out.println(" " + flashlight.charAt(7) + flashlight.substring(2,4));
		System.out.println(" " + flashlight.charAt(0) + flashlight.substring(2,4) + flashlight.charAt(9));
		System.out.println(" " + flashlight.substring(3,5) + flashlight.charAt(2) + flashlight.charAt(0) + flashlight.charAt(9) );
		System.out.println(" ");
		System.out.println(" Part 2");
		System.out.println(" ================");
		System.out.println(" " + flashlight.substring(5,10) + "s");
		System.out.println(" " + flashlight.substring(5,10) + "er");
		System.out.println(" " + flashlight.substring(5,10) + "ning");
		System.out.println(" en" + flashlight.substring(5,10) + "ened");
		System.out.println(" ");
	}
}