//Brandon Isensee

public class PiggyBank
{
	{
		private int quarters;
		private int dimes;
		private int nickels;
		private int pennies;
		
		public void insertQuarter()
		{
			quarters += 25;
		}
		public void insertDime()
		{
			dimes += 10;
		}
		public void insertNickel()
		{
			nickels += 5;
		}
		public void insertPenny()
		{
			pennies++;
		}
		public int breakBank()
		{
			System.out.println(" Your bank has been smashed!");
			System.out.println(" You saved " + (quarters + dimes + nickels + pennies) + " cents.");
			System.out.println();
		}
	}
}
