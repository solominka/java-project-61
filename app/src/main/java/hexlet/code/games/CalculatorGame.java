package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

import hexlet.code.GameIterationResult;

public class CalculatorGame {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final char[] OPERATIONS = {'+', '-', '*'};

    public static final String GAME_NAME = "Calc";

    public static void printInstruction() {
        System.out.println("What is the result of the expression?");
    }

    public static GameIterationResult runIteration() {
        int firstNumber = RANDOM.nextInt(100);
        int secondNumber = RANDOM.nextInt(100);
        char operation = OPERATIONS[RANDOM.nextInt(3)];
        System.out.println("Question: " + firstNumber + " " + operation + " " + secondNumber);
        System.out.println("Your answer: ");
        int userAnswer = SCANNER.nextInt();
        int correctAnswer = calculateCorrectAnswer(firstNumber, secondNumber, operation);
        return new GameIterationResult(userAnswer, correctAnswer);
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
