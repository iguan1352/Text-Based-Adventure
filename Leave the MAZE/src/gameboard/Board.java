package gameboard;

import obstacles.Room;
import people.Player;

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
		/*for(Room[] row : mazeMap)
        {
            for (Room room : row)
            {
            	if(player.getX()==i&&player.getY()==j)
            	{
            		System.out.print("[ i ]");
            	}
            	else
            	{
            		room.print(); //the print method is in the Wall class
            	}
            }
            System.out.println();
        }*/
		for(int i = 0; i < mazeMap.length; i++)
        {
            for (int j = 0; j < mazeMap[i].length; j++)
            {
            	if(Player.getX()==i&&Player.getY()==j)
            	{
            		System.out.print("[ i ]");
            	}
            	else
            	{
            		mazeMap[i][j].print(); //the print method is in the Wall class
            	}
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
	

