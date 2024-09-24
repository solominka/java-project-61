package hexlet.code;

import java.util.Objects;
import java.util.Scanner;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.CheckEvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;

public class Engine {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int QUESTIONS_COUNT = 3;

    public static void runGame(int gameId, String userName) {
        printInstruction(gameId);
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            GameIteration it = getIteration(gameId);
            System.out.println("Question: " + it.question);
            System.out.println("Your answer: ");
            String userAnswer = SCANNER.nextLine();

            if (Objects.equals(userAnswer, it.correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + it.correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    private static void printInstruction(int gameId) {
        switch (gameId) {
            case 2:
                CheckEvenGame.printInstruction();
                break;
            case 3:
                CalculatorGame.printInstruction();
                break;
            case 4:
                GCDGame.printInstruction();
                break;
            case 5:
                ProgressionGame.printInstruction();
                break;
            default:
                throw new IllegalArgumentException("Unknown game id: " + gameId);
        }
    }

    private static GameIteration getIteration(int gameId) {
        return switch (gameId) {
            case 2 -> CheckEvenGame.getIteration();
            case 3 -> CalculatorGame.getIteration();
            case 4 -> GCDGame.getIteration();
            case 5 -> ProgressionGame.getIteration();
            default -> throw new IllegalArgumentException("Unknown game id: " + gameId);
        };
    }
}
