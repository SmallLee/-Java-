package chapter7;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<M> treeSet = new TreeSet<M>(new Comparator<M>() {
            @Override
            public int compare(M o1, M o2) {
               return Integer.compare(o1.age,o2.age);
//                if(o1.age > o2.age){
//                    return 1;//升序
//                } else if(o1.age < o2.age){
//                    return -1;
//                }else{
//                    return 0;
//                }
            }
        });
        treeSet.add(new M(12));
        treeSet.add(new M(2));
        System.out.println(treeSet);
    }
}

class M{
    public int age;
    public M(int age){
        this.age  = age;
    }

    @Override
    public String toString() {
        return "年龄： "+this.age;
    }
}

/*
* 排序的两种方式：
* 1.对象实现Coomparable接口，重写compareTo方法
* 2.在TreeSet的构造方法里传入Comparator的实现类，重写compare方法
* */