package pl.itacademy.week5;

public class Cat extends Pet {

    public Cat(String name, String breed) {
        super(name, breed);
        System.out.println("new cat born");
    }

    @Override
    protected void makeSound() {
        System.out.println("Meu-Meu");
    }

    public void catchMouse() {
        System.out.println("mouse has been catch!");
    }

    @Override
    public void chaseAnotherAnimal(Animal animal) {
        System.out.println("Cat is chasing " + animal.name);
    }
}
