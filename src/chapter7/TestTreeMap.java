package chapter7;

import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(3,"name");
        treeMap.put(1,"age");
        treeMap.put(10,"gender");
        System.out.println(treeMap);//{1=age, 3=name, 10=gender}
    }
}
/*
* TreeMap的所有key必须实现comparable接口，而且应该是同一雷对象，否则会抛出ClassCastException
*
* TreeMap判断两个对象是否相等，equals返回true,compareTo返回0
* */