package hexlet.code.games;

import java.util.Random;

import hexlet.code.Game;
import hexlet.code.model.GameIteration;

public class EvenGame implements Game {
    private static final Random RANDOM = new Random();
    public static final String GAME_NAME = "Even";
    public static final int GAME_ID = 2;

    public String getInstruction() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public GameIteration getIteration() {
        int number = RANDOM.nextInt();
        return new GameIteration(
                String.valueOf(number),
                (number % 2 == 0) ? "yes" : "no"
        );
    }
}
