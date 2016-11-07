//Brandon Isensee

public class quickPick

{
	public static void main(String [] args)
	{
		System.out.println(" TexasLottery - Quick Pick");
		System.out.println(" ==========================");
		int n = (int)(Math.random() * 50 + 1);
		int n2 = (int)(Math.random() * 50+ 1);
		int n3 = (int)(Math.random() * 50 + 1);
		int n4 = (int)(Math.random() * 50 + 1);
		int n5 = (int)(Math.random() * 50 + 1);
		int n6 = (int)(Math.random() * 50 + 1);
		System.out.println(" " + n + "  " + n2 + "  " + n3 + "  " + n4 + "  " + n5 + "  " + n6);
		System.out.println("");
	}
}