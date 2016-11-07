public class RectangleTest
{
	public static void main(String[] args)
	{
		Rectangle rect = new Rectangle();
		System.out.println(rect);
		System.out.println();
		
		Rectangle rect2 = new Rectangle(10, 20);
		System.out.println(rect2);
		System.out.println();
		
		rect.setLength(100);
		rect.setWidth(150);
		System.out.println("Length    = " + rect.getLength());
		System.out.println("Width     = " + rect.getWidth());
		System.out.println("Area      = " + rect.getArea());
		System.out.println("Perimeter = " + rect.getPerimeter());
		System.out.println();
	}
}