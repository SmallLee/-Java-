package chapter15.dao;

import java.io.Serializable;

public class Person implements Serializable{
    private static final long serialVersionUID = 523L;
    public String name;
    public transient int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

}
