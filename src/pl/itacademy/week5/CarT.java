package pl.itacademy.week5;

public class CarT extends Vehicle {
    private int numberOfSeats;

    public CarT(Engine engine, int numberOfWheels, int numberOfSeats) {
        super(engine, numberOfWheels);
        this.numberOfSeats = numberOfSeats;
    }
}
