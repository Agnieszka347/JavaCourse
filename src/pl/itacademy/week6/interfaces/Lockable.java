package pl.itacademy.week6.interfaces;

public interface Lockable {

    boolean HAS_LOCK = true;

    void lock();

    void unlock();
}
