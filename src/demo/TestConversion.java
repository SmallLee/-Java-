package demo;

/**
 * Created by zxy on 2017/7/13.
 */
public class TestConversion {
    public static void main(String[] args) {
        double d = 1.23;
        long l = (long) d;
        System.out.println(l);//1
        String s = "hello";
        System.out.println(s instanceof Object);//true
        Object o = "object";
        System.out.println(o instanceof String);
    }
}
