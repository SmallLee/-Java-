package chapter9;

import java.math.BigDecimal;

public class TestBigDecimal {
    public static void main(String[] args) {
        //浮点数会出现精度损失
//        System.out.println(0.2+0.1);//0.30000000000000004
//        System.out.println(4.015*100);//401.49999999999994
//        System.out.println(123.3/100);//1.2329999999999999
        BigDecimal b1 = new BigDecimal(0.1);
        System.out.println(b1);//0.1000000000000000055511151231257827021181583404541015625
//        推荐
        BigDecimal b2 = BigDecimal.valueOf(0.1);
        System.out.println(b2);//0.1

        BigDecimal b3 = BigDecimal.valueOf(0.2);
        System.out.println(b2.add(b3));//0.3
    }
}
/*
* 推荐使用String作为构造函数的参数，或者使用valueOf方法，这样不会有精度损失
*直接使用浮点数会发生精度损失
* */