package chapter15;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        System.out.println(file.getName());//.
        System.out.println(file.getParent());//null
        System.out.println(file.getAbsolutePath());//D:\JavaProject\CrazyJava\.
        //上一级路径
        System.out.println(file.getAbsoluteFile().getParent());//D:\JavaProject\CrazyJava
        File tempFile = File.createTempFile("aaa", ".txt", file);
        //JVM退出时删除文件
        tempFile.deleteOnExit();
        File newFile = new File(System.currentTimeMillis()+"");
        boolean success = newFile.createNewFile();
        System.out.println(success);//true代表创建成功
        //因为newFile已经存在，所以返回false
        boolean mkdir = newFile.mkdir();
        //当前路径下的所有文件和路径
        String[] lists = file.list();
        System.out.println("==========当前路径下的文件和路径============");
        for (String list : lists) {
            System.out.println(list);
        }
        File[] listRoots = File.listRoots();
        System.out.println("==========系统所有根路径============");
        for (File f : listRoots) {
            System.out.print(f+"\t");//C:\	D:\
        }
    }
}
