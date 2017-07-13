package demo;

/**
 * Created by zxy on 2017/7/13.
 */
public class Ｄemo20 {
    public static void main(String[] args) {
        System.out.println(new Test().a);//9
    }
}
class Test{

    {
        System.out.println("common");
        a = 4;
    }
    static{
        System.out.println("static");
    }
    int a = 10;
}
/*
* 当Java创建对象时，系统先为所有的实例属性分配内存，接着对这些实例属性进行初始化
* 顺序是：先执行初始化块或者声明属性时的初始值，再执行构造器里的初始值
*
* 静态初始化块总是比普通初始化块先执行
* 静态初始化快不能初始化实例属性
* */