package chapter15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    private static FileWriter fw;

    public static void main(String[] args) throws IOException {
        try {
            fw = new FileWriter("writer.txt");
            fw.write("静夜思\r\n");
            fw.write("窗前明月光\r\n");
            fw.write("疑是地上霜\r\n");
            fw.write("举头望明月\r\n");
            fw.write("低头思故乡\r\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fw.close();
        }
    }
}
/*
* close和flush的区别：
* 使用字符流对资源进行操作的时候，如果不调用close方法，则读取的数据在缓冲区中，要清空缓冲区的数据有两种方法
*   close
*   关闭流的同时清空缓冲区
*   flush
*   不关闭流，清空缓冲区，此方法只有Writer及其子类拥有
* */