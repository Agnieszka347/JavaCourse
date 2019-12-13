package pl.itacademy.week5;

public class Bus extends PublicTransport {

    int horsePower;
    public Bus(Engine engine, int numberOfWheels, int numberOfSeats) {
        super(engine, numberOfWheels, numberOfSeats);
    }

    public Bus(Engine engine, int numberOfWheels, int numberOfSeats, int horsePower) {
        super(engine, numberOfWheels, numberOfSeats);
        this.horsePower = horsePower;
    }

    @Override
    public void stops() {
        super.stops();
        System.out.println("Press the button");
    }
}