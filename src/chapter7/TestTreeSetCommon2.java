package chapter7;

import java.util.TreeSet;

public class TestTreeSetCommon2{
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        //java.lang.ClassCastException: chapter7.TestTreeSetCommon2 cannot be cast to java.lang.Comparable
        treeSet.add(new Err());
    }
}
class Err{

}
/*
* 向TreeSet中添加的元素必须实现Comparable接口，
* 实现了Comparable接口的类：
* BigDecimal,BigInteger等数值型包装类，根据数值大小
* Charactor:根据unicode值
* Boolean:true大于false
* String，根据字符串中unicode
* Date,Time：后面的时间，日期，比前面的大
*
*
* 对于TreeSet而言，判断两个对象不相等的标准是：两个对象通过equals方法返回false,或者通过compareTo没有返回0
* 即使两个对象是一个对象，TreeSet也当作二个对象
*
* 当把一个对象放入TreeSet时，当equals方法返回true时，也应该让compareTo返回0
* */