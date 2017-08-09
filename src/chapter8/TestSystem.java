package chapter8;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

public class TestSystem {
    public static void main(String[] args) throws Exception {
        String path = "F:\\JavaWorkSpace\\CrazyJava\\src\\chapter8\\prop.txt";
        //获取所有的环境变量
        Map<String, String> stringMap = System.getenv();
        //获取指定环境变量的值
        String javaHome = stringMap.get("JAVA_HOME");
        System.out.println(javaHome);//D:\SorftWare\JDK
        //获取所有的系统属性
        Properties properties = System.getProperties();
        //保存属性
        properties.store(new FileOutputStream(path),"System Properties");
        //获取指定属性的值
        System.out.println(System.getProperty("os.name"));//Windows 7
    }
}
