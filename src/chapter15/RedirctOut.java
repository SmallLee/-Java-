package chapter15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class RedirctOut {

    private static PrintStream pts;

    public static void main(String[] args) {
        try {
            pts = new PrintStream(new FileOutputStream("out.txt"));
            System.setOut(pts);
            //不打印在控制台，打印在指定的文件
            System.out.print("adsf");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
/*
*
*
* */