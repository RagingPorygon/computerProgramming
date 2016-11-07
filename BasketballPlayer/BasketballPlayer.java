public class BasketballPlayer
{
	// instance variables
	
	String name;
	int points;
	
    // methods
    
    // sets the name of the player to the value specified by n in the
    // parameter list.
	public void setName(String n)
	{
		name = n;
	}
	
	// returns the name of the player
	public String getName()
	{
		return name;
	}
	
	// The parameter shots represents the number of two points shots 
    // made during the game. The method should multiply the value 
    // given by shots by 2 then add the result to the variable points.
	public void made2FG(int shots)
	{
		int thing = 2;
		thing *= shots;
		points += thing;
	}
	
	// The parameter shots represents the number of three points shots 
    // made during the game. The method should multiply the value 
    // given by shots by 3 then add the result to the variable points.
	public void made3FG(int shots)
	{
		int thing = 3;
		thing *= shots;
		points += thing;
	}
	
	// Adds the value of shots (Free Throw == 1 point) to the variable points.
	public void madeFT(int shots)
	{
		points += shots;
	}
	
	// returns the value of points
	public int getPoints()
	{
		return points;
	}
}