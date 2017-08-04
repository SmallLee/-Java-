package chapter6;

public class Demo3 {
    public static void main(String[] args) {
        Integer a = new Integer(6);
        Integer b = Integer.valueOf(6);
        Integer c = Integer.valueOf(6);
        System.out.println(a==b);//false
        System.out.println(b==c);//true
    }
}

/*
* Integer的valueOf创建的对象会缓存起来
* */