import java.util.Random;


public class Die {
/*
 * Die will probably have to go in each individual turn, so that it can pull charity status
 * from the player currently playing
 */
	public int rollDice(Boolean c) {
		Random rand = new Random();
		if (c) {
			int face = 1+rand.nextInt(12);
			return face;
			/* There needs to be something that takes charity - 1 from the player after rolling
			 * Or maybe just a simple "if charity > 0 then charity - 1 after every turn
			 */
		}
		else {
			int face = 1+rand.nextInt(6);
			return face;
		}
	}
}
