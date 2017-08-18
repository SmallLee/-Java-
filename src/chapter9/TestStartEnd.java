package chapter9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestStartEnd {
    public static void main(String[] args) {
        String regStr = "Java is very easy";
        System.out.println("匹配的字符串是： "+regStr);
        Matcher matcher = Pattern.compile("\\w+").matcher(regStr);
        while (matcher.find()) {
            System.out.println(matcher.group() +"起始位置： "+matcher.start() + ""+"结束位置： "+matcher.end());
        }
    }
}
/*
* start和end获得匹配子串的起始和结束位置
* */