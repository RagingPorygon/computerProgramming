public class Television
{
	// constants
	public final int MAX_CHANNEL = 100;
	public final int MIN_CHANNEL = 1;
	public final int MAX_VOLUME  = 10;
	public final int MIN_VOLUME  = 1;
	public final int DEFAULT_CHANNEL = 3;
	public final int DEFAULT_VOLUME  = 5;
	
	// instance variables
	private int channel;
	private int volume;
	
	// constructors
	public Television()
	{
		channel = DEFAULT_CHANNEL;
		volume = DEFAULT_VOLUME;
	}
	
	public Television(int c, int v)
	{
		channel = c;
		volume = v;
	}
	
	// mutator methods
	public void increaseChannel()
	{
		channel++;
		
		if(channel > MAX_CHANNEL)
		{
			channel = MIN_CHANNEL;
		}
	}
	
	public void decreaseChannel()
    {
    	channel--;
		
		if(channel < MIN_CHANNEL)
		{
			channel = MAX_CHANNEL;
		}
    }
    
    public void increaseVolume()
    {
    	if(volume < MAX_VOLUME)
    	{
    		volume++;
    	}
    }
    
    public void decreaseVolume()
    {
    	if(volume > MIN_VOLUME)
    	{
    		volume--;
    	}
    }
    
    public void selectChannel(int c)
	{
		if(c <= MAX_CHANNEL && c >= MIN_CHANNEL)
		{
			channel = c;
		}
	}
    
    // accessor methods
    public int getChannel()
    {
    	return channel;
    }
    
    public int getVolume()
    {
    	return volume;
    }
    
    
}