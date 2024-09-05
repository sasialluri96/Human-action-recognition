import java.util.Random;
import java.util.Scanner;

public class DesignGuessingNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Define the range for the random number
        final int MIN = 1;
        final int MAX = 100;

        // Generate a random number between MIN and MAX (inclusive)
        int numberToGuess = random.nextInt(MAX - MIN + 1) + MIN;

        int userGuess = 0;
        int numberOfTries = 0;

        System.out.println("Guess the number between " + MIN + " and " + MAX + ":");

        while (userGuess != numberToGuess) {
            System.out.print("Your guess: ");
            userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < MIN || userGuess > MAX) {
                System.out.println("Please enter a number between " + MIN + " and " + MAX + ".");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! It took you " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}
