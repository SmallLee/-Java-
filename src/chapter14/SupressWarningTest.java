package chapter14;

import java.util.ArrayList;
import java.util.List;

//关闭整个编译器里的警告
@SuppressWarnings(value = "unchecked")
public class SupressWarningTest {
    public static void main(String[] args) {
        List<String> data = new ArrayList();
        data.add("a");
    }
}
