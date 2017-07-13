package entity;

/**
 * Created by zxy on 2017/7/11.
 */
public class Duck extends Bird {
    public Duck(){
        System.out.println("duck init");
    }
    @Override
    public void fly() {
        super.fly();
        System.out.println("=====duck fly");

    }
}
//创建子类对象时，java会隐式创建父类的对象,也就是先调用父类的构造方法
