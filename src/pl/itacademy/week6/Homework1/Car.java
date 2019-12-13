package pl.itacademy.week6.Homework1;

import java.util.Objects;

public class Car {

    private String name;
   private Engine engine;


    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + ", engine='" + engine + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Car))
            return false;
        Car car = (Car) o;
        return name.equals(car.name) && engine.equals(car.engine);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, engine);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Car cloned = (Car) super.clone();
        return (Car) super.clone();

        
    }

    public void tank() {
        System.out.println("Fuel car has been tanked");
    }

    public void charge() {
        System.out.println("Electric/Hybrid car has been charged");
    }
}
