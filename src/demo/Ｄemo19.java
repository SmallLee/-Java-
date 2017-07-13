package demo;

/**
 * Created by zxy on 2017/7/13.
 */
public class Ｄemo19 {
    public static void main(String[] args) {
        new Person();
    }

}
class Person{
    static{
        System.out.println("1");
    }
    static {
        System.out.println(2);
    }
    public  Person(){
        System.out.println("构造函数");
    }
}
/*
* 先执行初始化块，然后执行构造函数
* 有多个初始化块，按顺序执行
* */