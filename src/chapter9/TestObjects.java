package chapter9;

import java.util.Objects;

public class TestObjects {
    static TestObject obj;
    public static void main(String[] args) {
        System.out.println(Objects.toString(obj));//null
        System.out.println(Objects.hashCode(obj));//0
        //如果为null则抛出空指针异常
        System.out.println(Objects.requireNonNull(obj));
    }
}
