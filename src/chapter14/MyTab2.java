package chapter14;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyTab2 {
    //指定默认值
    public String name() default "a";
    int age() default 0;
}
