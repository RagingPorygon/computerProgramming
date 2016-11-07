//Brandon Isensee

import java.util.Scanner;

public class Averages

{
	public static void main(String [] arg)
	{
		System.out.print(" ");
		int counter = 0, pos = 0, neg = 0, posSum = 0, negSum = 0;
		while(counter < 100)
		{
			int num = (int)(Math.random() * 2001) - 1000;
			System.out.print(num + " ");
			counter++;
			
			if(num > 0)
			{
				pos++;
				posSum += num;
			}
			else if(num < 0)
			{
				neg++;
				negSum += num;
			}
			
		}
		System.out.println("");
		System.out.println("");
		System.out.println("         Summary");
		System.out.println("--------------------------");
		System.out.println(" Positive Numbers     = " + pos);
		System.out.println(" Sum of Positives     = " + posSum);
		System.out.println(" Average of Positives = " + posSum / pos);
		System.out.println("");
		System.out.println("");
		System.out.println(" Negative Numbers     = " + neg);
		System.out.println(" Sum of Negatives     = " + negSum);
		System.out.println(" Average of Negatives = " + negSum / neg);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}
}