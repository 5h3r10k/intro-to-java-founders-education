package code;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	
	public static int wins = 0;
	public static int losses = 0;
	public static int ties = 0;
	
	public static String userChoice;
	public static String compChoice;
	
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		while(wins!=2 && losses!=2) {
			
			System.out.println("Rock, Paper, or Scissors?");
			userChoice = input.nextLine().toUpperCase();
			System.out.println("You chose "+ userChoice);
			
			int rn = rand.nextInt(3)+1;
			
			if(rn==1) {
				compChoice="ROCK";
			}else if (rn==2) {
				compChoice="PAPER";
			}else if (rn==3) {
				compChoice="SCISSORS";
			}
			
			System.out.println("The computer chose "+compChoice);
			
			if(userChoice.equals(compChoice)) {
				ties++;
			}
			
			if(userChoice.equals("ROCK")) {
				
				if(compChoice.equals("PAPER")) {
					losses++;
				}else if (compChoice.equals("SCISSORS")) {
					wins++;
				}
				
			}else if (userChoice.equals("PAPER")) {
				
				if(compChoice.equals("ROCK")) {
					wins++;
				}else if (compChoice.equals("SCISSORS")) {
					losses++;
				}
				
			}else if (userChoice.equals("SCISSORS")) {
				
				if(compChoice.equals("PAPER")) {
					wins++;
				}else if (compChoice.equals("ROCK")) {
					losses++;
				}
				
			}
			
		}
		

		if(wins==2) {
			System.out.println("YOU WON! FINAL SCORE: "+wins+"-"+losses);
		} else if (losses==2) {
			System.out.println("YOU LOST! FINAL SCORE: "+losses+"-"+wins);
		}

		input.close();
	}

}
