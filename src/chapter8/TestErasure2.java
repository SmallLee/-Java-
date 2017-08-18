package chapter8;

import java.util.ArrayList;
import java.util.List;

public class TestErasure2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(4);
        List list2 = list;
        List<String> list3 = list2;
//        java.lang.Integer cannot be cast to java.lang.String
        System.out.println(list3.get(0));

        //=================================================
//        等同下面的代码
//        List<Integer> ls = new ArrayList<Integer>();
//        ls.add(5);
//        ls.add(4);
//        System.out.println((String) ls.get(0));
    }
}
