package chapter15;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushBackTest {
    public static void main(String[] args) {
        try {
            PushbackReader pr = new PushbackReader(new FileReader("处理.txt"),60);
            char[] buf = new char[32];
            String lastContent = "";
            int hasRead = 0;
            while ((hasRead = pr.read(buf)) > 0) {
                //本次读取的内容
                String content = new String(buf,0,hasRead);
                int targetIndex = 0;
                if ((targetIndex = (lastContent + content).indexOf("我很好")) > 0) {
                    //把上次和这次读的内容推回到缓冲区
                    pr.unread((lastContent+content).toCharArray());
                    //读取指定字符串之前的内容
                    pr.read(buf,0, targetIndex);
                    System.out.println(new String(buf,0,targetIndex));
                    System.exit(0);
                } else {
                    System.out.println(lastContent);
                    lastContent = content;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
