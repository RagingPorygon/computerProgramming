import java.util.*;

// This class is the driver program for the game.
// It displays the scrambled word and asks the
// user to make a guess as to what the word is
// suppose to be. If the user guesses correctly 
// it displays the message "Correct". If the user
// guesses incorrectly it displays the message 
// "Incorrect" and then displays the word unscrambled.
// The user is given the opportunity to play again or
// quit. If the user quits the class displays
// how many words the user got correct using the
// following form: 
// (number correct) out of (number attempted)

public class Game
{
   public static void main(String[] args)
   {
   		String str;
   		Scrambler scrambler = new Scrambler();
   		Scanner scan = new Scanner(System.in);
   		int total = 0;
   		int correct = 0;
   		scrambler.selectWord();
   		System.out.println("Word Scramble");
   		System.out.println("=============");
   		System.out.println();
   		
   		System.out.println("Scrambled word: " + scrambler.getScrambledWord());
   		System.out.print("Guess--> ");
   		
   		if(scrambler.makeGuess(str = scan.nextLine()) == true)
   		{
   			correct++;
   		}
   		
   		total++;
   		
   		System.out.print("Play again [Y/N] ? ");
   		str = scan.nextLine();
   		
   		while(!str.equalsIgnoreCase("N"))
   		{
   			scrambler.selectWord();
   			System.out.println("Word Scramble");
   			System.out.println("=============");
   			System.out.println();
   		
   			System.out.println("Scrambled word: " + scrambler.getScrambledWord());
   			System.out.print("Guess--> ");
   		
   			if(scrambler.makeGuess(str = scan.nextLine()) == true)
   			{
   				correct++;
   			}
   		
   			total++;
   		
   			System.out.print("Play again [Y/N] ? ");
   			str = scan.nextLine();
   		}
   		
   		System.out.println("You got " + correct + " out of " + total);
   }  
}