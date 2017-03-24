package model;
import java.util.Random;

public class Die {
/*
 * Die will probably have to go in each individual turn, so that it can pull charity status
 * from the player currently playing
 */
	public int rollOneDice()
	{
		Random rand = new Random();
		int face = 1+rand.nextInt(6);
		return face;
	}
	
	public int rollTwoDice()
	{
		Random rand = new Random();
		int face = 1+rand.nextInt(12);
		return face;
	}
	
	
	
}
