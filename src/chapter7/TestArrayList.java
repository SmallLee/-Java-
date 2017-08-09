package chapter7;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
//        指定集合长度
        arrayList.ensureCapacity(20);//在当前集合长度基础上增加
        arrayList.trimToSize();//把集合长度调整为当前数据长度
    }
}
/*
* ArrayList和Vector都是基于数组的，默认capacity是10
*
* ArrayList和Vector的区别：
*ArrayList是线程不安全的
*
* LinkedList对于访问集合中的元素进行了优化，特别是插入，删除元素速度非常快
* 因为既实现了List，也实现了Deque接口(双向列表)
* */