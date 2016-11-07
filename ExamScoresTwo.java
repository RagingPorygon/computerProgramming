//Brandon Isensee

import java.util.Scanner;

public class ExamScoresTwo

{
	public static void main(String [] arg)
	{
		Scanner thing = new Scanner(System.in);
		int A = 0, B = 0, C = 0, D = 0, F = 0, total = -1;
		int num = 0;
		
		while(num >= 0)
		{
			System.out.print(" ");
			num = thing.nextInt();
			total++;
			
			if(num >= 90)
				A++;
			else if(num >=80)
				B++;
			else if(num >=70)
				C++;
			else if(num >= 60)
				D++;
			else if(num > 0)
				F++;
		}	
		
		System.out.println(" ");
		System.out.println(" =========================");
		System.out.println("      Summary Report");
		System.out.println(" =========================");
		System.out.println(" Total number of grades = " + total);
		System.out.println(" Number of A's = " + A);
		System.out.println(" Number of B's = " + B);
		System.out.println(" Number of C's = " + C);
		System.out.println(" Number of D's = " + D);
		System.out.println(" Number of F's = " + F);
		System.out.println(" ");
		System.out.println(" ");
	}
}