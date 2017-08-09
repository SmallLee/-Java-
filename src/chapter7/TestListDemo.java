package chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListDemo {
    public static void main(String[] args) {
        List  list = new ArrayList();
        list.add("Java");
        list.add("Android");
        list.add("Html");
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
            listIterator.add("MYSQQL");
        }
        //反向迭代，必须要先正向，再反向，才能迭代数据
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
/*
* listIterator可以反向迭代
* 可以在迭代的过程中添加元素，Set的迭代器只能删除元素
*
* */