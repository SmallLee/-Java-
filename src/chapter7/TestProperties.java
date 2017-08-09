package chapter7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) throws Exception {
        String path  ="D:\\JavaProject\\CrazyJava\\src\\chapter7\\info.prop";
        Properties properties = new Properties();
        properties.setProperty("name","zhangsna");
        properties.setProperty("age","12");
        properties.store(new FileOutputStream(path),"info");
        System.out.println(properties.getProperty("name"));
        properties.load(new FileInputStream(path));
        System.out.println(properties);//{age=12, name=zhangsna}
    }
}
/*
* Properties继承了HashTable
* */