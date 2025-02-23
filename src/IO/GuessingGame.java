package IO;

import java.util.Random; // Importing Random class from java.util package
import java.util.Scanner; // Importing Scanner class from java.util package

/* Create public class GuessingGame */
public class GuessingGame {
    /* Create main method */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        Random rand = new Random(); // Create Random object
        boolean playAgain = true; // Create boolean variable and set it to true

        /* Create while loop to play the game */
        while (playAgain) {
            int number = rand.nextInt(100); // Generate random number between 0 - 99
            int guessCount = 0; // Create integer variable and set it to 0
            int maxCount = 5; // Create integer variable and set it to 5
            boolean guessedCorrectly = false; // Create boolean variable and set it to false

            System.out.println("Guess a number between 0 - 99!\nYou have " + maxCount + " tries");

            /* Create while loop to get user input */
            while (guessCount < maxCount) {
                System.out.print("Enter your guess number: ");
                int guess = scanner.nextInt(); // Get user input
                guessCount++; // Increment guessCount

                /* Create if statement to check if user guess is correct */
                if (guess == number) {
                    System.out.println("Correct! You can guessed the number in " + guessCount + " tries");
                    guessedCorrectly = true; // Set guessedCorrectly to true
                    break; // Break the loop
                } else { // If user guess is wrong
                    System.out.println("Wrong guess!");
                    /*
                     * Create if statement to check if user guess is higher or lower than the number
                     */
                    if (guess > number) {
                        System.out.println("Too high!");
                    } else { // If user guess is lower than the number
                        System.out.println("Too low!");
                    }
                }
            }
            /* Create if statement to check if user guessed the number uncorrectly */
            if (!guessedCorrectly) {
                System.out.println("You lose! The number is " + number);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next().toLowerCase(); // Get user input and convert it to lowercase
            playAgain = response.equals("yes"); // Set playAgain to true if user input is "yes"

            System.out.println("\n-----------------------------\n");
        }

        System.out.println("Thanks you for playing!");
        scanner.close();

    }

}
