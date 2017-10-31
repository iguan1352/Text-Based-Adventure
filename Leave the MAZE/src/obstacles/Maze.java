package obstacles;

import game.Person;

public abstract class Maze implements Room{
	
	private boolean wall;
	private boolean sinkholes;
	private Person[] position;
	
	public Maze(boolean wall, boolean sinkholes, Person[] position)
	{
		this.wall = wall;
		this.sinkholes = sinkholes;
		this.position = position;
	}
	
	public boolean wall()
	{
		return wall;
	}
	
	public boolean sinkholes()
	{
		return sinkholes;
	}
	
	/*public Person[]
	{
		return ;
	}*/
	
	public abstract void print();

	public String roomId() 
	{
		return "m";
	}
}
