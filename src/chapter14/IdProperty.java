package chapter14;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
public @interface IdProperty {
    String column();
    String type();
    String generator();
}
