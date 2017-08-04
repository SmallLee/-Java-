package chapter7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("疯狂Java讲义");
        arrayList.add("疯狂Android讲义");
        arrayList.add("疯狂Android讲义2");
        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()){
            String book = (String) iterator.next();
            if(book.equals("疯狂Java讲义")) {
                arrayList.remove(book);
            }
        }
        System.out.println(arrayList);
    }
}
/*
* 并发修改异常的原理：
* 在集合中有一个记录集合修改次数的变量modCount,比如对集合增加和删除了10次，那么modCount就是10
* 当调用集合的iterator时，返回了一个Itr对象，这个对象有个变量expectedModCount
*  int expectedModCount = modCount;
*  当我们调用next方法的时候回去检查这两个变量是否相等，如果迭代的过程中修改了modCount，
*  那么会导致两个值不相等，发生异常，前提是hasNext方法返回了true
*
*
*  Iterator跌带器采用的是快速失败机制，一旦发现在迭代的过程中修改了集合，就抛出异常
*  不显示修改后的结果，这样做是为了避免共享资源而引发的潜在问题
* */