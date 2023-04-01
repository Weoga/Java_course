package Lesson4;

public class Lesson4_Animal {
    private String Genus;
    private int NumberOfLegs;
    private int Age;


    public void setGenus(String genus) {
        this.Genus = genus;
    }

    public String getGenus() {
        return Genus;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public int getAge() {
        return Age;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.NumberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return NumberOfLegs;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void drink(){
        System.out.println("Animal is peacefully drinking");
    }

    public Lesson4_Animal(String genus, int numberOfLegs, int age){
        this.Genus = genus;
        this.NumberOfLegs = numberOfLegs;
        this.Age = age;
    }
}
