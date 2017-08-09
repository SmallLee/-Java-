package chapter7;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList books = new LinkedList();
        //加入到队列尾部
        books.offer("Java");
        //将字符串入栈
        books.push("Android");
        //加入队列头部
        books.offerFirst("html");
        //访问，并不删除集合的第一个元素
        System.out.println(books.peekFirst());//html
        //集合的第一个元素出栈
        System.out.println(books.pop());//html
        //访问，删除集合的最后一个元素
        System.out.println(books.pollLast());//Java
        System.out.println(books);
    }
}

/*
* LinkedList可以作为List集合，栈，双向队列来使用
*
* */
