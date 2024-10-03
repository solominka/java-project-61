package hexlet.code;

import java.util.Objects;
import java.util.Scanner;

import hexlet.code.model.GameIteration;

public class Engine {
    public static final int QUESTIONS_COUNT = 3;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void runGame(Game game) {
        System.out.print("May I have your name? ");
        String userName = SCANNER.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(game.getInstruction());

        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            GameIteration it = game.getIteration();
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
}
