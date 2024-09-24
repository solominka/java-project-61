package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.CheckEvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;

public class App {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - " + CheckEvenGame.GAME_NAME);
        System.out.println("3 - " + CalculatorGame.GAME_NAME);
        System.out.println("4 - " + GCDGame.GAME_NAME);
        System.out.println("5 - " + ProgressionGame.GAME_NAME);
        System.out.println("0 - Exit");
        int chosenGameId = SCANNER.nextInt();
        System.out.println("Your choice: " + chosenGameId);
        switch (chosenGameId) {
            case 0:
                break;
            case 1:
                Cli.greetUserAndReturnName();
                break;
            case 2, 3, 4, 5:
                String userName = Cli.greetUserAndReturnName();
                Engine.runGame(chosenGameId, userName);
                break;
            default:
                System.out.println("There is no option " + chosenGameId + ", try again");
        }
    }
}
