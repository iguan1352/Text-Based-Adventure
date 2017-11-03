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

	public void setX(int x)
	{
		this.positionX = x;
		
	}
	
	public void setY(int y)
	{
		this.positionY = y;
		
	}
	
	public int getX()
	{
		return this.positionX;
	}
	
	public int getY()
	{
		return this.positionY;
	}

	@Override
	public int movePlayer() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
