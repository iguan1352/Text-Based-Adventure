package people;

public class Player implements Person
{	
	private int positionX;
	private int positionY;
	
	public Player(int positionX, int positionY)
	{
		this.positionX = positionX;
		this.positionY = positionY;
	}

	@Override
	public int playerLocation() 
	{
		return 0;
	}

	
}
