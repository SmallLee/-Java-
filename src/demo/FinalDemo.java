package demo;

/**
 * Created by zxy on 2017/7/18.
 */
public class FinalDemo {
    public  final int a;
    {
        a = 20;
    }
    public static void main(String[] args) {
        final double d;
        d =2;
    }

}
/*
    只能在构造函数，初始化代码块中对其进行赋值
* final成员变量必须显示初始化，系统不会对其隐式初始化
* */
