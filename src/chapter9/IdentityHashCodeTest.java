package chapter9;

public class IdentityHashCodeTest {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1.hashCode()==s2.hashCode());//true
        System.out.println(System.identityHashCode(s1));//1163157884
        System.out.println(System.identityHashCode(s1)== System.identityHashCode(s2));//false
        String s3 = "Java";
        String s4 = "Java";
        System.out.println(s3.hashCode()==s4.hashCode());
        System.out.println(System.identityHashCode(s3)== System.identityHashCode(s4));//true
    }
}
/*
* String类的hashCode值是根据字符串的值类决定的
* identityHashCode返回根据对象地址计算的hashCode值
* identityHashCode可以唯一标识一个对象
* */