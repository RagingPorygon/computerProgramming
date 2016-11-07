//Brandon Isensee

 import static java.lang.System.out;
 
 public class Grades
 {
 	public static void main(String [] args)
 	{
 		double dailyAvg = 88, quizAvg = 74, testAvg = 95, sixWeeksAvg = 0;
 		int roundedAvg = 0;
 		sixWeeksAvg = (dailyAvg * 0.3) + (quizAvg * 0.2) + (testAvg * 0.5);
 	    sixWeeksAvg = (sixWeeksAvg + 0.5);
 	    roundedAvg = (int) sixWeeksAvg;
 	    out.println("Daily Average = " + dailyAvg);
 	    out.println("Quiz Average = " + quizAvg);
 	    out.println("Test Average = " + testAvg);
 	    out.println("---------------------------");
 	    out.println("Six Weeks Average = " + roundedAvg);
 	    out.println();
 	    
 	}
 }