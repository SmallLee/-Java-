package chapter7;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Person("haha",12));
        hashSet.add(new Person("haha",13));
        System.out.println(hashSet.contains(new Person("haha",13)));
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            Person person = (Person) iterator.next();
            System.out.println(person.age);//12
        }
    }
}
/*
要把一个对象放入到HashSet中，如果需要重写equals方法，则也应该重写hashCode方法
原则是如果两个对象equals方法返回true，那么hashCode也应返回true

* 先判断hashCode方法，不同，不同元素
* hashCode相同，equals相同，同一个元素
* hashCode相同，equals不同，把元素放在一个位置，这会导致性能下降
*
* 重写hashCode的原则：
* 当两个对象通过equals方法比较返回true时，那么hashCode也相同
* 用作equals比较标准的属性，都应该用来比较hashCode
*
*
* 通过contains判断集合中对象是否存在时，先判断hashCode方法
* hashCode方法不同，说明不存在
* hashCode犯法相同，在判断equals，equals不同，不存在
* */