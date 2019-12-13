package pl.itacademy.week5;

public abstract class Animal {
    String name;
    String breed;

    public void sleep() {
        System.out.println("im going to sleep now");
    }

    public void eat() {
        System.out.println("im going to eat something");
    }

    public abstract void runAway();

    public abstract void chaseAnotherAnimal(Animal animal);
}
