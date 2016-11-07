import java.util.*;
import java.io.*;

// This class reads in a list of words from a file
// and stores them in a wordbank. A client program can
// retrieve a randomly selected word from the wordbank
// by calling the method nextWord. The class guarantees
// that a word is not used more than once.

public class WordBank
{
	private String[] wordList;
	private int numWords;
	private Scanner input;
	
	// constructor
	public WordBank()
	{
	   wordList = new String[100];
	   numWords = 0;
	   readFile();
	}
	
	// retrieves next random word from wordbank
	public String nextWord()
	{ 
	   int random = 0;
	   String word = "";
	   do
	   {
	      random = (int)(Math.random() * numWords);
	   }
	   while(wordList[random] == null);
	   word = wordList[random];
	   wordList[random] = null;
	   return word;	
	}
	
	// Opens the wordbank file and reads all of the
	// words into a String array
	private void readFile()
	{
	   try
	   {
	   	 input = new Scanner(new File("wordbank.txt"));
	   }
	   catch(IOException ex)
	   {
	   	 System.out.println("File not found!");
	   }
	   
	   while(input.hasNextLine())
	   {
	   	  wordList[numWords] = input.nextLine();
	   	  numWords++;
	   }	 	
	}
}