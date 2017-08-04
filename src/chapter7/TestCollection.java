package chapter7;

import java.util.ArrayList;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList<String>();
        collection.add("a");
        collection.add("b");
        Object[] arr =  collection.toArray();
        System.out.println(collection);
    }
}
/*
* toArray，把集合变成一个Object数组
*
* toString方法源码
*   public String toString() {
        Iterator<E> it = iterator();
        if (! it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            E e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (! it.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }
* */