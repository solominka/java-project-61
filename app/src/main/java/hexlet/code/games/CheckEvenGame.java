package hexlet.code.games;

import java.util.Random;

import hexlet.code.GameIteration;

public class CheckEvenGame {
    private static final Random RANDOM = new Random();
    public static final String GAME_NAME = "Even";

    public static void printInstruction() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
    }

    public static GameIteration getIteration() {
        int number = RANDOM.nextInt();
        System.out.println("Question: " + number);
        System.out.println("Your answer: ");
        return new GameIteration(
                String.valueOf(number),
                (number % 2 == 0) ? "yes" : "no"
        );
    }
}
