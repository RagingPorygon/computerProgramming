//Brandon Isensee

public class TimeTable
{
	public static void main(String [] arg)
	{
		System.out.println("               Multiplication Table");
		System.out.println("");
		System.out.println("");
		System.out.println("     1   2   3   4   5   6   7   8   9   10 ");
		System.out.println("--------------------------------------------");
		int c2 = 0;
		
        for(int c = 1; c <= 10; c++)      // outer
        {
        	System.out.printf("%-3s%2s", c, "| ");
            for(int count = 1; count <= 10; count++)  // inner
            {
                System.out.printf("%-4s", c2 = c * count);
            }
            System.out.println();
        }
	}
}