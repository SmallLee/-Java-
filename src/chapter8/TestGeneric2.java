package chapter8;

public class TestGeneric2 {
    public static void main(String[] args) {
        R<String> r = new R<String>();
        r.info = "asd";
        R.age = 12;
            //系统不会生成泛型类，所以instanceof操作符后面不能有泛型
//        if(r instanceof List<String>){
//
//        }
    }
}

class R<T>{
    T info;
    static int age;
    //下面的代码编译错误
//    static T info;
//    public static void setInfo(T info){
//
//    }
}

/*
* 类的静态变量和方法在所有实例间共享，所以不能为静态变量和方法添加泛型
*
* */