//Brandon Isensee

import java.util.Scanner;
import java.io.*;

public class GettysburgAddress 
{

    public static void main(String [] args) throws IOException
    {
    	Scanner thing = new Scanner(new File("Gettysburg.txt"));
    	
    	while(thing.hasNextLine())
    	{
    		System.out.println(thing.nextLine());
    	}
    	System.out.println();
    }
    
    
}