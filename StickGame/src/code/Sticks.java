package code;

import java.util.Random;
import java.util.Scanner;

public class Sticks {

	static Scanner input = new Scanner(System.in);
	
	static Random rand = new Random();
	
	
	public static void main(String[] args) {
		
		game();
		

	}
	
	public static void game() {
		
		String playAgain = "y";
		
		
		while(playAgain.equalsIgnoreCase("y")) {
			
			System.out.println("Don't end up with the last stick!");
			System.out.println("Would you like to go first?");
			
			int numSticks = 21;
			int sticksTaken = 0;
			String answer = "";
			boolean playersTurn = false;
			answer = input.next();
			
			if(answer.equalsIgnoreCase("y")) {
				playersTurn = true;
			}
			
			while(numSticks>=0) {
				
				if(playersTurn==true) {
					
					System.out.println("There are "+numSticks+" sticks left.");
					System.out.println("\nHow many sticks would you like to take, 1 or 2?");
					
					sticksTaken = input.nextInt();
					
					if(sticksTaken>=2) {
						sticksTaken=2;
					}
					else {
						sticksTaken=1;
					}
					
					numSticks-=sticksTaken;
					
					System.out.println("\nThere are "+numSticks+" sticks left.");
					
					if(numSticks==1) {
						System.out.println("Congratulations, you won!");
						break;
					}
					else if (numSticks<=0) {
						System.out.println("Sorry, you lost!");
						break;
					}
					
					playersTurn=false;
				}
				else {
					
					int randomInt = rand.nextInt(2);
					randomInt++;
					
					if(numSticks==2) {
						numSticks--;
						System.out.println("\nThe computer took 1 stick.");
					}
					else if (numSticks==3) {
						numSticks = numSticks - 2;
						System.out.println("\nThe computer took 2 sticks.");
					}
					else {
						numSticks-=randomInt;
						System.out.println("\nThe computer took "+randomInt+" stick(s).");
					}
					
					playersTurn = true;
				}
				
			}
			
			System.out.println("Do you want to play again? (y/n)");
			playAgain = input.next();
			
			if(playAgain.equalsIgnoreCase("n")) {
				System.out.println("Thanks for playing!");
				break;
			}
			
		}
		
	}

}
