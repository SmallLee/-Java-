package chapter9;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);//Tue Aug 15 10:23:05 CST 2017
        Date d2 = new Date(System.currentTimeMillis() +  100);
        System.out.println(d2);
        System.out.println(d2.compareTo(date));//1
        System.out.println(date.before(d2));//true
    }
}

/*
* Date类的很多方法都过时了，不推荐使用
* 如果要对日期进行运算，使用Calender类
*
*
* */
