package chapter7;


import java.util.WeakHashMap;

public class TestWeakHashMap {
    public static void main(String[] args) {
        WeakHashMap weakHashMap = new WeakHashMap();
//        不要保存强引用，
//        String str = new String("英语");
//        weakHashMap.put(str,"及格");
        weakHashMap.put(new String("语文"),"良好");
        weakHashMap.put(new String("数学"),"优秀");
        weakHashMap.put(new String("物理"),"差");
        System.out.println(weakHashMap);//{数学=优秀, 物理=差, 语文=良好}
        weakHashMap.put("java","完美");
        System.gc();
        System.runFinalization();
        System.out.println(weakHashMap);//{java=完美}
    }
}
/*
* weakHashMap中存的是对象的弱引用，当垃圾回收器执行时，会回收键对象，然后weakHashMap会自动删除key对应
* 的键值对
* */