package pl.itacademy.week5;

public class Train extends PublicTransport {

    public Train(Engine engine, int numberOfWheels, int numberOfSeats) {
        super(engine, numberOfWheels, numberOfSeats);

    }
    private int numberOfCarriage;

    public Train(Engine engine, int numberOfWheels, int numberOfSeats, int numberOfCarriage) {
        super(engine, numberOfWheels, numberOfSeats);
        this.numberOfCarriage = numberOfCarriage;
    }

}
