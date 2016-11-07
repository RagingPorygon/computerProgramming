//Brandon Isensee

import java.util.Scanner;

public class GetTheBugsOutFIVE

{
	public static void main(String [] arg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");
		String str = scan.nextLine();
		
		System.out.println("First Letter: " + str.substring(0,1));
		System.out.println("Last Latter: " + str.substring(str.length() - 1, str.length()));
	}
}