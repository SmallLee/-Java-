package demo;

import entity.Person;

/**
 * Created by zxy on 2017/7/10.
 */
public class Student extends Person{
    private String name;
    private int age;
    private String address;
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Student(String name,int age,String address){
        this(name,age);
        this.address = address;
    }
}
