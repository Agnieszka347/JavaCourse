package pl.itacademy.week8;

public enum Planet {

    EARTH(6371),
    VENUS(6051.8),
    MERCURY(2439.7);

    private double radius;

    Planet(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getEquatorLength() {
        return radius * 2 * Math.PI;
    }
}
