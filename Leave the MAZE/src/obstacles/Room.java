package obstacles;

public abstract class Room 
{
	//public abstract String roomId();
	public boolean explored;
	public boolean player;
	private int x;
	private int y;
	
	public Room(int x, int y) 
	{
		this.x = x;
		this.y = y;
		this.explored = false;
		this.player = true;
	}

	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public abstract void print();
}
