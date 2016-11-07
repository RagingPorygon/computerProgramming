//Brandon Isensee

import java.util.Scanner;

public class Asterisks 
{
    public static void main(String [] arg)
    {
    	Scanner number = new Scanner(System.in);
    	System.out.print(" Enter a number --> ");
    	int num = number.nextInt();
    	
    	System.out.println("");
    	
    	for(int count = 1; count <= num; count++)
    	{
    		for(int n = 1; n <= count; n++)
    		{
    			System.out.print(" *");
    		}
    		System.out.println();
    	}
    	for(int count = 1; count < num; count++)
    	{
    		for(int n = num; n > count; n--)
    		{
    			System.out.print(" *");
    		}
    		System.out.println();
    	}
    }
}