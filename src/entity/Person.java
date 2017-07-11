package entity;

/**
 * Created by zxy on 2017/7/10.
 */
public class Person {

    public Person(){
        System.out.println("===person");
    }

    void run(){
        System.out.println("==run");
    }
    public void jump(){
        run();
        System.out.println("===jump");
    }

}
/*
* 构造器不能用void定义，构造器的返回值类型是当前类，隐式的
* */
