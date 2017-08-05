package chapter7;



import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new String("hello"));
        boolean flag = set.add(new String("hello"));
        System.out.println(flag);//false
        System.out.println("测试hashset");
    }
}
/*
* Set不能添加重复的元素，判断的依据是equals方法，
* 添加失败返回false
* */