import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;
        int score = 0;
        int rounds = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attemptsLeft = maxAttempts;
            boolean userWon = false;

            System.out.println("\nRound " + (rounds + 1));
            System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ". You have " + maxAttempts + " attempts to guess it.");

            while (attemptsLeft > 0) {
                System.out.print("\nEnter your guess (Attempts left: " + attemptsLeft + "): ");
                int guess = 0;

                try {
                    guess = Integer.parseInt(scanner.nextLine());

                    if (guess < lowerBound || guess > upperBound) {
                        System.out.println("Please enter a number between " + lowerBound + " and " + upperBound + ".");
                        continue;
                    }

                    attemptsLeft--;

                    if (guess == numberToGuess) {
                        System.out.println("Congratulations! You've guessed the correct number.");
                        userWon = true;
                        score += attemptsLeft + 1;  // Points based on remaining attempts
                        break;
                    } else if (guess < numberToGuess) {
                        System.out.println("Too low! Try again.");
                    } else {
                        System.out.println("Too high! Try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                }
            }

            if (!userWon) {
                System.out.println("Sorry, you've used all your attempts. The number was " + numberToGuess + ".");
            }

            rounds++;
            System.out.println("Your score: " + score + " points after " + rounds + " rounds.");

            System.out.print("\nWould you like to play another round? (yes/no): ");
            String playAgain = scanner.nextLine().trim().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thank you for playing! Goodbye!");
                break;
            }
        }

        scanner.close();
    }
}