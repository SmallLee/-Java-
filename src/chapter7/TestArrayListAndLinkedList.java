package chapter7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestArrayListAndLinkedList {
    public static void main(String[] args) {
        String[] test = new String[900000];
        for (int i = 0; i < 900000; i++) {
            test[i] = String.valueOf(i);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 900000; i++) {
            arrayList.add(test[i]);
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 900000; i++) {
            linkedList.add(test[i]);
        }
        long start = System.currentTimeMillis();
        for (Iterator it = arrayList.iterator(); it.hasNext();){
            it.next();
        }
        System.out.println("迭代ArrayList的时间是： "+(System.currentTimeMillis()-start));
        start = System.currentTimeMillis();
        for (Iterator it = linkedList.iterator(); it.hasNext();){
            it.next();
        }
        System.out.println("迭代LinkedList的时间是： "+(System.currentTimeMillis()-start));
    }
}


/*
*如果需要遍历List集合，对于ArrayList应该使用随机访问方法，对LinkedList应该使用迭代器
*如果需要经常插入，删除，就用LinkedList
* */