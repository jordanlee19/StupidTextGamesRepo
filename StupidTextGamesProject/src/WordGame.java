import java.util.Random;
import java.util.Scanner;

// Written by Jordan Lee :)

public class WordGame implements StupidTextGame {
	
	public String getName() {
		return "DiceRoll";
	}
	
	public void play(Scanner console) {
		Random dice = new Random();
		int one = dice.nextInt(5) + 1;
		int two = dice.nextInt(5) + 1;
		if (one + two == 12) {
			System.out.println("You rolled a 12! Perfect!");
		} else if (one + two == 2) {
			System.out.println("You rolled snake eyes. Ssssss!");
		} else if (one == two) {
			System.out.println("You rolled double " + one +"s!");
		} else {
			System.out.println("Interesting, you rolled " + one + " and " + two + "! That adds up to " + (one + two) + "! That's the square root of " + ((one + two)*(one + two) + "."));
		}
	}
}