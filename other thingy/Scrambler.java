public class Scrambler
{
	private WordBank wordbank;  
	private String currentWord;  // currently selected word;
	                             // the correct answer
	// constructor
	public Scrambler()
	{
		currentWord = "";
	}
	
	// retrieves a randomly selected word from
	// the wordbank
	public void selectWord()
	{
		currentWord = nextWord();
	}
	
	// returns true if the parameter word
	// is equal to the currently selected
	// word from the wordbank
	public boolean makeGuess(String word)
	{
   	
	}
	
	// returns the currently selected word(the answer)
	public String getWord()
	{
	
	
	}
	
    // Creates and returns a new String that is a scrambled
    // version of the current word. The letters of the 
    // new String are randomly scrambled.
    public String getScrambledWord()
    {
       String scrambled = "";
       boolean[] validation = new boolean[currentWord.length()];
       int count = 0;
       
       while(count < currentWord.length())
       {
          int random = (int)(Math.random() * currentWord.length());
          if(validation[random] == false)
          {
            scrambled += currentWord.substring(random, random+1);
            validation[random] = true;
            count++;
          }     
       }
       return scrambled;
    }
}