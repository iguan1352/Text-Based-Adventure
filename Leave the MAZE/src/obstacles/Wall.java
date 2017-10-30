package obstacles;

import game.Person;

public class Wall extends Maze{
	
	public Wall(boolean wall, boolean sinkholes, Person[] position)
	{
		super(wall,sinkholes,position);
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

}
