package pl.itacademy.week4;

public class MobilePhone {
    private String brand;
    private String model;
    private int batteryCapacity;
    private int batteryAmount;
    private int memory;
    private int freeMemory;

    public MobilePhone(String brand, String model, int batteryCapacity, int memory) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.batteryAmount = batteryCapacity;
        this.memory = memory;
        this.freeMemory = memory;
    }

    public int charge() {
        batteryAmount = batteryCapacity;
        return batteryAmount;
    }

    public void installApplication(String applicationName, int memoryUsage) {
        if (freeMemory < memoryUsage) {
            System.out.println("There are no free memory to install " + applicationName);
        } else {
            System.out.println("Application " + applicationName + " has been installed");
            freeMemory = freeMemory - memoryUsage;
            //freeMemory -= memoryUsage;
        }
        System.out.println("Free memory left: " + freeMemory);
    }

    public void useApplication(String applicationName, int hours) {
        int powerUsage = hours * 100;
        if (batteryAmount > powerUsage) {
            batteryAmount = batteryAmount - powerUsage;
            System.out.println("Application " + applicationName + " has been used for " + hours + " hours");
            System.out.println("Remaining battery: " + batteryAmount + "mAh");
        } else if (batteryAmount > 0) {
            int realHoursOfUsage = batteryAmount / 100;
            batteryAmount = 0;
            System.out.println("Application " + applicationName + " has been used for " + realHoursOfUsage + " hours");
            System.out.println("Battery discharged!");
        } else {
            System.out.println("Battery discharged!");
        }
    }
}



