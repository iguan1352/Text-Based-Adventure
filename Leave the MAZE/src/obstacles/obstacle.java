package obstacles;

import game.Person;

public class obstacle implements Room{
	
	private String obstacle;
	private Person[] position;
	
	public obstacle(int obstacle, Person[] position)
	{
		if(obstacle ==0)
		{
			this.obstacle = "wall";
		}
		else if(obstacle == 1)
		{
			this.obstacle = "sinkhole";
		}
		else 
		{
			this.obstacle = "empty";
		}
		this.position = position;
	}
	
	public String returnObstacle()
	{
		return this.obstacle;
	}
	//public abstract void print();

	public String roomId() 
	{
		return "m";
	}
	
	//public abstract void print();
}
