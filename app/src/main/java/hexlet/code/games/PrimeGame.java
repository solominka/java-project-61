package hexlet.code.games;

import java.util.Random;

import hexlet.code.GameIteration;

public class PrimeGame {
    private static final Random RANDOM = new Random();
    public static final String GAME_NAME = "Prime";
    public static final int GAME_ID = 6;
    public static final int MAX = 100;

    public static void printInstruction() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static GameIteration getIteration() {
        int number = RANDOM.nextInt(MAX);
        return new GameIteration(
                String.valueOf(number),
                isPrime(number) ? "yes" : "no"
        );
    }

    private static boolean isPrime(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
