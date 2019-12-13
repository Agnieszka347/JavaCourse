package pl.itacademy.week5;

public abstract class Pet extends Animal{

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void eat(String food) {
        System.out.println("Im going to eat " + food);
    }

    protected void makeSound() {
        System.out.println("Agrrrrr!");
    }

    @Override
    public void runAway() {
        System.out.println("Pet is running away!");
    }
}

