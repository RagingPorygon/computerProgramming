class Rectangle
{
   // Instance Variables
   
   private int width;
   private int length;
   
   // Constructors
   public Rectangle()
   {
   		width = 0;
   		length = 0;
   }
   
   public Rectangle(int widths, int lengths)
   {
   		width = widths;
   		length = lengths;
   }
   // Accessor Methods
   
   public int getLength()
   {
   	return length;
   }
   
   public int getWidth()
   {
   	return width;
   }
   
   // Mutator Methods
   
   public void setLength(int l)
   {
   	length = l;
   }
   public void setWidth(int w)
   {
   	width = w;
   }
   
   //Area/Perimeter
   
   public int getArea()
   {
   	return length * width;
   }
   
   public int getPerimeter()
   {
   	return 2 * (width + length);
   }
   
   // toString Method
   
   public String toString()
   {
   	String str;
   	str = "Length       : " + length + "\n" +
   	"Width        : " + width + "\n" +
   	"Area         : " + getArea() + "\n" +
   	"Perimeter    : " + getPerimeter() + "\n";
   	return str;
   }	
  	
}