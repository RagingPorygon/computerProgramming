//Brandon Isensee

import java.util.Scanner;

public class FullName

{
	public static void main(String [] arg)
	{
		Scanner keyboard = new Scanner(System.in);
		String fname;
		String lname;
		System.out.println(" ");
		System.out.print("Enter first name--> ");
        fname = keyboard.next();
        System.out.print("Enter last name--> ");
        lname = keyboard.next();
        System.out.println(" ");
        System.out.println(lname + ", " + fname);
        System.out.println("");
        System.out.println("");
	}
}