package pl.itacademy.week5;

public class Car {
    String name;
    String model;
    int fuelCapacity;
    int remainingFuel;
    Engine engine;

    public Car(String name, String model, int fuelCapacity, Engine engine) {
        this.name = name;
        this.model = model;
        this.fuelCapacity = fuelCapacity;
        this.engine = engine;
        this.remainingFuel = fuelCapacity;
    }
}
