package pl.itacademy.week6.interfaces;

public class DoorTester {
    public static void main(String[] args) {
        Door generalDoor = new Door("white", "wood", new Size(10, 20));
        LockableWindowedDoor lockableWindowedDoor = new LockableWindowedDoor("white", "wood", new Size(10, 20));
        LockableDoor lockableDoor = new LockableDoor("white", "wood", new Size(10, 20));

        System.out.println(generalDoor.getColour());
        System.out.println(Door.getNumberOfCreatedDoors());
        System.out.println(Lockable.HAS_LOCK);
        // compilation error
        // Lockable.HAS_LOCK = false;

        Door[] doors = new Door[3];
        doors[0] = generalDoor;
        doors[1] = lockableWindowedDoor;
        doors[2] = lockableDoor;

        for (int i = 0; i < doors.length; i++) {
            Door door = doors[i];
            door.open();
            door.close();
        }

        Lockable[] lockables = new Lockable[2];
        lockables[0] = lockableDoor;
        lockables[1] = lockableWindowedDoor;
        for (int i = 0; i < lockables.length; i++) {
            Lockable lockable = lockables[i];
            lockable.lock();
            lockable.unlock();
        }
    }
}