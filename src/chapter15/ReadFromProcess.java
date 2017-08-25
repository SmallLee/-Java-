package chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromProcess {

    private static BufferedReader br;

    public static void main(String[] args) {
        try {
            //运行javac命令，返回运行该命令的子进程
            Process process = Runtime.getRuntime().exec("javac");
            br = new BufferedReader(new InputStreamReader(process.getErrorStream(),"gbk"));
            String buff = null;
            while ((buff = br.readLine()) != null) {
                System.out.println(buff);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
