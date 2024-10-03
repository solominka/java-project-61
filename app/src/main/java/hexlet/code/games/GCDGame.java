package hexlet.code.games;

import java.util.Random;

import hexlet.code.Game;
import hexlet.code.model.GameIteration;

public final class GCDGame implements Game {
    private static final Random RANDOM = new Random();
    public static final String GAME_NAME = "GCD";
    public static final int GAME_ID = 4;
    public static final int MAX = 100;

    public String getInstruction() {
        return "Find the greatest common divisor of given numbers.";
    }

    public GameIteration getIteration() {
        int firstNumber = RANDOM.nextInt(MAX);
        int secondNumber = RANDOM.nextInt(MAX);
        return new GameIteration(
                firstNumber + " " + secondNumber,
                findGCD(firstNumber, secondNumber)
        );
    }

    private static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
