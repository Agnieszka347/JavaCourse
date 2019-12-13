package pl.itacademy.week10;

import java.lang.annotation.*;

@Repeatable(Schedule.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TimeSlot {
    String value() default "";
    String something() default "";
    int number();
    double person();
    long test();
}
