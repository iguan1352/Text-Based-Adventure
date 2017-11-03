package game;

import java.util.Scanner;

import gameboard.Board;
import obstacles.Room;
import obstacles.Wall;
import people.Player;


public class Runner {

	public static void main(String[] args)
	{
		Room[][] map = new Room[5][5]; //change obstacle class to Room class
		Player player1 = new Player(0,0);
		
		for(int i = 0; i < map.length; i++)
		{
			Room[] row = map[i];
			for(int j = 0; j < row.length; j++)
			{
				/*if(i == 0 && j ==0)
				{
					/* put a player
				}*/

				row[j] = new Wall(i,j);
			}
		}
		
		Board mazeMap = new Board(map);
		System.out.println("Welcome to Leave the Maze." + "\nIn order to win you have to find the exit." +
				"\nOn your way, there would be walls which you would have to walk around.");
		Scanner in = new Scanner(System.in);
		//pause to get name and then display the maze
		boolean gameOn = true;
		//map[0][0].addPlayer(Player1);
		int posx = 0;
		while(gameOn)
		{
			mazeMap.printMaze(player1);
			System.out.println("You can move up, down, left, and right. Which direction do you want to move in. ");
			String direct =in.next();
			// when a player moves north for example you want to call palyer1.setX(player1.getX + 1);
			/*if(direct.toLowerCase().equals("left"))
			{
				mazeMap.getMazeMap()[player1.getX()-1][player1.getY()].explored = true;
				Player player1 = new Player(player1.getX()-1,player1.getY());?
			} add specific boundary so that the player would not be able to move out of the map*/
		}
		in.close();
		
	}
	//gameOn = false;
	/* if playerinput == "north" && ! j - 1 < 0  
	 * 	then system.out.println(array[i][ - 1].descritption;
	 */
}
