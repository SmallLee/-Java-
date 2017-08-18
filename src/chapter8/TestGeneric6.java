package chapter8;

import java.util.ArrayList;

public class TestGeneric6 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Object> b = new ArrayList<Object>();
//        编译出错
//        test(a,b);
        test2(a,b);
    }

    static <T> void test(ArrayList<T> c1, ArrayList<T> c2){

    }
//    前一个是后一个的子类
    static <T> void test2(ArrayList<? extends T> c1, ArrayList<T> c2){

    }

}
