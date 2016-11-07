//Brandon Isensee

import java.util.Scanner;
import java.io.*;

public class readInts
{
    public static void main(String [] args) throws IOException
    {
    	Scanner thing = new Scanner(new File("Integers.txt"));
    	int count = 0;
    	int sum = 0;
    	
    	while(thing.hasNextInt())
    	{
    		int num = thing.nextInt();
    		System.out.print(thing.nextInt() + " ");
    		count++;
    		sum += num;
    	}
    	
    	System.out.println();
    	System.out.println();
    	System.out.println(" Count = " + count);
    	System.out.println(" Sum   = " + sum);
    }
}