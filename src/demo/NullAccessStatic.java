package demo;

/**
 * Created by zxy on 2017/7/18.
 */
public class NullAccessStatic {
    public static void test(){
        System.out.println("静态方法");
    }
    public static void main(String[] args){
        NullAccessStatic nas = null;
        //当使用实例来访问类成员时，实际依然是委托给类成员访问，因此即使某个实例为null，
        //也可以访问类成员
        nas.test();
    }
}
/*
* 类成员不能访问实例成员
* */

