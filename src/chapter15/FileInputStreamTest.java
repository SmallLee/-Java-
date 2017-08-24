package chapter15;


import java.io.FileInputStream;

public class FileInputStreamTest {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\JavaProject\\CrazyJava\\prop.txt");
            byte[] buffer= new byte[2048];
            int hasRead = 0;
            while ((hasRead = fileInputStream.read(buffer)) > 0) {
                System.out.println("-----------------"+hasRead);
                System.out.println(new String(buffer,0,hasRead));
            }
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
