package hexlet.code;

import java.util.Objects;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.CheckEvenGame;

public class Engine {
    private static final int QUESTIONS_COUNT = 3;

    public static void runGame(int gameId, String userName) {
        printInstruction(gameId);
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            GameIterationResult result = runIteration(gameId);
            if (Objects.equals(result.userResponse, result.correctResponse)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + result.userResponse + "' is wrong answer ;(. Correct answer was '" + result.correctResponse + "'.");
                System.out.println("Let's try again, " + userName + "!");
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
            default:
                throw new IllegalArgumentException("Unknown game id: " + gameId);
        }
    }

    private static GameIterationResult runIteration(int gameId) {
        return switch (gameId) {
            case 2 -> CheckEvenGame.runIteration();
            case 3 -> CalculatorGame.runIteration();
            default -> throw new IllegalArgumentException("Unknown game id: " + gameId);
        };
    }
}
