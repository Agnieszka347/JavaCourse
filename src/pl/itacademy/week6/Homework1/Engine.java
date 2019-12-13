package pl.itacademy.week6.Homework1;

import java.util.Objects;

public class Engine implements Cloneable{
    private String name;
    private int power;

    public Engine(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" + "name='" + name + '\'' + ", power=" + power + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Engine))
            return false;
        Engine engine = (Engine) o;
        return power == engine.power && Objects.equals(name, engine.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, power);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Engine cloned = (Engine) super.clone();
        cloned.name = "cloned_" + name;
        cloned.power = Integer.parseInt("cloned_" + power);
        return (Engine) super.clone();
    }
}
