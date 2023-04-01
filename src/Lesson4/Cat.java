package Lesson4;

public final class Cat extends Lesson4_Animal{
    private String Breed;


    public void setBreed(String breed) {
        Breed = breed;
    }

    public String getBreed() {
        return Breed;
    }

    public void info(){
        System.out.println("Your cat is a cat of "+getBreed()+" breed, "+getAge()+" years old, with "+getNumberOfLegs()+" legs");
    }

    public Cat(int age, String breed){
        super("feline", 4, age);
        setBreed(breed);
    }

    @Override
    public void eat(){
        System.out.println("Yor cat is eating some fish");
    }

    public void eat(String food){
        System.out.println("Yor cat is eating " + food);
    }

    public void eat(int numberOfFish){
        System.out.println("Yor cat is eating "+ numberOfFish +" fish");
    }
}
