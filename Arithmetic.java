//Brandon Isensee

import static java.lang.System.out;

public class Arithmetic
{
	public static void main(String [] args)
	{
		int operand1 = 1, operand2 = 2;
		int sum = 0, difference = 0, product = 0, quotient = 0, remainder = 0;
		sum = operand1 + operand2;
		difference = operand1 - operand2;
		product = operand1 * operand2;
		quotient = operand1 / operand2;
		remainder = operand1 % operand2;
		out.println("           Arithmetic");
		out.println(" ===============================");
		out.println("  1 + 2 = " + sum);
		out.println("  1 - 2 = " + difference);
		out.println("  1 * 2 = " + product);
		out.println("  1 / 2 = " + quotient);
		out.println("  1 % 2 = " + remainder);
	}
}