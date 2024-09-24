package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import hexlet.code.GameIterationResult;

public class CheckEvenGame {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    public static final String GAME_NAME = "Even";

    public static void printInstruction() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
    }

    public static GameIterationResult runIteration() {
        int number = RANDOM.nextInt();
        System.out.println("Question: " + number);
        System.out.println("Your answer: ");
        String userAnswer = SCANNER.nextLine();
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";
        return new GameIterationResult(userAnswer, correctAnswer);
    }
}
