package pl.itacademy.week6.interfaces;

public interface Windowed {
    void openWindow();

    void closeWindow();

    default void cleanWindow() {
        System.out.println("Window has been cleaned up");
        System.out.println(answerToAllTheQuestions());
        System.out.println(staticAnswerToAllTheQuestions());
    }

    static void printInterfaceName() {
        System.out.println("Windowed interface");
        System.out.println(staticAnswerToAllTheQuestions());
    }

    private int answerToAllTheQuestions() {
        return 42;
    }

    private static int staticAnswerToAllTheQuestions() {
        return 42;
    }
}
