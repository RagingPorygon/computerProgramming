class States
{
	// Instance Variables


	//fix this all to name, bird, etc...........
	private String stateName;
	private String stateBird;
	private String stateFlower;
	private String stateMotto;
	private String stateSong;
	private String stateTree;
	
	// Default Constructor
	
	public States()
	{	
		stateName = "";
		stateBird = "";
		stateFlower = "";
		stateMotto = "";
		stateSong = "";
		stateTree = "";
	}
	
	// Second Constructor

	public States(String name, String bird, String flower, String motto, String song, String tree)
	{
		name = stateName;
		bird = stateBird;
		flower = stateFlower;
		motto = stateMotto;
		song = stateSong;
		tree = stateTree;
	}
    
    // toString method
    public String toString()
    {
    	String str;
    	str = "Name:   " + name + "\n" +
    	      "Bird:   " + bird + "\n" +
    	      "Flower: " + flower + "\n" +
    	      "Motto:  " + motto + "\n" +
    	      "Song:   " + song + "\n" +
    	      "Tree:   " + tree + "\n";
    	return str;
    }
}
