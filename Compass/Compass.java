public class Compass
{
    ////////////////////////////
    //   Instance Variables   //
    ////////////////////////////
    
    int degrees = 0;
    String str = "";
    
    ////////////////////////////
    //         Methods        //
    ////////////////////////////
    
    // Turns one degree to the right.
    // After turning, if degrees is equal to 360
    // change degrees to 0.
    public void turnRight()
    {
    	degrees++;
    	if(degrees == 360)
    	{
    		degrees = 0;
    	}
    }
    
    // Turns one degree to the left.
    // After turning, if degrees is equal to -1
    // change degrees to 359.
    public void turnLeft()
    {
        degrees--;
        if(degrees < 0)
        {
        	degrees = 359;
        }
    }
    
    // Turn the number of degrees specified in the parameter list.
    // If deg is greater than or equal to 0 turn to the right
    // else turn to the left.
    // Use turnRight and turnLeft in your implementation.
    // Hint: use for loops.
    public void turnDegrees(int deg)
    {
		degrees += deg;
    }
    
    // Sets degrees to the heading specified by deg.
    // If deg is equal to 360 set degrees equal to 0.
    public void setHeading(int deg)
    {
        degrees = deg;
    }
    
    // Returns degrees (current heading)
    public int getHeading()
    {
        return degrees;
    }
    
    // Translates degrees into one of the eight directional
    // values: North, NorthEast, East, SouthEast, South, SouthWest,
    // West, and NorthWest. The direction is returned as a String.
    public String getDirection()
    {
		if(degrees < 22 || degrees >= 337)
        {
        	if(degrees < 360)
        	{
        	str = "North";
        	System.out.print(str);
        	}
        }
        else if(degrees < 67)
        {
        	str = "NorthEast";
        	System.out.print(str);
        }
        else if(degrees < 112)
        {
        	str = "East";
        	System.out.print(str);
        }
        else if(degrees < 157)
        {
        	str = "SouthEast";
        	System.out.print(str);
        }
        else if(degrees < 202)
        {
        	str = "South";
        	System.out.print(str);
        }
        else if(degrees < 247)
        {
        	str = "SouthWest";
        	System.out.print(str);
        }
        else if(degrees < 293)
        {
        	str = "West";
        	System.out.print(str);
        }
        else if(degrees < 337)
        {
        	str = "NorthWest";
        	System.out.print(str);
        }
        return str;
    }
    
}