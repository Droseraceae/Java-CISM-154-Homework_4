import java.util.Random;

/**
 * Create a program that simulates flipping a coin.
 * 
 * Use a Random object to get two values (perhaps 0 and 1) where each value
 * represents either Heads or Tails.
 * 
 * Simulate ten coin flips.
 * 
 * @author Josh Alcoba
 */
public class CoinToss {

	public static void main(String[] args) {

		Random rng = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println((rng.nextInt(2) == 1) ? "Heads" : "Tails");
		}

		/***
		 * SAMPLE OUTPUT ***
		 * 
		 * Heads 
		 * Heads 
		 * Tails 
		 * Heads 
		 * Tails 
		 * Tails 
		 * Heads 
		 * Heads 
		 * Heads 
		 * Tails
		 * 
		 */

	}

}
