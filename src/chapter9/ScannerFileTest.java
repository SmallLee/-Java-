package chapter9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileTest {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "F:\\JavaWorkSpace\\CrazyJava\\src\\chapter8\\TestMainDemo.java";
        Scanner scanner = new Scanner(new File(path));
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
/*
* 读取文件
* */