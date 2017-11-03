package people;

public class Player implements Person
{	
	private static int positionX;
	private static int positionY;
	
	public Player(int positionX, int positionY)
	{
		this.positionX = positionX;
		this.positionY = positionY;
	}

	public void setX(int x)
	{
		this.positionX = x;
		
	}
	
	public void setY(int y)
	{
		this.positionY = y;
		
	}
	
	public static int getX()
	{
		return positionX;
	}
	
	public static int getY()
	{
		return positionY;
	}

	@Override
	public int movePlayer() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
