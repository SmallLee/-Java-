package chapter7;

import java.util.Hashtable;
import java.util.Set;

public class TestHashTable {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put(new A(10),"Java");
        hashtable.put(new A(12),"Android");
        hashtable.put(new A(10),new B());
        System.out.println(hashtable.containsValue("测试"));//true
        System.out.println("containsKey: "+hashtable.containsKey(new A(10)));//true

        Set set = hashtable.keySet();
        for (Object obj :  set){
            System.out.println(obj+"--"+hashtable.get(obj));
        }
    }
}

/*
* 判断值是否相等的标准是判断equals方法
* 判断键是否相等的标准是判断
*
* */

class A{
    int count;
    public A(int count){
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals");
        if(obj==this){
            return true;
        }
        if(obj!=null&&obj.getClass()==A.class){
            A a = (A) obj;
            if(this.count==a.count){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode");
        return this.count;
    }
}
class B{

    @Override
    public boolean equals(Object obj) {
        return true;
    }

}
