package pl.itacademy.week6.interfaces;

public class Door {
    private  String colour;
    private String material;
    private Size size;
    private boolean opened;

    private static int numberOfCreatedDoors=0;

    public Door(String colour, String material, Size size) {
        this.colour = colour;
        this.material = material;
        this.size = size;
        opened = false;
        numberOfCreatedDoors++;
    }

    public static int getNumberOfCreatedDoors() {
        return numberOfCreatedDoors;
    }

    public void open () {
        opened = true;
        System.out.println("Door has been open");
    }
    public void close() {
        opened= false;
        System.out.println("Door has been close");
    }

    public boolean isOpened() {
        return opened;
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

}
