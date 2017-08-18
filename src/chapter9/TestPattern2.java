package chapter9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern2 {
    public static void main(String[] args) {
        //把字符串编译成Pattren对象
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher("a_12");
        System.out.println(matcher.matches());
        //========================================
        //不能重复利用pattern对象，效率不高
        boolean b = Pattern.matches("[a-zA-Z]+", "ABC");
        System.out.println(b);//true
    }
}
/*
* Pattren是不可变类，可供多个并发线程使用
* */