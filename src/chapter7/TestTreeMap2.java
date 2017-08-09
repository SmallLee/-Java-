package chapter7;

import java.util.TreeMap;

public class TestTreeMap2 {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(new F(3),"java");
        treeMap.put(new F(12),"android");
        treeMap.put(new F(-2),"html");
        System.out.println(treeMap);//{-2=html, 3=java, 12=android}
        System.out.println(treeMap.firstEntry());//-2=html
        System.out.println(treeMap.lastKey());//12
        System.out.println(treeMap.higherKey(new F(3)));//12
        System.out.println(treeMap.subMap(new F(3),new F(12)));//{3=java}
    }
}

class F implements Comparable{
    public int count;

    public F(int count){
        this.count =count;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this){
            return true;
        }
        if(obj!=null && obj.getClass()==F.class){
            F f = (F) obj;
            if(this.count==f.count){
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        F f = (F) o;
        return Integer.compare(this.count,f.count);
    }

    @Override
    public String toString() {
        return String.valueOf(count);
    }
}
