package chapter8;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric3 {
    public static void main(String[] args) {
        F f = new F();
        ArrayList<String> arrayList = new ArrayList<>();
        f.test(arrayList);

        Number[] numbers = new Integer[12];
//        java.lang.ArrayStoreException: java.lang.Double
//        numbers[0] = 1.2;
    }
}

class F{
    public void test(List<?> c){
        for (int i = 0; i < c.size(); i++) {

        }
    }
}

/*
* 数组和泛型不一样，
*   Number[] numbers = new Integer[12]; 没问题
*   ArrayList<Object> arraylist = new ArrayList<String>();有问题
* */