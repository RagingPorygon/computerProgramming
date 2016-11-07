//Brandon Isensee

public class DoWhilePractice

{
	public static void main(String [] arg)
	{
		int ctr = 0, ctr2 = 1, ctr3 = 0, ctr4 = 97; 
		do
		{
			System.out.print(" " + ctr);
			ctr++;
		}
		while(ctr < 21);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		do
		{
			System.out.print(" " + ctr2);
			ctr2 += 2;
		}
		while(ctr2 < 50);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		do
		{
			System.out.print(" " + ctr3);
			ctr3 += 10;
		}
		while(ctr3 < 210);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		do
		{
			System.out.print(" " + (char)ctr4);
			ctr4 += 1;
		}
		while(ctr4 < 122);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.print(" ");
	}
}