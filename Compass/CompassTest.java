import java.util.*;

public class CompassTest
{
	public static void main(String [] args)
	{
		Compass Compass = new Compass();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("**********************");
		System.out.println("*    Compass Test    *");
		System.out.println("**********************");
		System.out.println();

		int sel = 0;
		
		do
		{
		  System.out.println("================================");
		  System.out.println(" Current Heading   = " + Compass.getHeading());
		  System.out.println(" Current Direction = " + Compass.getDirection());
		  System.out.println("================================");
		  System.out.println();
		  System.out.println("1. Turn Right One Degree");
		  System.out.println("2. Turn Left One Degree");
		  System.out.println("3. Turn (degrees)");
		  System.out.println("4. Change Heading" );
		  System.out.println("5. Quit" );
		  System.out.println();
		  System.out.print("Make selection -->");
		  sel = keyboard.nextInt();
		  
		  if(sel == 1)
		  {
		  	 Compass.turnRight();
		  }	
		  if(sel == 2)
		  {
		  	 Compass.turnLeft();
		  }
		  if(sel == 3)
		  {
		  	 System.out.println();
		  	 System.out.print("Enter degrees (- turns left, + turns right) -->");
		  	 int degrees = keyboard.nextInt();
		  	 Compass.turnDegrees(degrees);
		  }
		  if(sel == 4)
		  {
		  	 System.out.println();
		  	 System.out.print("Enter new Heading (in degrees) -->");
		  	 int heading = keyboard.nextInt();
		  	 Compass.setHeading(heading);
		  }
		}
		while(sel < 5);
	}
}
