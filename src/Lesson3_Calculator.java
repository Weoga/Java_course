import java.util.Arrays;
import java.util.Scanner;

public class Lesson3_Calculator {
    Scanner input_scan = new Scanner(System.in);



    public boolean ask(){
        boolean ans;
        String input = input_scan.next();
        if (input == "y"){
            ans = true;
        }else{
            ans = false;
        }
        return ans;
    }


    public int parse() {
        boolean not_parsed = true;
        while (not_parsed) {
            try {
                String input = input_scan.next();
                int input_fancy = Integer.parseInt(input);
                not_parsed = false;
                return input_fancy;
            } catch (java.lang.NumberFormatException e) {
                System.out.println("I NEED NUMBERS");
            }
        }

        return 0;
    }

    boolean work = true;
    public int calc(int a, int b){
            return a+ b;
    }
}
