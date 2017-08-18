package chapter9;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
//        Random random = new Random();
//        System.out.println(random.nextBoolean());
//        byte[] buffer = new byte[6];
//        random.nextBytes(buffer);
//        System.out.println(Arrays.toString(buffer));//[11, -32, 97, 104, 63, 28]
//        //0-26之间的随机数
//        System.out.println(random.nextInt(26));

        Random random1 = new Random(50);
        System.out.println(random1.nextInt());
        System.out.println(random1.nextBoolean());
        System.out.println(random1.nextDouble());
        Random random2 = new Random(50);
        System.out.println(random2.nextInt());
        System.out.println(random2.nextBoolean());
        System.out.println(random2.nextDouble());
    }
}
/*
* Random使用48位的种子，如果两个类使用同一个种子，并且代码的调用顺序一致，
*那么它们产生的数字相等，也就是，Random产生的数字不是真正随机的，而是一种伪随机
* 一般推荐使用系统的当前时间作为种子
* */