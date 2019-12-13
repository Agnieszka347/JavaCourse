package pl.itacademy.week6.interfaces;

public class LockableWindowedDoor extends Door implements Lockable, Windowed {


    public LockableWindowedDoor(String colour, String material, Size size) {
        super(colour, material, size);
    }

    @Override
    public void lock() {
        System.out.println("Windowed door has been locked");
    }

    @Override
    public void unlock() {
        System.out.println("Windowed door has been unlocked");
    }


    @Override
    public void openWindow() {
        System.out.println("Window has been opened");
    }

    @Override
    public void closeWindow() {
        System.out.println("Window has been closed");
    }
}
