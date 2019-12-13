package pl.itacademy.week5;

public class CarTester {
    public static void main(String[] args) {
        Engine engine = new Engine("diesel", 150, 2000);
        Car car = new Car("WV", "Passat", 40, engine);
    }
}
