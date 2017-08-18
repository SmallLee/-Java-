package chapter9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestReplace {
    public static void main(String[] args) {
        String[] msgs = {"Java has regular express in 1.4",
        "regular express in Java"};
        Pattern pattern = Pattern.compile("re\\w*");
        Matcher m = null;
        for (String msg : msgs) {
            if (m == null) {
                m = pattern.matcher(msg);
            } else {
                m.reset(msg);
            }
            System.out.println(m.replaceAll("哈哈_"));
            /**
             * Java has 哈哈_ exp哈哈_ in 1.4
             哈哈_ exp哈哈_ in Java
             */
        }
    }
}
