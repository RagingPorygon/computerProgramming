public class SlotMachine
{
    ///////////////////////////
    //       constants       //
    ///////////////////////////
    
    public final int CHERRIES = 0;
    public final int APPLE = 1;
    public final int ORANGE = 2;
    public final int LEMON = 3;
    
    ///////////////////////////
    //   instance variables  //
    ///////////////////////////
    
    private int roller1;   // Contains CHERRIES, APPLE, ORANGE, or LEMON 
    private int roller2;   // Contains CHERRIES, APPLE, ORANGE, or LEMON 
    private int roller3;   // Contains CHERRIES, APPLE, ORANGE, or LEMON 
    private int roller4;   // Contains CHERRIES, APPLE, ORANGE, or LEMON 
    private double jackPot = 20.00; // amount of jackPot
    
    ///////////////////////////
    //        methods        //
    ///////////////////////////
    
    // updates jackPot by adding 25 cents to its total
    public void insertQuarter()
    {
       jackPot += .25;
    }
    
    // randomly selects a fruit for each of the four rollers
    public void pullLever()
    {
    	roller1 = (int)(Math.random() * 4);
    	
    	roller2 = (int)(Math.random() * 4);
    	
    	roller3 = (int)(Math.random() * 4);
    	
    	roller4 = (int)(Math.random() * 4);
    	
    }
    
    // displays the current amount of the jackPot
    public void displayJackPot()
    {
		System.out.println("======================");
		System.out.println("  Jackpot = $" + jackPot);
		System.out.println("======================");
    }

    // displays the type of fruit contained in each roller
    public void displayRollers()
    {
		if(roller1 == CHERRIES)
    	{
    		System.out.print("Cherries ");
    	}
    	else if(roller1 == APPLE)
    	{
    		System.out.print("Apple ");
    	}
    	else if(roller1 == ORANGE)
    	{
    		System.out.print("Orange ");
    	}
    	else if(roller1 == LEMON)
    	{
    		System.out.print("Lemon ");
    	}
    	
    	if(roller2 == CHERRIES)
    	{
    		System.out.print("Cherries ");
    	}
    	else if(roller2 == APPLE)
    	{
    		System.out.print("Apple ");
    	}
    	else if(roller2 == ORANGE)
    	{
    		System.out.print("Orange ");
    	}
    	else if(roller2 == LEMON)
    	{
    		System.out.print("Lemon ");
    	}
    	
    	if(roller3 == CHERRIES)
    	{
    		System.out.print("Cherries ");
    	}
    	else if(roller3 == APPLE)
    	{
    		System.out.print("Apple ");
    	}
    	else if(roller3 == ORANGE)
    	{
    		System.out.print("Orange ");
    	}
    	else if(roller3 == LEMON)
    	{
    		System.out.print("Lemon ");
    	}
    	
    	if(roller4 == CHERRIES)
    	{
    		System.out.print("Cherries ");
    	}
    	else if(roller4 == APPLE)
    	{
    		System.out.print("Apple ");
    	}
    	else if(roller4 == ORANGE)
    	{
    		System.out.print("Orange ");
    	}
    	else if(roller4 == LEMON)
    	{
    		System.out.print("Lemon ");
    	}
    	
    	System.out.println();
    }
    
    // Determines if the user has won the jackPot by matching up
    // all four rollers with the same fruit. If the user wins the
    // method displays the message "Winner" and the amount of the
    // jackpot. Otherwise, it displays the 
    // message "Sorry, Please Try Again".
    public void displayResults()
    {       
		if(roller1 == roller2 && roller2 == roller3 && roller3 == roller4)
		{
			System.out.println(" ******************");
			System.out.println(" ***** Winner *****");
			System.out.println(" ******************");
			System.out.println(" You win = $" + jackPot);
		}
		else if(roller1 != roller2 || roller3 != roller3 || roller3 != roller4 || roller1 != roller4)
		{
			System.out.println(" Sorry. Please Try Again.");
		}
    }
}