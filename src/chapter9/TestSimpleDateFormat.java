package chapter9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("Gyyyy年中第D天");
        String str = simpleDateFormat.format(date);
        System.out.println(str);//公元2017年中第228天
        String str2 = "2017-8-16";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(str2);
        System.out.println(d);//Wed Aug 16 00:00:00 CST 2017
    }
}
