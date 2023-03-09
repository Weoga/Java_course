import java.util.Scanner;

public class Sum {
    public Scanner Input = new Scanner(System.in);
    public void plus(){

        System.out.println("Enter first number");
        String  input1 = Input.nextLine();
        int num1 = Integer.parseInt(input1);
        System.out.println("Enter second number");
        String  input2 = Input.nextLine();
        int num2 = Integer.parseInt(input2);
        int sum = num1 + num2;
        System.out.println("Sum is " + sum);
    }

}
