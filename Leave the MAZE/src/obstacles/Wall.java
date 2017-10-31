package obstacles;

import game.Person;

public class Wall implements Room{
	
	private boolean wall;
	private boolean sinkholes;
	private Person[] position;
	
	public Wall(boolean wall, boolean sinkholes, Person[] position)
	{
		this.wall = wall;
		this.sinkholes = sinkholes;
		this.position = position;
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
