package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamTest {

    private static FileOutputStream fos;

    public static void main(String[] args) throws IOException {
        try {
            fos = new FileOutputStream("处理.txt");
            PrintStream printStream = new PrintStream(fos);
            printStream.print("你好吗");
            printStream.print("我很好");
            printStream.print(new PrintStreamTest());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fos.close();
        }
    }
}
/*
* 关闭处理流，系统会自动关闭被包装的节点流
*
* */