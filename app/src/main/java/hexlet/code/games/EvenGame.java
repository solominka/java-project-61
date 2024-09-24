package hexlet.code.games;

import java.util.Random;

import hexlet.code.GameIteration;

public class EvenGame {
    private static final Random RANDOM = new Random();
    public static final String GAME_NAME = "Even";
    public static final int GAME_ID = 2;

    public static void printInstruction() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    public static GameIteration getIteration() {
        int number = RANDOM.nextInt();
        return new GameIteration(
                String.valueOf(number),
                (number % 2 == 0) ? "yes" : "no"
        );
    }
}
