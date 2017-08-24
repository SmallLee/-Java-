package chapter15;

import java.io.File;
import java.io.FilenameFilter;

public class FilterFileNameTest {
    public static void main(String[] args) {
        File file = new File(".");
        String[] files = file.list(new MyFileNameFilter());
        for (String name : files) {
            System.out.println(name);
        }
    }
}

class MyFileNameFilter implements FilenameFilter{

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".txt")|| new File(name).isDirectory();
    }
}