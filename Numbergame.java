import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int min = 1; 
        int max = 100; 
        boolean playAgain = true;
        int score = 0; 

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int randomNumber = (int) (Math.random() * (max - min + 1)) + min; 
            int atte = 5; 
            boolean correct = false;

            System.out.println("\nA number has been generated between " + min + " and " + max + ".");
            System.out.println("You have " + atte + " atte to guess the number.");

            while (atte > 0) {
                System.out.print("\nEnter your guess: ");
                int guess = obj.nextInt();

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    correct = true;
                    score++;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("\nToo low! Try again.");
                } else {
                    System.out.println("\nToo high! Try again.");
                }

                atte--;
                if (atte > 0) {
                    System.out.println("You have " + atte + " atte left.");
                }
            }

            if (!correct) {
                System.out.println("You've run out of atte. The correct number was: " + randomNumber);
            }

            System.out.println("Your current score is: " + score);

            // Ask if the user wants to play again
            System.out.print("Do you want to play another round? (yes/no): ");
            String response = obj.next().toLowerCase();
            if (!response.equals("yes")) {
                playAgain = false;
                System.out.println("Thank you for playing! Your final score is: " + score);
            }
        }
    }
}