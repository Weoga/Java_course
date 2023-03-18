import java.io.Console;
import java.util.Arrays;

public class Lesson2 {

    public void main(){
        int arr1[] = new int[10];

        int arr2[];

        arr2 = new int[10];


        arr1[0] = 7;
        arr1[9] = 8;


        arr1[6] = arr1[9] - 3;
        arr1[8] = arr1[0] * 4;
        arr1[3] = arr1[3] - 5;

        System.out.println("lol");

        for (int num: arr1
             ) {
            System.out.println(num);
        }
    }
}
