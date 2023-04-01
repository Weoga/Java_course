package Lesson2;

import java.util.Arrays;
import java.util.Scanner;
public class Lesson2 {

    public void arrays(String[] args){
        int arr1[] = new int[10];

        int arr2[];

        arr2 = new int[10];


        arr1[0] = 7;
        arr1[9] = 8;


        arr1[6] = arr1[9] - 3;
        arr1[8] = arr1[0] * 4;
        arr1[3] = arr1[3] - 5;

//        System.out.println("lol");

//        for (int num: arr1
//             ) {
//            System.out.println(num);
//        }
//        System.out.println("Second way");
//
//        for (int i = 0; i < arr1.length; i++){
//            System.out.println(arr1[i]);
//        }

//        System.out.println("lenght");
//        System.out.println(arr1.length);

        Scanner input_scan = new Scanner(System.in);

        int numbers[] = new int[5];


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input number n" + (i+1));
            boolean not_parsed = true;
            while (not_parsed) {
                try {
                    String input = input_scan.next();
                    int input_fancy = Integer.parseInt(input);
                    numbers[i] = input_fancy;
                    not_parsed = false;
                } catch (java.lang.NumberFormatException e) {
                    System.out.println("I NEED NUMBERS");
                }
            }
        }
        for (int number: numbers
            ) {
            System.out.println(number);
                }
    }


    public void massive_2d(){
        int test[][] = new int[2][2];
        int arr[][] = new int[][] {{1,3},{2,4}};

        System.out.println(arr[1][0]);
        for (int i =0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }
    }

    public Scanner input_scan = new Scanner(System.in);

    public void homework(){
        int numbers[] = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input number n" + (i+1));
            boolean not_parsed = true;
            while (not_parsed) {
                try {
                    String input = input_scan.next();
                    int input_fancy = Integer.parseInt(input);
                    numbers[i] = input_fancy;
                    not_parsed = false;
                } catch (java.lang.NumberFormatException e) {
                    System.out.println("I NEED NUMBERS");
                }
            }
        }
//        for (int number: numbers
//        ) {
//            System.out.println(number.mi);
//        }
        System.out.println(Arrays.stream(numbers).min());
        System.out.println(Arrays.stream(numbers).max());
    }
}

