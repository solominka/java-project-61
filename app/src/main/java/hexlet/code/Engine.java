package hexlet.code;

import java.util.Objects;
import java.util.Scanner;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

public class Engine {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int QUESTIONS_COUNT = 3;

    public static void runGame(int gameId, String userName) {
        printInstruction(gameId);
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            GameIteration it = getIteration(gameId);
            System.out.println("Question: " + it.getQuestion());
            System.out.println("Your answer: ");
            String userAnswer = SCANNER.nextLine();

            if (Objects.equals(userAnswer, it.getCorrectAnswer())) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + it.getCorrectAnswer() + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    private static void printInstruction(int gameId) {
        switch (gameId) {
            case EvenGame.GAME_ID:
                EvenGame.printInstruction();
                break;
            case CalculatorGame.GAME_ID:
                CalculatorGame.printInstruction();
                break;
            case GCDGame.GAME_ID:
                GCDGame.printInstruction();
                break;
            case ProgressionGame.GAME_ID:
                ProgressionGame.printInstruction();
                break;
            case PrimeGame.GAME_ID:
                PrimeGame.printInstruction();
                break;
            default:
                throw new IllegalArgumentException("Unknown game id: " + gameId);
        }
    }

    private static GameIteration getIteration(int gameId) {
        return switch (gameId) {
            case EvenGame.GAME_ID -> EvenGame.getIteration();
            case CalculatorGame.GAME_ID -> CalculatorGame.getIteration();
            case GCDGame.GAME_ID -> GCDGame.getIteration();
            case ProgressionGame.GAME_ID -> ProgressionGame.getIteration();
            case PrimeGame.GAME_ID -> PrimeGame.getIteration();
            default -> throw new IllegalArgumentException("Unknown game id: " + gameId);
        };
    }
}
