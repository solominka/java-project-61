package hexlet.code.games;

import java.util.Random;

import hexlet.code.Game;
import hexlet.code.model.GameIteration;

public final class PrimeGame implements Game {
    private static final Random RANDOM = new Random();
    public static final String GAME_NAME = "Prime";
    public static final int GAME_ID = 6;
    public static final int MAX = 100;

    public String getInstruction() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public GameIteration getIteration() {
        int number = RANDOM.nextInt(MAX);
        return new GameIteration(
                String.valueOf(number),
                isPrime(number) ? "yes" : "no"
        );
    }

    private static boolean isPrime(int x) {
        if (x <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
