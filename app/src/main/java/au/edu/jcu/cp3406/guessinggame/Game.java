package au.edu.jcu.cp3406.guessinggame;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random randomno = new Random();
        int numberToGuess = randomno.nextInt(10);
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (win == false) {
            System.out.println("Guess a number between 1 and 10: ");
            guess = input.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is to high");
            }
        }
        System.out.println("You Win!");
        System.out.println("The number was " + numberToGuess);
        System.out.println("It took you " + numberOfTries + " tries");
    }
    Random random = new Random();
    int numberToGuess = random.nextInt(10)+1;

    public boolean check(int i) {
        return i == numberToGuess;
    }
}
