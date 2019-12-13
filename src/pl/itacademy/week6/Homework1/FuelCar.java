package pl.itacademy.week6.Homework1;

public class FuelCar extends Car implements Tankable, Cloneable  {

    public FuelCar(String name, Engine engine) {

        super(name, engine);
    }
    @Override
    public void tank() {

        System.out.println("Fuel car has been tanked");
    }

    @Override
    public String toString()
    {
        return "FuelCar{} " + super.toString();
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
           FuelCar cloned = (FuelCar) super.clone();
           return (FuelCar) super.clone();
    }
}
