package game;
import obstacles.obstacle;
import java.util.Random;

public class Utilities {
 
	public static obstacle getRandomObstacles(Person[] position)
	{
		int temp =  (int)(Math.floor(Math.random()*3));
		return new obstacle(temp, position);
	}
}
