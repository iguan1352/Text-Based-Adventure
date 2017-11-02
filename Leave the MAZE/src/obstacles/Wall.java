package obstacles;


public class Wall extends Room
{

	public Wall(int x, int y)
	{
		super(x,y);
		this.explored = false;
		
	}

	public void print()
	{
		if(this.explored)
		{
			System.out.print("[ X ]");
		}
		else if(this.player)
		{
			System.out.print("[ P ]");
		}
	}
	
}
