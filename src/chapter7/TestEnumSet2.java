package chapter7;


import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

public class TestEnumSet2 {
    public static void main(String[] args) {
        Collection collection= new HashSet();
        collection.add(Size.SMALL);
        collection.add(Size.BIG);
        EnumSet enumSet = EnumSet.copyOf(collection);
        System.out.println(enumSet);//[SMALL, BIG]
        collection.add(new String("疯狂Java讲义"));
        collection.add(new String("疯狂Android讲义"));
        //main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Enum
//        EnumSet enumSet2 = EnumSet.copyOf(collection);
//        System.out.println(enumSet2);
    }
}

enum Size{
    SMALL,BIG,HUGE
}
/*
* 当试图复制一个集合中的元素到EnumSet时，必须保证集合中的数据是同一个枚举类型
* */