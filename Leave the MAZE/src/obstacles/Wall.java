package obstacles;


public class Wall implements Room{
	
	private boolean wall;
	private boolean sinkholes;

	
	public Wall(boolean wall, boolean sinkholes)
	{
		this.wall = wall;
		this.sinkholes = sinkholes;
	}

	public void print()
	{
		if(this.wall)
		{
			System.out.print("[ X ]");
		}
		else if(this.sinkholes) 
		{
			System.out.print("[ 0 ]");
		}
	}
	
	@Override
	public String roomId() 
	{
		return "w";
	}
}
