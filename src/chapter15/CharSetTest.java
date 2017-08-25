package chapter15;

import java.nio.charset.Charset;
import java.util.SortedMap;

public class CharSetTest {
    public static void main(String[] args) {
        //获取当前JDK支持的所有字符集
        SortedMap<String, Charset> availableCharsets = Charset.availableCharsets();
        for (String key : availableCharsets.keySet()) {
            System.out.println(key+"--"+availableCharsets.get(key));
        }
        Charset charset = Charset.forName("UTF-8");
    }
}
