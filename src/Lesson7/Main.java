package Lesson7;
import java.lang.reflect.Type;
import java.util.*;

public class Main {
    public static void main(String[] Args){
//        List<String> planets = new ArrayList<>();
//        ExceptionClass notplanet = new ExceptionClass();
//
//        planets.add("Mercury");
//        planets.add("Venus");
//        planets.add("Earth");
//        planets.add("Mars");
//        planets.add("jupiter");
//        planets.add("Saturn");
//        planets.add("Uranus");
//        planets.add("Neptune");
//        planets.add("Pluto");
//
//        System.out.println(planets);
//
//        Collections.sort(planets);
//
//        System.out.println(planets);



//        int i = 0;
//        for (Object planet: planets
//        ){
//            try{
//                i++;
//                System.out.println(i + ". " + planet);
//                notplanet.someException(planet);
//                System.out.println(planet.getClass().getName());
//            }catch (java.lang.ClassCastException | My_exception e){
//            System.out.println("IT'S NOT A PLANET!!1");
//        }}


//        List<Integer> numbers = new ArrayList<>();
//
//        numbers.add(3);
//        numbers.add(7);
//        numbers.add(5);
//        numbers.add(0);
//        numbers.add(11);
//
//
//        System.out.println(numbers);
//
//        Collections.shuffle(numbers);
//
//        System.out.println(numbers);

        Books library = new Books();

        library.newBook("Witcher", "Andrzej Sapkowski", Lesson7.Type.Adventure);

        System.out.println(Arrays.toString(Lesson7.Type.values()));

    }
}
