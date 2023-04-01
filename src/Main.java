import Lesson4.*;
public class Main {
    public static void main(String[] args){

        Cat my_Cat = new Cat(3,"Mein-kun");

        my_Cat.info();

        my_Cat.eat();
        my_Cat.eat("lasagna");
        my_Cat.eat(23);
    }
}