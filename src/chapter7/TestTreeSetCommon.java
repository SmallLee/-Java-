package chapter7;

import java.util.TreeSet;

public class TestTreeSetCommon {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(-3);
        treeSet.add(10);
        //已排序
        System.out.println(treeSet);//[-3, 1, 3, 10]
        System.out.println(treeSet.first());//-3
        System.out.println(treeSet.last());//10
        //到哪个元素之前的元素
        System.out.println(treeSet.headSet(4));//[-3, 1, 3]
        //从哪个元素开始的元素
        System.out.println(treeSet.tailSet(3));//[3, 10]
        //两个元素之间的子元素
        System.out.println(treeSet.subSet(-3,3));//[-3, 1]
    }
}
/*
* TreeSet实现了SortedSet，因为可以保持元素的顺序
* 采用红黑树的结构对元素尽心排序
* 两种排序方式：自然排序和定制排序，默认是自然排序
* */