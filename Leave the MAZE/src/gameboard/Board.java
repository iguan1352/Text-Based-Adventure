package gameboard;

import obstacles.Room;

public class Board 
{

	private Room[][] mazeMap;
	
	public Board(Room[][] mazeMap)
	{
		this.mazeMap = mazeMap;
	}
	
	public void printMaze()
	{
		//for each row in room there are x amount of rooms under each row
		for(Room[] row : mazeMap)
        {
            for (Room room : row)
            {
                room.print(); //the print method is in the Wall class
            }
            System.out.println();
        }
	}
	
	public Room[][] getMazeMap() 
	{
        return mazeMap;
	}
	
	public void setMaze(Room[][] mazeMap)
	{
		this.mazeMap = mazeMap;
	}
}
	

