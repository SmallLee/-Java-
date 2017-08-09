package chapter7;

import java.util.Arrays;
import java.util.List;

public class FixedSizeList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Android");
        System.out.println(list);
        //长度固定，不能添加和删除元素
//        list.add("HTML");//java.lang.UnsupportedOperationException
    }
}
/*
* Arrays.asList返回的List是Arrays内部的一个类，长度是固定的
* */