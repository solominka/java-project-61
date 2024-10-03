package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.ProgressionGame;

public class App {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - " + EvenGame.GAME_NAME);
        System.out.println("3 - " + CalculatorGame.GAME_NAME);
        System.out.println("4 - " + GCDGame.GAME_NAME);
        System.out.println("5 - " + ProgressionGame.GAME_NAME);
        System.out.println("6 - " + PrimeGame.GAME_NAME);
        System.out.println("0 - Exit");
        int chosenGameId = SCANNER.nextInt();
        System.out.println("Your choice: " + chosenGameId);

        switch (chosenGameId) {
            case 0:
                break;
            case 1:
                Cli.greetUser();
                break;
            case EvenGame.GAME_ID:
                Engine.runGame(new EvenGame());
                break;
            case CalculatorGame.GAME_ID:
                Engine.runGame(new CalculatorGame());
                break;
            case GCDGame.GAME_ID:
                Engine.runGame(new GCDGame());
                break;
            case ProgressionGame.GAME_ID:
                Engine.runGame(new ProgressionGame());
                break;
            case PrimeGame.GAME_ID:
                Engine.runGame(new PrimeGame());
                break;
            default:
                System.out.println("Sorry, could not find game by number " + chosenGameId + ", try again");
                break;
        }
    }
}
