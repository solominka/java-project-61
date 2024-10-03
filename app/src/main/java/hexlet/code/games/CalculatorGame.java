package hexlet.code.games;

import java.util.Random;

import hexlet.code.Game;
import hexlet.code.model.GameIteration;

public final class CalculatorGame implements Game {
    private static final Random RANDOM = new Random();
    private static final char[] OPERATIONS = {'+', '-', '*'};

    public static final String GAME_NAME = "Calc";
    public static final int GAME_ID = 3;
    public static final int MAX = 100;

    public String getInstruction() {
        return "What is the result of the expression?";
    }

    public GameIteration getIteration() {
        int firstNumber = RANDOM.nextInt(MAX);
        int secondNumber = RANDOM.nextInt(MAX);
        char operation = OPERATIONS[RANDOM.nextInt(OPERATIONS.length)];
        return new GameIteration(
                firstNumber + " " + operation + " " + secondNumber,
                calculateCorrectAnswer(firstNumber, secondNumber, operation)
        );
    }

    private static int calculateCorrectAnswer(int firstNumber, int secondNumber, char operation) {
        return switch (operation) {
            case '+' -> firstNumber + secondNumber;
            case '-' -> firstNumber - secondNumber;
            case '*' -> firstNumber * secondNumber;
            default -> throw new IllegalStateException("Unexpected value: " + operation);
        };
    }
}
