package chapter8;

import java.io.IOException;

public class RuntimTest {
    public static void main(String[] args) throws IOException {
        String command = "D:\\SorftWare\\Notepad++\\Notepad++.exe";
        Runtime runtime = Runtime.getRuntime();
//        System.out.println(runtime.availableProcessors());//4
//        //获取虚拟机的最大内存,以字节为单位
//        System.out.println(runtime.maxMemory()/1024/1024);
//        System.out.println(runtime.freeMemory());
        runtime.exec(command);//启动一个进程
    }
}
