package pl.itacademy.week5;

public class Engine {
    String name;
    boolean isStarted;
    int horsePower;
    int capacity;

    public Engine(String name, int horsePower, int capacity) {
        this.name = name;
        this.isStarted = false;
        this.horsePower = horsePower;
        this.capacity = capacity;
    }
}

