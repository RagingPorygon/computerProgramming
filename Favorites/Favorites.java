class Favorites
{
	// Instance Variables
	
	private String food;
	private String color;
	private String music;
	private String automobile;
	private String sport;
	
	// Default Constructor
	
	public Favorites()
	{
	food = "";
	color = "";
	music = "";
	automobile = "";
	sport = "";
	}
	
	// Second Constructor

	public Favorites(String foods, String colors, String musics, String automobiles, String sports)
	{
		food = foods;
		color = colors;
		music = musics;
		automobile = automobiles;
		sport = sports;
	}
    // toString Method
    public String toString()
    {
    	String str;
    	str = "Food       : " + food + "\n" +
    	      "Color      : " + color + "\n" +
    	      "Music      : " + music + "\n" +
    	      "Automobile : " + automobile + "\n" +
    	      "Sport      : " + sport;
    	return str;
    }
}