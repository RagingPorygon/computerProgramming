//Brandon Isensee

import java.util.Scanner;

public class Christmas

{
	public static void main(String [] arg)
	{
		Scanner keyboard = new Scanner(System.in);
		int num = 1;
		int num2 = num;
		
		for(num = 1; num <= 12; num++)
		{
   			switch(num)
   			{
   				case 1:
					System.out.println("On the first day of Christmas my true love gave to me");
					System.out.println("A partridge in a pear tree");
					break;
				case 2:
					System.out.println("On the second day of Christmas my true love gave to me");
					break;
				case 3:
					System.out.println("On the third day of Christmas my true love gave to me");
					break;
				case 4:
					System.out.println("On the fourth day of Christmas my true love gave to me");
					break;
				case 5:
					System.out.println("On the fifth day of Christmas my true love gave to me");
					break;
				case 6:
					System.out.println("On the sixth day of Christmas my true love gave to me");
					break;
				case 7:
					System.out.println("On the seventh day of Christmas my true love gave to me");
					break;
				case 8:
					System.out.println("On the eighth day of Christmas my true love gave to me");
					break;
				case 9:
					System.out.println("On the ninth day of Christmas my true love gave to me");
					break;
				case 10:
					System.out.println("On the tenth day of Christmas my true love gave to me");
					break;
				case 11:
					System.out.println("On the eleventh day of Christmas my true love gave to me");
					break;
				case 12:
					System.out.println("On the twelfth day of Christmas my true love gave to me");
					break;
 			}
   			for(num2 = num; num2 >= 1; num2--)
   			{
      			switch(num2)
      			{
      				case 1:
      					System.out.print("");
      					break;
      				case 2:
						System.out.println("two turtledoves,");
						System.out.println("and a partridge in a pear tree,");
						break;
					case 3:
						System.out.println("three French hens,");
						break;
					case 4:
						System.out.println("four calling birds,");
						break;
					case 5:
						System.out.println("five gold rings,");
						break;
					case 6:
						System.out.println("six geese a-laying,");
						break;
					case 7:
						System.out.println("seven swans a-swimming,");
						break;
					case 8:
						System.out.println("eight maids a-milking,");
						break;
					case 9:
						System.out.println("nine ladies waiting,");
						break;
					case 10:
						System.out.println("ten lords-a-leaping,");
						break;
					case 11:
						System.out.println("eleven pipers piping,");
						break;
					case 12:
						System.out.println("twelve drummers drumming,");
						break;
   			    }
   			}
   			String pause = keyboard.nextLine();
		}
		
	}
}