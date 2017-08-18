package chapter9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMatchCase {
    public static void main(String[] args) {
        String[] mails = {"123@12.com","ad@1.cn","adf@12.xx","qw@lx.gov"};
        String mailRegStr = "\\w{3,20}@\\w+\\.(com|cn|gov)";
        Pattern pattern = Pattern.compile(mailRegStr);
        Matcher matcher= null;
        for(String mail : mails) {
            if (matcher == null) {
                matcher= pattern.matcher(mail);
            } else {
                //将matcher对象应用于新的字符串
                matcher.reset(mail);
            }
            if (matcher.matches()) {
                System.out.println(mail+ " 合法的邮箱");
            } else {
                System.out.println(mail+"  不合法邮箱");
            }
        }
    }
}
