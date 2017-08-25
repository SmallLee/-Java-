package chapter15;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RedirctIn {


    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("处理.txt");
            //将标准输入流定位到fis
            System.setIn(fis);
            Scanner sc = new Scanner(System.in);
            sc.useDelimiter("\n");
            while (sc.hasNext()) {
                System.out.println("键盘的输入是： "+sc.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
/*
*
*
* */