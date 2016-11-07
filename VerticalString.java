//Brandon Isensee

import java.util.Scanner;

public class VerticalString
{
    public static void main(String [] args)
    {
    	Scanner thingy = new Scanner(System.in);
    	System.out.print(" Enter a string --> ");
    	String whatevs = thingy.nextLine();
    	int num = 0;
    	System.out.println("");
    	int num2 = whatevs.length();
    	
    	for(num = 0; num < num2; num++)
    	{
    		System.out.println(whatevs.substring(num, num + 1));
    	}
    	System.out.println("");
    		
    }
    
    
}