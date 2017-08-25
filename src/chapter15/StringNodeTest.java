package chapter15;


import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringNodeTest {

    private static StringReader reader;

    public static void main(String[] args) {
        String str = "从明天起做一个幸福的人\n"
                +"吃饭，睡觉，上网";
        reader = new StringReader(str);
        char[] buffer = new char[32];
        int hasRead = 0;
        try {
            while ((hasRead= reader.read(buffer)) > 0) {
                System.out.println(new String(buffer,0,hasRead));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
        //实际上初始化了一个StringBuffer
        StringWriter sw = new StringWriter(20);
        sw.write("我远离了大海\n");
        sw.write("我分享到QQ\n");
        sw.write("我打开微信\n");
        System.out.println(sw.toString());
    }
}
