package chapter14;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited //注解能够继承
public @interface Inheritable {
}
