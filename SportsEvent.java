//Brandon Isensee

import java.util.Scanner;

public class SportsEvent
{
	public static void main(String [] arg)
	{
		Scanner thingy = new Scanner(System.in);
		int count2 = 0;
		int count = 1;
		int another = 0;
		double scores[] = new double[8];
		double high = 0;
		double low = 10;
		int highPos = 0;
		int lowPos = 0;
		
		System.out.println(" Enter Eight Contestant Scores:");
		
		while(count <= 8)
		{
			System.out.print(" Judge " + count + " --> ");
			scores[another] = thingy.nextDouble(); //input
			
			if(scores[another] > high)
			{
				high = scores[another]; //highest input
				highPos = another;      //position of highest input
			}
			
			if(scores[another] < low)
			{
				low = scores[another]; //lowest input
				lowPos = another;      //position of lowest input
			}
			
			count++;
			another++;
		}
		
		
		
		System.out.println();
		System.out.println("                          Summary");
		System.out.println(" ------------------------------------------------------------");
		System.out.print(" Scores = ");
		while(count2 < 8)
		{
			System.out.print(scores[count2] + " ");
			count2++;
		}
		
		System.out.println();
		System.out.println(" Highest Score = " + high);
		System.out.println(" Lowest Score = " + low);
		double Avg = (scores[0] + scores[1] + scores[2] + scores[3] + scores[4] + scores[5] + scores[6] + scores[7] - scores[highPos] - scores[lowPos]) / 6;
		Avg = Math.round(Avg * 10);
		Avg = Avg / 10;
		System.out.println(" Average Score = " + Avg);
		System.out.println();
	}
}