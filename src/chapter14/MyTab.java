package chapter14;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyTab {
    //Anotation中的成员变量以方法的形式定义
    String name();
    int age();
}
