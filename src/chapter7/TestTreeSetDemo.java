package chapter7;

import java.util.TreeSet;

public class TestTreeSetDemo {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new R(10));
        treeSet.add(new R(-2));
        treeSet.add(new R(-5));
        treeSet.add(new R(3));
        System.out.println(treeSet);//-5,-2,3,10
        R first = (R) treeSet.first();
        first.count = 4;
        R last = (R) treeSet.last();
        last.count = -2;
        System.out.println(treeSet);///4,-2,3,-2
        treeSet.remove(new R(-2));
        System.out.println(treeSet);
    }
}
class R implements Comparable{
    public int count;

    public R(int count){
        this.count =count;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof R){
            R r = (R) obj;
            return this.count==r.count;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        R r = (R) o;
        if (this.count > r.count) {
            return 1;
        } else if(this.count==r.count){
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "属性： "+count;
    }
}

/*
* 和HashSet类似，当存入可变对象时，如果可变对象的属性发生了变化，TreeSet再处理这些
* 对象时将非常复杂，并且容易出错，所以建议保存不可变对象
*
* */