import java.util.Random;
import java.util.Scanner;

public class Task_1_Number_Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min_Range = 1;
        int max_Range = 100;
        int max_Attempts = 10;
        int score = 0;

        System.out.println("Hello..Welcome to the Number Guessing Game!\nTry your Luck");
        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(max_Range - min_Range + 1) + min_Range;
            System.out.printf("Round - Range: %d to %d\n", min_Range, max_Range);
            System.out.println("You have " + max_Attempts + " attempts.\n");

            int attempts = 0;
            boolean guessed_Correctly = false;

            while (attempts < max_Attempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                attempts++;

                if (userGuess == targetNumber) {
                    System.out.printf("Correct! You guessed the number in %d attempts.\n", attempts);
                    score += attempts;
                    guessed_Correctly = true;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low.. Please try again.\n");
                } else {
                    System.out.println("Too high! Please try again.\n");
                }
            }

            if (!guessed_Correctly) {
                System.out.println("OOPSS...You have Exhausted all your Attempts\n The correct number was-" + targetNumber);
            }

            System.out.println("Your Performance Score: " + score + "\n");

            System.out.print("You Enjoyed..Do you want to play one more round? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you.. Your final Score is: " + score);

        scanner.close();
    }
}