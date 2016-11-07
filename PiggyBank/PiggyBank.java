public class PiggyBank
{
	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;
	
	public void insertQuarter()
	{
		quarters++;
	}
	public void insertDime()
	{
		dimes++;
	}
	public void insertNickel()
	{
		nickels++;
	}
	public void insertPenny()
	{
		pennies++;
	}
	public int breakBank()
	{
		return (pennies + (nickels * 5) + (dimes * 10) + (quarters * 25));
	}
    //-----------------------------------------//
    //   Variable Section (instance variables) //
    //-----------------------------------------//

	
	//-----------------------------------------//
    //   Method Section                        //
    //-----------------------------------------//
	
	
	
	
}