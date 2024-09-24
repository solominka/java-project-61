package hexlet.code.games;

import java.util.Random;

import hexlet.code.GameIteration;

public class GCDGame {
    private static final Random RANDOM = new Random();
    public static final String GAME_NAME = "GCD";

    public static void printInstruction() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static GameIteration getIteration() {
        int firstNumber = RANDOM.nextInt(100);
        int secondNumber = RANDOM.nextInt(100);
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
