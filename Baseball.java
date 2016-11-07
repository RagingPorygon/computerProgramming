//Brandon Isensee

 import static java.lang.System.out;

 public class Baseball
 {
	public static void main(String [] args)
	{
		int hits = 27, atBats = 80, roundedAvg = 0;
        double battingAvg = 0;
		battingAvg = (double) hits / atBats; 
		battingAvg = battingAvg += 0.0005;
		battingAvg = battingAvg *= 1000;
		roundedAvg = (int) battingAvg;
		out.println("Hits = " + hits);
		out.println("At Bats = " + atBats);
		out.println("----------------------");
		out.println("Batting Average = " + roundedAvg);
		out.println("");
	}
}