public class PiggyBankTest
{
    public static void main(String[] args)
    {
		PiggyBank bank = new PiggyBank();
		bank.insertDime();          // add a dime
		bank.insertQuarter();       // add a quarter
		bank.insertPenny();         // add a penny
		bank.insertNickel();        // add a nickel
		bank.insertQuarter();       // add a quarter
		bank.insertDime();          // add a dime
		bank.insertPenny();    
		System.out.println("Your bank has been smashed!");
		System.out.println("You saved " + bank.breakBank() + " cents.");
		System.out.println();
		
    }
}