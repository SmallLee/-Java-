package demo;

import com.sun.org.apache.xml.internal.security.Init;
import entity.Person;

/**
 * Created by zxy on 2017/7/10.
 *
 */
public class Demo10 {
    public static void main(String[] args) {
        Person person = new Person();
        person.jump();
    }

}
/*
*构造器是一个类创建对象的基本途径，如果一个类没有构造器，系统会默认创建一个空参数
* 的构造器，如果有了，就不创建
*
* */