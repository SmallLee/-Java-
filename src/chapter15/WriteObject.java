package chapter15;


import chapter15.dao.Person;

import java.io.*;

public class WriteObject {

    private static ObjectOutputStream obs;

    public static void main(String[] args) {
        try {
            obs = new ObjectOutputStream(new FileOutputStream("object.txt"));
            Person p = new Person("goku",100);
            obs.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                obs.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //反序列化
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));
            Person p = (Person) ois.readObject();
            System.out.println("Person的姓名是： "+p.name+",年龄是： "+p.age);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
/*
*反序列化恢复java对象时，必须提供该java对象对应的class文件
*反序列化无需通过对象的构造器初始化对象，
* 如果序列化写入多个对象，反序列化时要按照写入的顺序
*如果一个可序列化类有多个父类，则该类的所有父类要么是可序列化的，要么有无参数的构造函数
*
* 反序列化恢复某个子类的时候，需要恢复其关联的父类实例，要么使用反序列机制，要么通过父类无参构造函数
*
*
* Java采用的序列化算法：
* 所有保存到磁盘中的对象都有一个序列化编号
*程序视图序列化一个对象时，先检查对象是否被序列化过，只有未序列化过，才会转化为字节序列输出
* 如果某个对象是已经序列化的，程序只是输出一个序列化编号，而不是再次重新序列话
*
*
* 序列化可变对象时，即使对象的属性改变了，也不会重新序列化
* */