package pl.itacademy.week5;

public class Dog extends Pet {

    public Dog(String name, String breed) {
        super(name, breed);
        System.out.println("we have a new dog from shelter");
    }

    @Override
    protected void makeSound() {
        super.makeSound();
        System.out.println("Wof! Wof!");
    }

    @Override
    public void chaseAnotherAnimal(Animal animal) {
        System.out.println("Dog is chasing " + animal.name);
    }
}