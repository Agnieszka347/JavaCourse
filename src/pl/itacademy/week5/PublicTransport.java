package pl.itacademy.week5;

import org.w3c.dom.ls.LSOutput;

public class PublicTransport extends Vehicle {

    private PublicTransport(Engine engine, int numberOfWheels) {
        super(engine, numberOfWheels);
    }

    private int numberOfSeats;

    public PublicTransport(Engine engine, int numberOfWheels, int numberOfSeats) {
        super(engine, numberOfWheels);
        this.numberOfSeats = numberOfSeats;
    }
    public void stops () {
        System.out.println("Please, press the button, if you want to get off");
    }

}
