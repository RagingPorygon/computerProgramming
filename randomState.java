

//Brandon Isensee

import java.util.Scanner;
import java.io.*;

public class randomState 
{
    public static void main(String [] args) throws IOException
    {
    	Scanner thingy = new Scanner(System.in);
    	Scanner thing = new Scanner(new File("states.txt"));
    	String size[] = new String[51];
    	int count = 0;
    	
    	while(thing.hasNext())
    	{
   			String str = thing.nextLine();
    		System.out.println(str);
    		size[count] = str;
    		count++;
    		
    	}
    	System.out.println();
    	System.out.println("Press <Enter> to view a random state");
    	System.out.println();
    	System.out.println();
    	System.out.println();
    	
    	for(int i = 0; i < 49; i++)
    	{
    		double num = Math.random() * 50;
    		int num2 = (int) num;
    		String hya = thingy.nextLine();
    		
    		System.out.print("-->" + size[num2]);
    		System.out.println();
    		System.out.println();
    	}
    		
    }
}