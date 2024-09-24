package hexlet.code.games;

import java.util.Random;

import hexlet.code.GameIteration;

public class CalculatorGame {
    private static final Random RANDOM = new Random();
    private static final char[] OPERATIONS = {'+', '-', '*'};

    public static final String GAME_NAME = "Calc";

    public static void printInstruction() {
        System.out.println("What is the result of the expression?");
    }

    public static GameIteration getIteration() {
        int firstNumber = RANDOM.nextInt(100);
        int secondNumber = RANDOM.nextInt(100);
        char operation = OPERATIONS[RANDOM.nextInt(3)];
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
