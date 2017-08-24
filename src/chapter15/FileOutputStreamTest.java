package chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    private static FileInputStream fileInputStream;
    private static FileOutputStream fos;

    public static void main(String[] args) throws IOException {
        try {
            fileInputStream = new FileInputStream("prop.txt");
            fos = new FileOutputStream("D:\\JavaProject\\CrazyJava\\src\\des2.txt");
            byte[] buffer= new byte[1024];
            int hasRead = 0;
            while ((hasRead = fileInputStream.read(buffer)) > 0) {
                fos.write(buffer,0,hasRead);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fileInputStream.close();
            fos.close();
        }
    }
}
