class Assignment
{
   // Instance Variables
   
   
   private String type;
   private String name;
   private int score;
  
   // Constructors
   
   public Assignment()
   {
   	type = "";
   	name = "";
   	score = 0;
   }
  
   public Assignment(String types, String names, int scores)
   {
   	name = names;
   	type = types;
   	score = scores;
   }
   
   // Mutator Methods
   
   public void setName(String n)
   {
   	 name = n;
   }
   
   public void setType(String t)
   {
   	type = t;
   }
   
   public void setScore(int s)
   {
   	score = s;
   }
   
   // Accessor Methods

	public String getName()
	{
		return name;
	}
	
	public String getType()
	{
		return type;
	}
	
	public int getScore()
	{
		return score;
	}

   //getLetterGrade
   
   public String getLetterGrade()
   {
   	String letter = "F";
   	
   	if(score >= 90)
   	{
   		letter = "A";
   	}
   	
   	else if(score >= 80)
   	{
   		letter = "B";
   	}
   	
   	else if(score >= 70)
   	{
   		letter = "C";
   	}
   	
   	else if(score >= 60)
   	{
   		letter = "D";
   	}
   	
   	else
   	{
   		letter = "F";
   	}
   	return letter;
   }

   // toString Method
	
	public String toString()
	{
		String str;
		str = "Type         : " + type + "\n" +
		"Name         : " + name + "\n" +
		"Score        : " + score + "\n" +
		"Letter Grade : " + getLetterGrade() + "\n";
		return str;
	}

}