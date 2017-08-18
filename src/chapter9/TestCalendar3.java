package chapter9;

import java.util.Calendar;

public class TestCalendar3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017,13,5);
        System.out.println(calendar.getTime());//2018-3-5
        calendar.setLenient(false);//关闭容错，超出字段范围会报错
        calendar.set(2017,13,5);
//        java.lang.IllegalArgumentException: MONTH
//        System.out.println(calendar.getTime());
    }
}
