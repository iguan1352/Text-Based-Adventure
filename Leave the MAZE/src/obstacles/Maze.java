package obstacles;

public abstract class Maze implements Room{
	
	private boolean wall;
	private boolean sinkholes;
	private int x;
	private int y;
	
	
	public Maze(boolean wall, boolean sinkholes)
	{
		this.wall = wall;
		this.sinkholes = sinkholes;
	}
	
	public boolean wall()
	{
		return wall;
	}
	
	public boolean sinkholes()
	{
		return sinkholes;
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

	public String roomId() 
	{
		return "m";
	}
}
