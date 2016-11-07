//Brandon Isensee

import java.util.Scanner;

public class GradeDistribution
{
	public static void main(String [] args)
	{
		Scanner thingy = new Scanner(System.in);
		System.out.print(" Enter number of A's --> ");
		double A = thingy.nextDouble();
		System.out.print(" Enter number of B's --> ");
		double B = thingy.nextDouble();
		System.out.print(" Enter number of C's --> ");
		double C = thingy.nextDouble();
		System.out.print(" Enter number of D's --> ");
		double D = thingy.nextDouble();
		System.out.print(" Enter number of F's --> ");
		double F = thingy.nextDouble();


		
		int count = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		
		double total = A + B + C + D + F;
		
		double aPerc = (A / total) * 50;
		aPerc = (int)(Math.round(aPerc));
		double bPerc = (B / total) * 50;
		bPerc = (int)(Math.round(bPerc));
		double cPerc = (C / total) * 50;
		cPerc = (int)(Math.round(cPerc));
		double dPerc = (D / total) * 50;
		dPerc = (int)(Math.round(dPerc));
		double fPerc = (F / total) * 50;
		fPerc = (int)(Math.round(fPerc));
		String aS = "";
		String bS = "";
		String cS = "";
		String dS = "";
		String fS = "";
		System.out.println("");
		System.out.println(" 0    10   20   30   40   50   60   70   80   90   100%");
		System.out.println(" |    |    |    |    |    |    |    |    |    |    |");
		System.out.println(" |**************************************************");
		
		for(aPerc = (A / total) * 50; aPerc > count; count++)
		{
			aS += "*";
		}
		for(bPerc = (B / total) * 50; bPerc > count2; count2++)
		{
			bS += "*";
		}
		for(cPerc = (C / total) * 50; cPerc > count3; count3++)
		{
			cS += "*";
		}
		for(dPerc = (D / total) * 50; dPerc > count4; count4++)
		{
			dS += "*";
		}
		for(fPerc = (F / total) * 50; fPerc > count5; count5++)
		{
			fS += "*";
		}
		System.out.println(" |" + aS + " A");
		System.out.println(" |" + bS + " B");
		System.out.println(" |" + cS + " C");
		System.out.println(" |" + dS + " D");
		System.out.println(" |" + fS + " F");
		System.out.println("");
		System.out.println("");
	}
}