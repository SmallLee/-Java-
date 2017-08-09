package chapter7;


import java.util.LinkedHashSet;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new String("疯狂Java讲义"));
        linkedHashSet.add(new String("疯狂Android讲义"));
        linkedHashSet.add(new String("疯狂Ajax讲义"));
        System.out.println(linkedHashSet);//[疯狂Java讲义, 疯狂Android讲义, 疯狂Ajax讲义]
    }
}



/*
* LinkedHashSet使用链表维护元素的顺序，因此性能略低于Set,但是迭代访问Set里的元素性能比较好
*   添加和取出顺序一样
* */