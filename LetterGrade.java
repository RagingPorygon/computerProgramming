//Brandon Isensee

import java.util.Scanner;

public class LetterGrade 

{
	public static void main(String [] arg)
	{
		Scanner thing = new Scanner(System.in);
		System.out.print(" Enter a Numerical Grade--> ");
		int num = thing.nextInt();
		System.out.print(" Letter Grade = ");
		
		if (num >= 99)
			System.out.println("A+");
			else if (num >= 95)
				System.out.println("A");
			else if (num >= 93)
				System.out.println("A-");
			else if (num >= 90)
				System.out.println("B+");
			else if (num >= 87)
				System.out.println("B");
			else if (num >= 85)
				System.out.println("B-");
			else if (num >= 83)
				System.out.println("C+");
			else if (num >= 80)
				System.out.println("C");
			else if (num >= 77)
				System.out.println("C-");
			else if (num >= 73)
				System.out.println("D+");
			else if (num >= 70)
				System.out.println("D");
			else if (num <= 69)
				System.out.println("F");
	}
}