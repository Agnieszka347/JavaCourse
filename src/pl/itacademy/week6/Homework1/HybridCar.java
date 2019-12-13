package pl.itacademy.week6.Homework1;

public class HybridCar extends Car implements Tankable, Chargable, Cloneable {


    public HybridCar(String name, Engine engine) {

        super(name, engine);
    }

    @Override
    public void charge() {

        System.out.println("Electic/Hybrid car has been charged");
    }

    @Override
    public void tank() {

        System.out.println("Hybrid Car has been tanked");
    }

    @Override
    public String toString() {

        return "HybridCar{} " + super.toString();
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
