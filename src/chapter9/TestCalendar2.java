package chapter9;

import java.util.Calendar;

public class TestCalendar2 {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        Calendar c3 = Calendar.getInstance();
        Calendar c4 = Calendar.getInstance();
        //==============================add
        c1.set(2016,5,23);
        c1.add(Calendar.MONTH,8);
        System.out.println(c1.getTime());//2017-2-23
        c2.set(2016,5,31);
        c2.add(Calendar.MONTH,8);
        System.out.println(c2.getTime());//2017-3-1
        c3.set(2016,5,23);
        c3.roll(Calendar.MONTH,8);
        System.out.println(c3.getTime());//2016-2-23
        c4.set(2016,5,31);
        c4.roll(Calendar.MONTH,8);
        System.out.println(c4.getTime());//2016-5-1
    }
}
/*
* add和roll的区别：
* add:
* 1.当被修改的字段超出范围时，会向上一级进位
*   2.如果下一级的字段也需要改变，那么该字段会修正变化到最小的值
*
*   roll不会向上一级进位，下一级的处理和add一样
* */