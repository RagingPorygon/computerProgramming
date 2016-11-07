public class StatesTest
{
	public static void main(String[] args)
	{
	   States state = new States();   // instantiate blank state
	   System.out.println(state);
	   System.out.println();
	   
	   States Texas = new States("Texas", "mockingbird", "bluebonnet", "friendship", "Texas, Our Texas", "pecan");;
	   System.out.println(Texas);
	   System.out.println();
    }
}