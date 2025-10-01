package CPS410;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	public static void main(String args[])
	{
		Random random = new Random();
		int secretNumber= random.nextInt(100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		
		int guess;
		boolean guessedCorrectly = false;
		System.out.println("Guess between 1 and 100. Good luck!");
		
		while(!guessedCorrectly) {
			boolean validInput = false;
			while(!validInput) {
				System.out.print("Enter your Guess: ");
				try {
					guess = scanner.nextInt();
					validInput = true;
					if (guess < 1 || guess > 100) {
						System.out.println("Please guess a number:");
					}else if (guess < secretNumber) {
						System.out.println("Nope too low guess again:");
					
					}else if(guess > secretNumber) {
						System.out.println("Nope too high try again:");
					}else {
						System.out.println("YOU GOT IT");
						guessedCorrectly = true;
						
					}
				} catch (InputMismatchException e) {
					System.out.println("Improper input!");
					scanner.nextLine();
				}
			}
		}
	}
}