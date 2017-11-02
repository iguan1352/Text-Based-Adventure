package game;

import java.util.Scanner;

import gameboard.Board;
import obstacles.Room;
import obstacles.Wall;



public class Runner {

	public static void main(String[] args)
	{
		Room[][] map = new Room[3][3]; //change obstacle class to Room class
		
		for(int i = 0; i < map.length; i++)
		{
			Room[] row = map[i];
			for(int j = 0; j < row.length; j++)
			{
				row[j] = new Wall(i,j);
			}
		}
		
		Board mazeMap = new Board(map);
		System.out.println("Welcome to Leave the Maze." + "\nIn order to win you have to find the exit." +
				"\nOn your way, there would be walls which you would have to walk around it.");
		System.out.println("To start the game, please tell me your name.");
		Scanner in = new Scanner(System.in);
		boolean gameOn = true;
		while(gameOn)
		{
			mazeMap.printMaze();
			
			in.close();
		}
		
	}
	
	
}
