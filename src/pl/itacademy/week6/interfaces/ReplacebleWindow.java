package pl.itacademy.week6.interfaces;

public interface ReplacebleWindow extends Windowed {

    void replaceWindow();

    @Override
    default void cleanWindow() {

    }
}
