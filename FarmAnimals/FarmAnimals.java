class FarmAnimals
{
	// Instance Variables
	
	private String name;
	private int cows;
	private int horses;
	private int pigs;
	private int chickens;
	
	// Default Constructor
	
	public FarmAnimals()
	{
		name = "";
		cows = 0;
		horses = 0;
		pigs = 0;
		chickens = 0;
	}
	
	// Second Constructor
	
	public FarmAnimals(String n, int c, int h, int p, int ch)
	{
		name = n;
		cows = c;
		horses = h;
		pigs = p;
		chickens = ch;
	}
	
	
    // toString Method - automatically called by println method
    public String toString()
	{
		String str;
		str = "Name     : " + name + "\n" +
		      "Cows     : " + cows + "\n" +
		      "Horses   : " + horses + "\n" +
		      "Pigs     : " + pigs + "\n" +
		      "Chickens : " + chickens;
		return str;
    }
}