package chapter9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattren3 {
    public static void main(String[] args) {
        Matcher matcher = Pattern.compile("\\w+").matcher("Java is very easy");
        while (matcher.find()) {
            System.out.println("group: "+matcher.group());
        }
        int i= 0;
        while (matcher.find(i)) {
            System.out.print(matcher.group() + "_");
            i ++;
        }
    }
}
/*
* find:目标字符串中是否有与正则表达式匹配的字符串
*  group：返回上一次与Pattren匹配的子串
*  find(int i):从索引i开始向下匹配
* */