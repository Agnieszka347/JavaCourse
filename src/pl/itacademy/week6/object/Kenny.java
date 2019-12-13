package pl.itacademy.week6.object;

public class Kenny extends Person {
    private int number;
    public Kenny(String firstName, String lastName, int number) {
        super(firstName, lastName);
        this.number = number;
    }

    //NEVER do it at home!!
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Oh no! They kill Kenny! You are busters! " + number);
    }
}
