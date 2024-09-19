package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.CheckEvenGame;

public class App {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("2 - " + CheckEvenGame.GAME_NAME);
        System.out.println("1 - Greet");
        System.out.println("0 - Exit");
        int chosenGameNumber = SCANNER.nextInt();
        System.out.println("Your choice: " + chosenGameNumber);
        switch (chosenGameNumber) {
            case 0:
                break;
            case 1:
                Cli.greetUserAndReturnName();
                break;
            case 2:
                String userName = Cli.greetUserAndReturnName();
                CheckEvenGame.runGame(userName);
                break;
            default:
                System.out.println("There is no option " + chosenGameNumber + ", try again");
        }
    }
}
