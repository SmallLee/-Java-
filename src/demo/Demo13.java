package demo;


import entity.Person;

/**
 * Created by zxy on 2017/7/10.
 */
public class Demo13 {
    public static void main(String[] args) {
        {
            int a;
            //局部变量需要初始化
//            System.out.println(a);
        }
        //无法访问
//        System.out.println(a);
        Person person = new Person();
        person.jump();
        //run无法访问，因为Demo13这个类没有和Person在一个包下面
//        person.run();
    }
}
/*
* package语句只有一句，位于第一句
* import语句是为了简化编程，
* */
