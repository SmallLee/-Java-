package chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyInTest {
//读取键盘输入并打印
    private static BufferedReader br;

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        br = new BufferedReader(isr);
        String buffer = null;
        try {
            while ((buffer = br.readLine()) != null) {
                if (buffer.equals("exit")) {
                    System.exit(1);
                }
                System.out.println("输入的内容为： "+buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
