package chapter9;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
//        根据calender获取Date对象
        Date date = calendar.getTime();
        //通过Date对象获取calender对象
        Calendar c1 = Calendar.getInstance();
        c1.setTime(date);
        Calendar c2 = Calendar.getInstance();
        System.out.println(c2.get(Calendar.YEAR));//2017
        System.out.println(c2.get(Calendar.MONTH));//7
        System.out.println(c2.get(Calendar.DAY_OF_MONTH));//15
        System.out.println(c2.get(Calendar.DATE));//15
        //设置年月日，时分秒
        c2.set(2018,4,29,13,30,30);
        System.out.println(c2.getTime());
        c2.add(Calendar.YEAR,-1);
        System.out.println(c2.getTime());//Mon May 29 13:30:30 CST 2017
    }
}
