//Brandon Isensee

public class printfPractice
{
   public static void main(String[] args)
   {
      System.out.println();
      System.out.println("    Method 1");
      System.out.println("----------------");
      System.out.println();
      Method1();          // call Method1
      System.out.println();
      System.out.println("    Method 2");
      System.out.println("----------------");
      System.out.println();
      Method2();         // call Method2
      System.out.println();
      System.out.println("    Method 3");
      System.out.println("----------------");
      System.out.println();
      Method3();        // call Method3
   }

   public static void Method1()
   {
      int benchPress = 280;
      int squats = 395;
      System.out.printf("%-23s%-3d%n", "Bench Press", benchPress);
      System.out.printf("%-23s%-3d%n", "Squats", squats);
      System.out.println("");

   }
   
   public static void Method2()
   {
      double width = 10.74829;
      double length = 5.125; 
      System.out.printf("%-7s%-2s%4.2f%n", "width", "=", width);
      System.out.printf("%-7s%-3s%3.2f%n", "length", "=", length);
      System.out.println("");
   }

   
   public static void Method3()
   {
      int dividend = 1250;
      int divisor = 75;
      double quotient = 0;
	  System.out.printf("%-5s%-2s%-3s%-2s%-5.2f%n", dividend, "/", divisor, "=", quotient = (double)dividend / divisor);
      System.out.println("");
	   
   }
}