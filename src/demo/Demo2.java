package demo;

/**
 * Created by zxy on 2017/7/10.
 */
public class Demo2 {
    public static void main(String[] args) {
        //正确，系统会把56当作byte
        byte bitValue = 56;
        //错误，系统不会把整数常量变为long类型，需要后面加L或l
//        long bitValue2 = 999999999999999999;
        //浮点数使用二进制数据的科学计数法来表示，所以可能不能精确表示一个数
        float f = 3.4234326565f;
        System.out.println(f);//3.4234326
        //除数和被除数有一个是浮点数，结果就是NaN
        System.out.println(0/0.0);//NaN
    }
}
/*
//* 浮点数有两种表示方法：
1.十进制计数
2.科学计数法

    所有正无穷大都相等，NaN不和任何数相等，包括自己
* */