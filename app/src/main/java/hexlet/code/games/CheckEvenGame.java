package hexlet.code.games;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class CheckEvenGame {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final int QUESTIONS_COUNT = 3;

    public static final String GAME_NAME = "Even";

    public static void runGame(String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'");
        for (int i = 0; i < QUESTIONS_COUNT; i++) {
            int number = RANDOM.nextInt();
            System.out.println("Question: " + number);
            System.out.println("Your answer: ");
            String userAnswer = SCANNER.nextLine();
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";
            if (Objects.equals(userAnswer, correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer
                        + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
