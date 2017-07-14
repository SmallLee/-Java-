package demo;

/**
 * Created by zxy on 2017/7/14.
 */
public class Demo22 {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true
    }
}
