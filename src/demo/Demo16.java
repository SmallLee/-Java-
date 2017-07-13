package demo;

import entity.Child;
import entity.Parent;

/**
 * Created by zxy on 2017/7/11.
 */
public class Demo16 {
    public static void main(String[] args) {
        //多态
        Parent p = new Child();
        System.out.println(p.age);
        p.eat();

        //p的编译类型是Parent，而Parent中没有study方法，所以编译报错
//        p.study();
    }
}
//不同包中默认访问修饰符修饰的变量无法访问
//成员变量和静态方法看左边，其他方法编译看左边，运行看右边

