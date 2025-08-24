package rockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String[] choices = {"rock", "paper", "scissors"};
		String playerChoice;
		String computerChoice;
		
		String playAgain = "yes";
		
		
		
		// ROCK PAPER SCISSORS
		//DECLARE VARIABLES
		//GET CHOICE FROM THE USER
		do {
			System.out.println("Enter your move (rock, paper, scissors): ");
			playerChoice = scanner.nextLine().toLowerCase();
			
			if(!playerChoice.equals("rock") && 
			     !playerChoice.equals("paper") &&
			       !playerChoice.equals("scissors")) {
				System.out.println("Invalid choice");
			}
			//GET RANDOM CHOICE FOR THE COMPUTER
			
			computerChoice = choices[random.nextInt(3)];//with the random object generating random number as the index
			System.out.println("Computer choice: " + computerChoice);
			//CHECK WIN CONDITIONS
			/*
			if(playerChoice.equals(computerChoice)) { //comparing 2 strings reference data type is ".equals method", cant use "==" comparing memory address. 
				System.out.println("It's a tie!");
			}
			else if(playerChoice.equals("rock") && computerChoice.equals("scissors")) {
				System.out.println("You win!");
			}
			else if(computerChoice.equals("paper") && computerChoice.equals("rock")) {
				System.out.println("You win!");
			}
			else if(computerChoice.equals("scissors") && computerChoice.equals("paper")) {
				System.out.println("You win!");
			}
			else {
				System.out.println("You lose!");
			}*/
			//IMPROVISED
			if(playerChoice.equals(computerChoice)) { //comparing 2 strings reference data type is ".equals method", cant use "==" comparing memory address. 
				System.out.println("It's a tie!");
			}
			else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) || 
			       (playerChoice.equals("paper") && computerChoice.equals("rock")) || 
			       playerChoice.equals("scissors") && computerChoice.equals("paper"))
	        {
				System.out.println("You win!");
				continue;
			}
			else {
				System.out.println("You lose!");
			}
			
			System.out.println("Play again (yes/no): ");
			playAgain = scanner.nextLine().toLowerCase();
		}while(playAgain.equals("yes"));
		
		System.out.println("Thanks for playing!");
		
		
		//ASK TO PLAY AGAIN
		//GOODBYE MESSAGE
		scanner.close();

	}

}
