import java.util.*;

public class PlaySlots
{
    public static void main(String[] args)
    {
        SlotMachine slot = new SlotMachine();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("==================");
        System.out.println("   Slot Machine");
        System.out.println("==================");
        System.out.println();
        
        do
        {
           System.out.print("Pull Lever <Press Enter>");
           String str = keyboard.nextLine();

           slot.insertQuarter();
           slot.pullLever();
           slot.displayJackPot();
           slot.displayRollers();
           slot.displayResults();
           
        }
        while(true);
        
    }
}