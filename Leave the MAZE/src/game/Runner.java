package game;

import obstacles.Maze;

public class Runner {

	public static void main(String[] args)
	{
		Maze[][] displayMap = new Maze[3][3];
		
		for(int i = 0; i < displayMap.length;i++)
		{
			Maze[] row = displayMap[i];
			for(int j = 0; j < row.length; j++)
			{
				row[j] = new Maze();
			}
		}
		
	}
}
