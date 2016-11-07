//Brandon Isensee

import java.util.Scanner;

public class SemesterAvg
{
    public static void main(String[] arg)
    {
    	Scanner what = new Scanner(System.in);
    	System.out.print(" Enter student's name --> ");
    	String name = what.nextLine();
    	System.out.print(" Enter 1st 6 weeks Avg --> ");
    	int fgrade = what.nextInt();
    	System.out.print(" Enter 2nd 6 weeks Avg --> ");
    	int sgrade = what.nextInt();
    	System.out.print(" Enter 3rd 6 weeks Avg --> ");
    	int tgrade = what.nextInt();
    	System.out.print(" Enter Final Exam Grade --> ");
    	int egrade = what.nextInt();
    	int Avg = (int)Math.round(0.8 * ((fgrade + sgrade + tgrade) / 3) + (0.2 * egrade));
    	System.out.println("");
    	System.out.println("");
    	System.out.println("Name                   1    2    3    E       Avg");
    	System.out.println("------------------------------------------------------");
    	System.out.printf("%-21s%3s%5s%5s%5s%10s%n", name, fgrade, sgrade, tgrade, egrade, Avg);
    }
}