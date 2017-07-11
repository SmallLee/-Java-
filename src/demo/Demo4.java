package demo;

/**
 * Created by zxy on 2017/7/10.
 */
public class Demo4 {
    public static void main(String[] args) {
        float f = 3.98f;
        //把浮点数转为int类型，直接截断小数
        int a = (int) f;
        System.out.println(a);//3
        int b = 233;
        byte c = (byte) b;
        System.out.println("======"+c);//-23
    }
}
/*
* 类型自动提升
* 1.byte,short,char自动提升为int
* 2.
* */
