package chapter15;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    private static RandomAccessFile raf;

    public static void main(String[] args) throws IOException {
        try {
            raf = new RandomAccessFile("writer.txt","r");
            System.out.println("RandomAccessFile文件指针初始位置： "+raf.getFilePointer()+"文件长度： "+ raf.length());
            raf.seek(3);
            byte[] buf = new byte[1024];
            int hasRead = 0;
            while((hasRead = raf.read(buf)) > 0) {
                System.out.println(new String(buf,0,hasRead));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            raf.close();
        }
    }
}
/*
* utf-8中，中文占三个字节
* gbk中，占两个字节
* raf.length()指文件长度
* */