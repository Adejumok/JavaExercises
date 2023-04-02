package chapterSix;

import java.util.Random;
import java.util.Scanner;

public class CrapsGameUtil {
    private static GameStatus gameStatus;
    private static double bankBalance = 1000;
    private static double wager;
    private static final Random randomNumbers = new Random();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CrapsGame crapsGame = new CrapsGame();


        System.out.print("Enter a wager: ");
        wager = scanner.nextDouble();

        while (wager > bankBalance){
            System.out.print("Enter a wager less or equal to the bank balance: ");
            wager = scanner.nextDouble();
        }
        crapsGame.operate();
        chatter();
        wagerBalance();
    }

    private static int chatter(){
        int chatters= 1 + randomNumbers.nextInt(4);

        switch (chatters){
            case 1:
                System.out.println("Oh, you're going for broke, huh?");
                break;
            case 2:
                System.out.println("Aw c'mon, take a chance!");
                break;
            case 3:
                System.out.println("You're up big. Now's the time to cash in your chips!");
                break;
        }

        return chatters;

    }

    private static void wagerBalance(){
        if (gameStatus == GameStatus.WON){
            bankBalance += wager;
            System.out.println("Your bank balance is: "+bankBalance);
        }
        else {
            if (gameStatus == GameStatus.LOST) {
                bankBalance -= wager;
                System.out.println("Your bank balance is: "+bankBalance);
            }
        }

        if (bankBalance ==0){
            System.out.println("Sorry. You busted!");
        }
    }
}
