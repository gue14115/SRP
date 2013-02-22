package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class SRP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char compPlay = 0;
		char userInput = 0;
		char oldInput = 'e';
		int userScore = 0;
		int compScore = 0;
		Random r = new Random();
		while (userInput != 'e') {
			switch (r.nextInt(3)) {
			case 0:
				compPlay = 'S';
				break;
			case 1:
				compPlay = 'R';
				break;
			case 2:
				compPlay = 'P';
				break;
			}
			try {
				BufferedReader in = new BufferedReader(new InputStreamReader(
						System.in));
				userInput = in.readLine().charAt(0);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(StringIndexOutOfBoundsException e){
				userInput = oldInput;
			}
			oldInput = userInput;
			if (userInput != 'k') {
				if (userInput != 'e')
					System.out.println("You played " + userInput
							+ " and the computer played " + compPlay);

				switch (userInput) {
				case 's':
					switch (compPlay) {
					case 'S':
						System.out.println("It's a draw.");
						break;
					case 'R':
						compScore += 1;
						System.out.println("Computer wins.");
						break;
					case 'P':
						userScore += 1;
						System.out.println("User wins.");
						break;
					}
					break;
				case 'r':
					switch (compPlay) {
					case 'S':
						userScore += 1;
						System.out.println("User wins.");
						break;
					case 'R':
						System.out.println("It's a draw.");
						break;
					case 'P':
						compScore += 1;
						System.out.println("Computer wins.");
						break;
					}
					break;
				case 'p':
					switch (compPlay) {
					case 'S':
						compScore += 1;
						System.out.println("Computer wins.");
						break;
					case 'R':
						userScore += 1;
						System.out.println("User wins.");
						break;
					case 'P':
						System.out.println("It's a draw.");
						break;
					}
					break;
				}
			} else
				System.out.println("User:" + userScore + "\nComputer:"
						+ compScore);
		}
	}

}
