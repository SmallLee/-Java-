package chapter8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericMethod {
    public static void main(String[] args) {
        String[] str = {"a","b","c"};
        List<String> strList = new ArrayList<String>();
        arrayToCollection(str,strList);
    }
//    将数组元素复制到集合中
    static <T> void arrayToCollection(Object[] array, Collection<T> collection){

    }
}
