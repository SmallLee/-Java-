package chapter7;

import java.util.Hashtable;
import java.util.Iterator;

public class TestHashTableErr {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put(new C(12),"Android");
        hashtable.put(new C(10),"Java");
        System.out.println(hashtable);
        Iterator iterator = hashtable.keySet().iterator();
        C first = (C) iterator.next();
        first.count = 12;
//        只能删除属性没被该国的
        System.out.println(hashtable.remove(new C(12)));//Android
        System.out.println(hashtable);//{chapter7.C@a=Java}
//        只能访问属性没被改过的
        System.out.println(hashtable.get(new C(12)));//null
        System.out.println(hashtable.get(new C(10)));//null
    }
}

class C {
    int count;
    public C(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == C.class) {
            C c = (C) obj;
            if (this.count == c.count) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.count;
    }
}
