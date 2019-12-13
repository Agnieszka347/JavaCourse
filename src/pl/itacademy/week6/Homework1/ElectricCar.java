package pl.itacademy.week6.Homework1;

public class ElectricCar extends Car implements Chargable, Cloneable {

    public ElectricCar(String name, Engine engine) {

        super(name, engine);
    }

    @Override
    public void charge() {

        System.out.println("Electric/Hybrid car has been charged");
    }
    @Override
    public String toString() {

        return "ElectricCar{} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {

        return super.equals(o);
    }

    @Override
    public int hashCode() {

        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
