package chapter8;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class TestGeneric7 {
    public static void main(String[] args) {
        ArrayList<Number> a1 = new ArrayList<Number>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        //编译出错
//        Integer last = copy(a1,a2);
        Integer last = copy2(a1,a2);
        TreeSet<String> treeSet = new TreeSet<String>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
    }

    static <T> T copy(Collection<T>  c1,Collection<? extends T> c2){
        T last = null;
        for(T ele : c2) {
            last = ele;
            c1.add(ele);
        }
//        返回最有一个被复制的元素
        return last;
    }
//    通配符下限
    static <T> T copy2(Collection<?  super T>  c1,Collection<T> c2){
        T last = null;
        for(T ele : c2) {
            last = ele;
            c1.add(ele);
        }
//        返回最有一个被复制的元素
        return last;
    }
}
/*
* 泛型方法和类型通配符的区别：
*1.在不同的调用点需要传入不同的类型时，应该使用通配符
*2.方法的参数之前有类型依赖关系，或者参数和返回值有类型依赖关系，应该使用泛型方法
*
* */