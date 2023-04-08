package Lesson5;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    private static Scanner input = new Scanner(System.in);


    private static void pvpGame(String[] gameField){
        int coord = 0;
        int turns = 8;
        String symbol = "X";

        System.out.println("It's PvP");
        while (turns > 0){
            if(victoryChecker(gameField)){
                break;
            }
            else{
                showGameField(gameField);
                System.out.println("it's " + symbol + "'s turn");

                while (true) {
                    System.out.println("Choose number from 1 to 9 as coordinates");
                    try {
                        coord = input.nextInt();
                        break;
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Invalid input");
                        input.next();
                        continue;
                    }
                }
                if(!gameField[coord-1].equals("*") && coord > 0 && coord < 10){
                   System.out.println("This coord is already used");
                }
                else if (coord > 0 && coord < 10){
                    gameField[coord-1] = symbol;
                    if (symbol.equals("X")){
                        symbol = "O";
                    }
                    else{
                        symbol = "X";
                    }
                    turns--;
                    break;
                }
                else{
                    System.out.println("wrong coord");
                }
            }
        }
    }




    private static void pveGame(String[] gameField){
        System.out.println("PvE");
        showGameField(gameField);
    }





    private static void showGameField(String[] gameField){
        System.out.println(gameField[0] + "|" + gameField[1] + "|" + gameField[2]);
        System.out.println("-----");
        System.out.println(gameField[3] + "|" + gameField[4] + "|" + gameField[5]);
        System.out.println("-----");
        System.out.println(gameField[7] + "|" + gameField[7] + "|" + gameField[8]);

    }



    public static void main(String[] args){
        String[] gameField = new String[9];
        Arrays.fill(gameField, "*");  //Arrays.fill is used for filling massive with symbols

        while (true) {
            int number;

            System.out.println("Please choose game mode, 1 for PvP, 2 for PvE");
            System.out.print("You chose- ");
            try {
                number = input.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input");
                input.next();
                continue;
            }
            if (number == 1) {
                pvpGame(gameField);
                break;
            } else if (number == 2) {
                pveGame(gameField);
                break;
            } else {
                System.out.println("Invalid input");
            }

        }
    }

    public static boolean victoryChecker(String[] gameField){
        if(gameField[0].equals(gameField[1]) && gameField[0].equals(gameField[2]) && !gameField[0].equals("*")){
            System.out.println("Symbol " + gameField[0] + " won.");
            return true;
        }
        else if(gameField[3].equals(gameField[4]) && gameField[3].equals(gameField[5]) && !gameField[3].equals("*")){
            System.out.println("Symbol " + gameField[3] + " won.");
            return true;
        }
        else if(gameField[6].equals(gameField[7]) && gameField[3].equals(gameField[8]) && !gameField[6].equals("*")){
            System.out.println("Symbol " + gameField[6] + " won.");
            return true;
        }
        else if(gameField[0].equals(gameField[3]) && gameField[0].equals(gameField[6]) && !gameField[0].equals("*")){
            System.out.println("Symbol " + gameField[0] + " won.");
            return true;
        }
        else if(gameField[1].equals(gameField[4]) && gameField[4].equals(gameField[7]) && !gameField[1].equals("*")){
            System.out.println("Symbol " + gameField[1] + " won.");
            return true;
        }
        else if(gameField[2].equals(gameField[5]) && gameField[2].equals(gameField[8]) && !gameField[2].equals("*")){
            System.out.println("Symbol " + gameField[2] + " won.");
            return true;
        }
        else if(gameField[0].equals(gameField[4]) && gameField[4].equals(gameField[8]) && !gameField[0].equals("*")){
            System.out.println("Symbol " + gameField[0] + " won.");
            return true;
        }
        else if(gameField[2].equals(gameField[4]) && gameField[4].equals(gameField[6]) && !gameField[2].equals("*")){
            System.out.println("Symbol " + gameField[2] + " won.");
            return true;
        }
        else{
            return false;
        }
    }
}
