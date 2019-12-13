package pl.itacademy.week5;

public class PetTester {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom", "british");
        tom.eat();
        tom.sleep();
        tom.makeSound();
        tom.catchMouse();

        Dog killer = new Dog("Killer", "Bulldog");
        killer.eat();
        killer.sleep();
        killer.makeSound();


        System.out.println("===PETS SECTION===");
        Pet pet1 = new Cat("Tom", "British");
        Pet pet2 = new Dog("Killer", "Bulldog");
        pet1.makeSound();
        //pet1.catchMouse(); //Compilation error!
        pet2.makeSound();

        Pet[] pets = new Pet[3];
        pets[0] = pet1;
        pets[1] = tom;
        pets[2] = killer;

        for (Pet pet : pets) {
            pet.makeSound();
            playWithPet(pet);
        }

        tom.eat("Milk");

        Animal animal = new Cat("Jerry", "cat");
        animal.runAway();
        //Animal mouse = new Animal(); //compilation error


        Cat kitten = new Cat("Kitten", "Pers");
        Dog spike = new Dog("Spike", "Bulldog");
        spike.chaseAnotherAnimal(kitten);
        spike.runAway();
    }

    public static void playWithPet(Pet pet) {
        System.out.println("Playing with " + pet.name);
    }
}
