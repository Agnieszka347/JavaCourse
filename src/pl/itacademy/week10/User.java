package pl.itacademy.week10;

import java.lang.annotation.*;

@Inherited
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface User {
    String defaultUserName() default "";
}
