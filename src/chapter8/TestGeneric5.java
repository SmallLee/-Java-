package chapter8;


import java.io.Serializable;

public class TestGeneric5<T extends Number> {
    public static void main(String[] args) {
        TestGeneric5<Integer> a = new TestGeneric5<Integer>();
        TestGeneric5<Double> b = new TestGeneric5<Double>();
//        编译出错
//        TestGeneric5<String> c = new TestGeneric5<String>();
    }
}
//设定多个上线，至多一个父类，可以多个接口，接口上限必须位于类接口之后
class Orange<T extends Number & Serializable>{

}
/*
* 类型形参的上限
* */