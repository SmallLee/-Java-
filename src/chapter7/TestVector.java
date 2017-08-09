package chapter7;

import java.util.Stack;

public class TestVector {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add("Java");
        stack.add("Android");
        stack.add("MYSQL");
        System.out.println(stack);//[Java, Android, MYSQL]
//        访问第一元素，不弹出
        System.out.println(stack.peek());//MYSQL
//        访问第一个元素并弹出
        System.out.println(stack.pop());
        System.out.println(stack);//[Java, Android]
    }
}
/*
* Stack继承了Vector
* */