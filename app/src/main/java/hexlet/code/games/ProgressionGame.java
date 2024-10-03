package hexlet.code.games;

import java.util.Random;

import hexlet.code.Game;
import hexlet.code.model.GameIteration;

public final class ProgressionGame implements Game {
    private static final Random RANDOM = new Random();
    public static final String GAME_NAME = "Progression";
    public static final int GAME_ID = 5;
    public static final int MAX = 100;
    public static final int MIN_SIZE = 5;
    public static final int MAX_SIZE = 15;

    public String getInstruction() {
        return "What number is missing in the progression?";
    }

    public GameIteration getIteration() {
        int firstNumber = RANDOM.nextInt(MAX);
        int step = RANDOM.nextInt(MAX);
        int size = RANDOM.nextInt(MIN_SIZE, MAX_SIZE);
        int hiddenIndex = RANDOM.nextInt(0, size);
        StringBuilder question = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i == hiddenIndex) {
                question.append("..");
            } else {
                question.append(firstNumber + step * i);
            }
            if (i != size - 1) {
                question.append(" ");
            }
        }
        return new GameIteration(
                question.toString(),
                firstNumber + step * hiddenIndex
        );
    }
}
