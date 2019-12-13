package pl.itacademy.week4;

public class Laptop {
    public boolean isSwitchOn;
    public String name;
    public int weigth;

    public String processorType;

    public boolean switchOn() {
        isSwitchOn = true;
        return isSwitchOn;
    }

    public boolean switchOff() {
        isSwitchOn = false;
        return isSwitchOn;
    }


    public void checkPower() {
        if (isSwitchOn) {
            System.out.println("Laptop power is On");
        } else {
            System.out.println("Laptop power is Off");
        }
    }

    public Laptop(String name, int weight, String processorType) {
        this.name = name;
        this.weigth = weight;
        this.processorType = processorType;
        this.isSwitchOn = false;
    }

    public Laptop() {
    }

    public static void main(String[] args) {
        Laptop macBook = new Laptop();
        macBook.name = "Mac Book Pro";
        macBook.weigth = 2;
        macBook.switchOn();
        macBook.checkPower();
        macBook.switchOff();
        macBook.checkPower();


        Laptop mBook = new Laptop();

        Laptop dell = new Laptop("Dell", 3, "Intel");
    }
}

