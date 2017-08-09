package chapter8;

import java.util.Scanner;

public class ScannerKeyBoadTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        只把回车作为分隔符
//        scanner.useDelimiter("\n");
        while (scanner.hasNext()){
            System.out.println("键盘输入的是: "+scanner.next());
        }
    }
}
