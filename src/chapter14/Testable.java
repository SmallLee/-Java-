package chapter14;


import java.lang.annotation.*;

//该注解用于标明方法是否可测试
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Testable {
}
