package Lesson9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lesson9_Main {
    public static void main(String[] args){

        Scanner letter = new Scanner(System.in);

        List<String> games = new ArrayList<>();
        games.add("counter strike".toLowerCase());
        games.add("world of tanks".toLowerCase());
        games.add("Skyrim".toLowerCase());

        List<String> food = new ArrayList<>();
        food.add("pizza".toLowerCase());
        food.add("soup".toLowerCase());
        food.add("burger".toLowerCase());

        List<String> music = new ArrayList<>();
        music.add("jazz".toLowerCase());
        music.add("rock".toLowerCase());
        music.add("blues".toLowerCase());

        List<String> animals = new ArrayList<>();
        animals.add("lion".toLowerCase());
        animals.add("toad".toLowerCase());
        animals.add("duck".toLowerCase());

        String gameWord = "";

        while (true){
            System.out.print("\n");
            System.out.println("Choose a category:");
            System.out.println("1. Games");
            System.out.println("2. Music");
            System.out.println("3. Food");
            System.out.println("4. Animals");
            System.out.println("-------------");
            System.out.println("Enter a number corresponding to a category, please");

            String category = letter.next();
            Random rand = new Random();

            switch (category){

                case "1": gameWord = games.get(rand.nextInt(games.size())); break;
                case "2": gameWord = music.get(rand.nextInt(music.size())); break;
                case "3": gameWord = food.get(rand.nextInt(food.size())); break;
                case "4": gameWord = animals.get(rand.nextInt(animals.size())); break;
                default: System.out.println("Unknown value, proceed to try again");
            }
            if (!gameWord.equals("")){
                break;
            }
        }

        List<Character> hiddenWord = new ArrayList<>();
        List<Character> usedLetters = new ArrayList<>();

        for (int i=0; i< gameWord.length(); i++){
            if (gameWord.charAt(i) == ' '){
                hiddenWord.add(' ');
            }

        }
    }
}
