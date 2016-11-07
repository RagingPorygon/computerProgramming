//Brandon Isensee

import java.util.Scanner;

public class Fraction

{
	public static void main(String [] arg)
	{
		// # / #   +   # / #
		//0 1 2 3 4 5 6 7 8 9
		Scanner thing = new Scanner(System.in);
		System.out.println(" Enter a fraction, operater, and another fraction using");
		System.out.println(" this format: (2/3 + 1/2), and I will add, substract, multiply,");
		System.out.println(" or divide the fractions according to the operation desired.");
		System.out.println(" ");
		System.out.print(" Enter Fractions--> ");
		String str = thing.nextLine();
		int num1 = Integer.parseInt(str.substring(0,1));
		int num2 = Integer.parseInt(str.substring(2,3));
		String op = str.substring(4,5); //This one
		int num3 = Integer.parseInt(str.substring(6,7));
		int num4 = Integer.parseInt(str.substring(8,9));
		//Addition
		int top1 = (num1 * num4) + (num2 * num3);
		int bot1 = (num2 * num4);
		//Subtraction
		int top2 = (num1 * num4) - (num2 * num3);
		//Multiplication
		int top3 = (num1 * num3);
		int bot2 = (num2 * num4);
		//Division
		int top4 = (num1 * num4);
		int bot3 = (num2 * num3);
		 
		if (op.equals("+"))
		{
			System.out.println(" ");
			System.out.println(" " + num1 + "     " + num3 + "     " + top1);
			System.out.println(" -" + "  " + op + "  -  =  -");
			System.out.println(" " + num2 + "     " + num4 + "     " + bot1);
		}
		else if(op.equals("-"))
		{
			System.out.println(" ");
			System.out.println(" " + num1 + "     " + num3 + "     " + top2);
			System.out.println(" -" + "  " + op + "  -  =  -");
			System.out.println(" " + num2 + "     " + num4 + "     " + bot1);
		}
		else if(op.equals("*"))
		{
			System.out.println(" ");
			System.out.println(" " + num1 + "     " + num3 + "     " + top3);
			System.out.println(" -" + "  " + op + "  -  =  -");
			System.out.println(" " + num2 + "     " + num4 + "     " + bot2);
		}
		else if(op.equals("/"))
		{	
			System.out.println(" ");
			System.out.println(" " + num1 + "     " + num3 + "     " + top4);
			System.out.println(" -" + "  " + op + "  -  =  -");
			System.out.println(" " + num2 + "     " + num4 + "     " + bot3);
		}
		System.out.println(" ");
	}
}