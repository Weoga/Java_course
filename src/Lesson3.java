public class Lesson3 {
    public static void lesson(){
        Lesson3_Animal Dog = new Lesson3_Animal();
//
        Lesson3_Animal Cat = new Lesson3_Animal();

        Lesson3_Animal Croco = new Lesson3_Animal();


        Dog.setName("Doggo");
        Cat.setName("Garfield");
        Dog.setAge(3);
        Cat.setAge(5);
        System.out.println("--------");

        Croco.voice();
//

        Lesson3_Calculator calc = new Lesson3_Calculator();


        boolean ask_for_input = calc.ask();

        int a = 23;
        int b = 69;
        if (ask_for_input) {
            System.out.println("Input number num1");
            a = calc.parse();
            System.out.println("Input number num2");
            b = calc.parse();
        }

        int sum = calc.calc(a, b);

        System.out.println("Sum is "+ sum);


    }
}
