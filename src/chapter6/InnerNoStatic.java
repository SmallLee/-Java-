package chapter6;

public class InnerNoStatic {
    private class Inner{
//        static {
//
//        }
//        private static int a = 12;
    }
}
/*
* 非静态内部类不能有静态属性
*
* 外部类的上一级程序单元是包，不能定义为static
* */