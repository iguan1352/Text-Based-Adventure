package game;
import obstacles.obstacle;

import obstacles.Maze;

public class Runner {

	public static void main(String[] args)
	{
		obstacle[][] displayMap = new obstacle[3][3];
		
		for(int i = 0; i < displayMap.length;i++)
		{
			obstacle[] row = displayMap[i];
			for(int j = 0; j < row.length; j++)
			{
				row[j] = Utilities.getRandomObstacles(null);
			}
		}
		
		/*public String getGreetings() 
		{
			return "What is your name?";
		}
		
		public String getResponse(String statement)
		{
			String response = "";
		}*/
		
	}
	
	
}
