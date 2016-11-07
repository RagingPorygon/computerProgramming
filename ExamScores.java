//Brandon Isensee

import java.util.Scanner;

public class ExamScores

{
	public static void main(String [] arg)
	{
		Scanner grades = new Scanner(System.in);
		System.out.print(" ");
		int total = 0;
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int F = 0;
		int num = grades.nextInt();
		while(num > 0)
		{
			System.out.print(" ");
			num = grades.nextInt();
			total++;
			
			if(num >= 90)
				A += 1;
			else if(num > 79)
				B += 1;	
			else if(num > 69)
				C += 1;
			else if(num > 59)
				D += 1;
			else
				F += 1;
		}
		System.out.println("");
		System.out.println("===============================");
		System.out.println("        Summary Report");
		System.out.println("===============================");
		System.out.println("Total number of grades = " + total);
		System.out.println("Number of A's = " + A);
		System.out.println("Number of B's = " + B);
		System.out.println("Number of C's = " + C);
		System.out.println("Number of D's = " + D);
		System.out.println("Number of F's = " + F);
		System.out.println("");
		System.out.println("");
	}
}