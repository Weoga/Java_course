package Lesson3;

import java.util.Objects;

public class Lesson3_Animal {
    String Name = "Default_name";
    public void setName(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }


    int Age = 0;
    public void setAge(int age) {
        Age = age;
    }
    public int getAge() {
        return Age;
    }


    String Color;
    public void setColor(String color) {
        Color = color;
    }
    public String getColor() {
        return Color;
    }


    String Type = "Generic";
    public void setType(String type) {
        Type = type;
    }
    public String getType() {
        return Type;
    }


    int Stamina = 100;
    public void setStamina(int stamina) {
        Stamina = stamina;
    }
    public int getStamina() {
        return Stamina;
    }
    public void current_stamina(){
        System.out.println("Current stamina is " + getStamina());
    }


    int Stamina_full = 120;
    public void setStamina_full(int stamina_full) {
        Stamina_full = stamina_full;
    }

    public int getStamina_full() {
        return Stamina_full;
    }


    public void info(){
        System.out.println("Yur pet is " + getName() + ", " +getAge() +" years old with color "+ getColor()+ " of type " + getType()+ " with current stamina " + getStamina()+ " and max stamina "+getStamina_full());
    }

    public void voice(){
        Stamina = Stamina-15;
        if (Objects.equals(Type, "Dog")){
            System.out.println(Name + " says \"Woof\"");
        }else if(Objects.equals(Type, "Cat")){
            System.out.println(Name + " says \"Meow :3\"");
        }else{
            System.out.println("Animal is speechless :(");
        }
        current_stamina();
    }
    public void eat(){
        Stamina = Stamina+25;
        System.out.println(Name + " eats and recovers 25 stamina");
        current_stamina();
    }
    public void sleep() {
        Stamina = Stamina_full;
        System.out.println(Name + " takes a long rest and recovers full stamina");
        current_stamina();
    }

}
