package chapter7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMapDemo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("name","zhangsan");
        hashMap.put("age","20");
        hashMap.put("address","beijing");
//        Set set = hashMap.keySet();
//        for (Object aSet : set) {
//            String key = (String) aSet;
//            System.out.println(key + "--" + hashMap.get(key));
//        }
        //===============================================
        hashMap.put("age", "4");//键相同，值覆盖
        Set<Map.Entry> entrySet = hashMap.entrySet();
        for(Map.Entry entry : entrySet){
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
        System.out.println(hashMap.containsKey("name"));//true
        System.out.println(hashMap.containsValue("20"));
        System.out.println(hashMap.isEmpty());//false
        hashMap.remove("address");
        System.out.println(hashMap.size());
        Collection values = hashMap.values();//值的集合
        System.out.println(values);//[zhangsan, 4]
    }
}
/*
* HashMap和HashTable的区别：
* HashMap是线程不安全的
* HashMap允许null键和null值
*
* 为了成功的在HashMap中存储对象，用作key的对象必须实现hashCode方法和equals方法
* */