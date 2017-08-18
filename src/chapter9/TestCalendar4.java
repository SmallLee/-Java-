package chapter9;

import java.util.Calendar;

public class TestCalendar4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017,7,31);
        calendar.set(Calendar.MONTH,8);
//        System.out.println(calendar.getTime());//2017-10-1
        calendar.set(Calendar.DATE,5);
        System.out.println(calendar.getTime());//2017-9-5
    }
}
