package code;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
	
	public static int amountOfGuesses;
	public static int max = 100;
	
	static Scanner input = new Scanner(System.in);
	static Scanner total = new Scanner(System.in);
	static Random random = new Random();
	
	public static void main(String[] args) {
		
		GuessMyNumber.game(max);
		
		
		

	}
	
	public static void game(int max) {
		
		int randInt = random.nextInt(max);
		System.out.println("How many guesses do you need to Guess My Number? ");
		amountOfGuesses = total.nextInt();
		
		System.out.println("You have "+amountOfGuesses+" guesses. Guess a number between 1 and 100, with no decimals.");
		int userGuess = input.nextInt();
		
		do {
			
			amountOfGuesses--;
			
			if(userGuess<randInt) {
				System.out.println("Too low, guess again. Guesses remaining: "+amountOfGuesses);
				userGuess=input.nextInt();
			}else if (userGuess>randInt) {
				System.out.println("Too high, guess again. Guesses remaining: "+amountOfGuesses);
				userGuess=input.nextInt();
			}
			
		} while (userGuess!=randInt && amountOfGuesses>1);
		
		if(userGuess==randInt) {
			win(amountOfGuesses);
		}else {
			lose();
		}
		
	}
	
	private static void win(int amountOfGuesses) {
		System.out.println("Congratulations! You won with "+amountOfGuesses+" guesses left!");
	}
	
	private static void lose() {
		System.out.println("Oh no! You've run out of guesses!");
	}

}
