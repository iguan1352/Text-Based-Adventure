package gameboard;

import obstacles.Maze;

public class Board {

	private Maze[][] mazeMap;
	
	public Board(Maze[][] mazeMap)
	{
		this.mazeMap = mazeMap;
	}
	
	public void printMaze()
	{
		for(Maze[] row : mazeMap)
        {
            for (Maze room : row)
            {
                room.print(); //the print method is in the Wall class
            }
            System.out.println();
        }
	}
	
	public Maze[][] getMazeMap() 
	{
        return mazeMap;
	}
	
}
	

