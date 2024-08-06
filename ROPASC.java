import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] rps = {"Rock", "Paper", "Scissors"};
        String computerMove;
        String playerMove;

        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("What's your name?");
        String playerName = scanner.nextLine();

        System.out.println("Hello, " + playerName + "! Let's play Rock-Paper-Scissors.");
        System.out.println("Enter your move (Rock, Paper, Scissors). To exit the game, type \"exit\".");

        while (true) {
            System.out.print("Your move: ");
            playerMove = scanner.nextLine();

            if (playerMove.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing, " + playerName + "! Goodbye!");
                break;
            }

            if (!playerMove.equalsIgnoreCase("Rock") && 
                !playerMove.equalsIgnoreCase("Paper") && 
                !playerMove.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid move, please try again.");
                continue;
            }

            int compIndex = random.nextInt(3);
            computerMove = rps[compIndex];

            System.out.println("Computer's move: " + computerMove);

            if (playerMove.equalsIgnoreCase(computerMove)) {
                System.out.println("It's a tie!");
            } else if (playerMove.equalsIgnoreCase("Rock")) {
                if (computerMove.equalsIgnoreCase("Scissors")) {
                    System.out.println("Rock crushes Scissors. You win!");
                } else {
                    System.out.println("Paper covers Rock. You lose!");
                }
            } else if (playerMove.equalsIgnoreCase("Paper")) {
                if (computerMove.equalsIgnoreCase("Rock")) {
                    System.out.println("Paper covers Rock. You win!");
                } else {
                    System.out.println("Scissors cut Paper. You lose!");
                }
            } else if (playerMove.equalsIgnoreCase("Scissors")) {
                if (computerMove.equalsIgnoreCase("Paper")) {
                    System.out.println("Scissors cut Paper. You win!");
                } else {
                    System.out.println("Rock crushes Scissors. You lose!");
                }
            }

            System.out.println("Would you like to play again? (yes/no)");
            String playAgain = scanner.nextLine();
            if (playAgain.equalsIgnoreCase("no")) {
                System.out.println("Thanks for playing, " + playerName + "! Goodbye!");
                break;
            }
        }

        scanner.close();
    }
}
