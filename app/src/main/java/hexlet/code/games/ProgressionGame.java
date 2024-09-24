package hexlet.code.games;

import java.util.Random;

import hexlet.code.GameIteration;

public class ProgressionGame {
    private static final Random RANDOM = new Random();
    public static final String GAME_NAME = "Progression";

    public static void printInstruction() {
        System.out.println("What number is missing in the progression?");
    }

    public static GameIteration getIteration() {
        int firstNumber = RANDOM.nextInt(100);
        int step = RANDOM.nextInt(100);
        int size = RANDOM.nextInt(5, 15);
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
