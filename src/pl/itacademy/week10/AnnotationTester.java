/*package pl.itacademy.week10;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationTester {

    @SuppressWarnings("all")
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        String test = "test";

        Animal animal = new Animal();
        animal.sleep(2);
        animal.sleep2hours();

        printItems(new Object(), new Object());

        Person jan = new Person("jan");
        Student ola = new Student("Ola", "it-academy");

        Class<Person> personClass = Person.class;
        Annotation[] personAnnotations = personClass.getAnnotations();
        for (Annotation annotation : personAnnotations) {
            if (annotation instanceof User) {
                User userAnnotation = (User) annotation;
                System.out.println(userAnnotation.defaultUserName());
            }
        }
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            if(method.getParameterCount() == 0
                    && !method.getName().equals("wait")
                    && !method.getName().equals("notifyAll")
                    && !method.getName().equals("notify")) {
                System.out.println(method);
                System.out.println(method.invoke(jan));
            }
        }

        Annotation[] studentAnnotations = ola.getClass().getAnnotations();
        for (Annotation annotation : studentAnnotations) {
            if(annotation instanceof User) {
                User userAnnotation = (User) annotation;
                System.out.println(userAnnotation.defaultUserName());
            } else if (annotation instanceof RegisteredUser) {
                RegisteredUser registeredUser = (RegisteredUser) annotation;
                System.out.println(registeredUser.userName());
                System.out.println(registeredUser.defaultPassword());
            }
        }

        Lesson lesson = new Lesson();
        for(Annotation annotation : lesson.getClass().getAnnotations()){
            TimeSlot[] timeSlots = ((Schedule) annotation).value();
            for (TimeSlot timeSlot : timeSlots) {
                System.out.println(timeSlot.value());
            }

        }

    }

    private static void printItems(Object... items) {
        for (Object item : items) {
            System.out.println(item);
        }
    }
}*/

